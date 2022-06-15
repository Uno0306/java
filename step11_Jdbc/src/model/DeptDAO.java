package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import model.domain.DeptDTO;
import model.domain.EmpDTO;
import util.DButil;

public class DeptDAO {

	// step01 *
	// Driver loading
//	static {
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		}
//	}
	
//-----------------------------------------------------------------------------------------------------------------------------------//
	
	// ver1 - fail
//	public static Statement dbConnection(Statement stmt) throws SQLException{
	// ver2
//	public static Statement dbConnection() throws SQLException{
	// ver3
//	public static ResultSet dbConnection(Connection conn, Statement stmt, ResultSet rset, String query) throws SQLException{
	public static ResultSet dbConnection(Connection conn, PreparedStatement pstmt, ResultSet rset, String query) throws SQLException{
		// verd1
		// Connection conn = null;
		//Statement stmt = null;
		try {
			// verd2
			// conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/scott", "scott", "tiger");
			// stmt = conn.createStatement();
			// rset = stmt.executeQuery(query);
			
			// verd3
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/scott", "scott", "tiger");
			pstmt = conn.prepareStatement(query);
			rset = pstmt.executeQuery(query);
			
			return rset;
		}finally {
		}
	}
	
	public static void dbClose(Connection conn, Statement stmt, ResultSet rset) throws SQLException{
		try {
		}finally {
			rset.close();
			stmt.close();
			conn.close();
		}
	}
//-----------------------------------------------------------------------------------------------------------------------------------//	
	
	
	// 모든 부서 검색 메소드
	// Query : "SELECT * FROM dept"
	public static ArrayList<DeptDTO> getAllDept() throws SQLException {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rset =null;
		ArrayList<DeptDTO> allData = null;
		
		try {
			// step02 *
			// DB Connection
			// ipAddress, DB name, Account name/password, ...
//			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/scott", "scott", "tiger");
			conn = DButil.getConnection();
			// step03
			// SQL 문장 객체 
			stmt = conn.createStatement();
			
			// step04
			// SQL 문장 객체 실행
			rset = stmt.executeQuery("SELECT * FROM dept");
			
			// step05
			// Data 활용
			allData = new ArrayList<DeptDTO>();
			while(rset.next()) {
				allData.add(new DeptDTO(rset.getInt("deptno"), rset.getString("dname"), rset.getString("loc")));
			}
			conn.setAutoCommit(false);
			conn.commit();
			
			// step06 *
			// DB 종료
		} finally {
//			rset.close();
//			stmt.close();
//			conn.close();
			DButil.close(rset, stmt, conn);
		}
		return allData;
	}
	
	
	// 부서 이름 검색 메소드
	public static DeptDTO getDept(String dname) throws SQLException{
		// ver1
		Connection conn = null;
//		Statement stmt = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		DeptDTO data = null;
		
		// verd2
		// String query = "SELECT * FROM dept WHERE dname = '" + dname + "'";
		
		// verd3/ver6
		String query = "SELECT * FROM dept WHERE dname = ?";
		
		try {
			// ver1
			// conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/scott", "scott", "tiger");
			// stmt = conn.createStatement();
			// rset = stmt.executeQuery("SELECT * FROM dept WHERE dname = " + dname);	
			
			// ver2
			// rset = dbConnection().executeQuery("SELECT * FROM dept WHERE dname = '" + dname + "'");	
			
			// ver3
			// rset = dbConnection().executeQuery(query);	
			
			// ver4
			// rset = dbConnection(conn, pstmt, rset, query);	
			
			// ver5 - fail
			// rset = dbConnection(stmt).executeQuery("SELECT * FROM dept WHERE dname = '" + dname + "'");	

			// ver6
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/scott", "scott", "tiger");
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, dname);
			rset = pstmt.executeQuery();
			
			while(rset.next()) {
				data = new DeptDTO(rset.getInt("deptno"), rset.getString("dname"), rset.getString("loc"));
			}
			
		}finally {
			// ver1
//			rset.close();
//			stmt.close();
//			conn.close();
			
			// ver2
//			rset.close();
			
			// ver3 - fail
//			dbClose(conn, stmt, rset);
			
			// ver6
			rset.close();
			pstmt.close();
			conn.close();
			
		}
		
		return data;
	}
	
	
	// 부서 생성 메소드
	// Query : insert into dept values(deptno, dname, loc); -> pstmt
	public static boolean insertDept(DeptDTO dept) throws SQLException{
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/scott", "scott", "tiger");
			pstmt = conn.prepareStatement("INSERT INTO dept VALUES(?, ?, ?)");
			
			pstmt.setInt(1, dept.getDeptno());
			pstmt.setString(2, dept.getDname());
			pstmt.setString(3, dept.getLoc());
			
			int r = pstmt.executeUpdate();
			if(r != 0) {
				return true;
			}
			
		}finally {
			pstmt.close();
			conn.close();
		}
		
		return false;
	}
	
	// 부서 수정 메소드
	public static boolean updateDept(int deptno, String loc) throws SQLException {
	    Connection conn = null;
	    PreparedStatement pstmt = null;

	    try {
	        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/scott", "scott", "tiger");
	        pstmt = conn.prepareStatement("update dept set loc = ? where deptno = ?");

	        pstmt.setString(1, loc);
	        pstmt.setInt(2, deptno);

	        int r = pstmt.executeUpdate();
	        if(r != 0) {
	            return true;
	        }

	    } finally {
	        pstmt.close();
	        conn.close();
	    }

	    return false;
	}
	
	// 부서 삭제 메소드
	public static boolean deleteDept(int deptno) throws SQLException {
	    Connection conn = null;
	    PreparedStatement pstmt = null;

	    try {
	        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/scott", "scott", "tiger");
	        pstmt = conn.prepareStatement("delete from dept where deptno = ?");

	        pstmt.setInt(1, deptno);

	        int r = pstmt.executeUpdate();
	        if(r != 0) {
	            return true;
	        }

	    } finally {
	        pstmt.close();
	        conn.close();
	    }

	    return false;
	}

	// 부서명으로 사원 출력
	public static ArrayList<EmpDTO> getDeptEmp(String dname) throws SQLException{
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		ArrayList<EmpDTO> allData = null;
		String query = "";
		query += "SELECT * ";
		query += "FROM emp e JOIN dept d ";
		query += "ON e.deptno = d.deptno ";
		query += "WHERE dname = ?";
		
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/scott", "scott", "tiger");
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, dname);
			rset = pstmt.executeQuery();
			
			allData = new ArrayList<EmpDTO>();
			while(rset.next()) {
				allData.add(new EmpDTO(rset.getInt("empno"), rset.getString("ename"), 
						rset.getString("job"), rset.getInt("mgr"), 
						rset.getDate("hiredate"), rset.getFloat("sal"), 
						rset.getFloat("comm"), rset.getInt("deptno")));
			}
		}finally {
			rset.close();
			pstmt.close();
			conn.close();
		}
		return allData;
	}
	
	
	public static void main(String[] args) {
		try {
			// 모든 부서 검색
			// getAllDept();
			for(DeptDTO dept : getAllDept()) {
				System.out.println(dept);
			}
			
			System.out.println();
			
			// (부서 이름으로) 특정 부서를 검색
			// getDept(String dname)
			System.out.println(getDept("SALES"));
			
			// 부서 생성
			// boolean insertDept(Dept dept)
			System.out.println(insertDept(new DeptDTO(50, "PROGRAMMING", "BUSAN")));
			
			// (부서 번호로) 검색한 해당 부서의 위치 수정
			// updateDept(50, "SEOUL") -> 50 BUSAN -> SEOUL
			System.out.println(updateDept(50, "SEOUL"));
			
			// (부서 번호로) 검색한 해당 부서 삭제
			// DELETEDept(50) -> 부서 삭제 
			System.out.println(deleteDept(50));
			
			System.out.println();
			
			// (부서 명으로) 검색한 해당 사원 출력
			for(EmpDTO emp : getDeptEmp("SALES")) {
				System.out.println(emp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}



}
