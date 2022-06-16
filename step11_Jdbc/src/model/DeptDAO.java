package model;

import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;

import model.domain.Dept;
import model.domain.DeptDTO;
import model.domain.EmpDTO;
import util.DButil;

public class DeptDAO {
	
	// 모든 부서 검색 메소드
	// Query : "SELECT * FROM dept"
	public static ArrayList<DeptDTO> getAllDept() throws SQLException {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rset =null;
		ArrayList<DeptDTO> allData = null;
		
		try {
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
			DButil.close(rset, stmt, conn);
		}
		return allData;
	}
	
	// 부서 이름 검색 메소드
	public static DeptDTO getDept(String dname) throws SQLException{
		// ver1
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		DeptDTO data = null;
		String query = "SELECT * FROM dept WHERE dname = ?";
		
		try {
			conn = DButil.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, dname);
			rset = pstmt.executeQuery();
			
			while(rset.next()) {
				data = new DeptDTO(rset.getInt("deptno"), rset.getString("dname"), rset.getString("loc"));
			}
		}finally {
			DButil.close(rset, pstmt, conn);
		}
		return data;
	}
	
	// 부서 생성 메소드
	// Query : insert into dept values(deptno, dname, loc); -> pstmt
//	public static boolean insertDept(DeptDTO dept) throws SQLException{
	public static boolean insertDept(Dept deptBuilder) throws SQLException{
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = DButil.getConnection();
			pstmt = conn.prepareStatement("INSERT INTO dept VALUES(?, ?, ?)");
//			pstmt.setInt(1, dept.getDeptno());
//			pstmt.setString(2, dept.getDname());
//			pstmt.setString(3, dept.getLoc());
			pstmt.setInt(1, deptBuilder.getDeptno());
			pstmt.setString(2, deptBuilder.getDname());
			pstmt.setString(3, deptBuilder.getLoc());
			
			int r = pstmt.executeUpdate();
			if(r != 0) {
				return true;
			}
		}finally {
			DButil.close(pstmt, conn);
		}
		return false;
	}
	
	// 부서 수정 메소드
	public static boolean updateDept(int deptno, String loc) throws SQLException {
	    Connection conn = null;
	    PreparedStatement pstmt = null;

	    try {
	        conn = DButil.getConnection();
	        pstmt = conn.prepareStatement("update dept set loc = ? where deptno = ?");

	        pstmt.setString(1, loc);
	        pstmt.setInt(2, deptno);

	        int r = pstmt.executeUpdate();
	        if(r != 0) {
	            return true;
	        }
	    } finally {
	    	DButil.close(pstmt, conn);
	    }
	    return false;
	}
	
	// 부서 삭제 메소드
	public static boolean deleteDept(int deptno) throws SQLException {
	    Connection conn = null;
	    PreparedStatement pstmt = null;

	    try {
	        conn = DButil.getConnection();
	        pstmt = conn.prepareStatement("delete from dept where deptno = ?");

	        pstmt.setInt(1, deptno);

	        int r = pstmt.executeUpdate();
	        if(r != 0) {
	            return true;
	        }
	    } finally {
	    	DButil.close(pstmt, conn);
	    }
	    return false;
	}

	// 부서명으로 사원 출력
	public static ArrayList<DeptDTO> getDeptEmp(String dname) throws SQLException{
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		ArrayList<DeptDTO> allData = null;
		String query = "";
		query += "SELECT e.empno, e.ename, e.job, e.mgr, e.hiredate, e.sal, e.comm, e.deptno, d.dname ";
		query += "FROM emp e JOIN dept d ";
		query += "ON e.deptno = d.deptno ";
		query += "WHERE d.dname = ?";
		
		try {
			conn = DButil.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, dname);
			rset = pstmt.executeQuery();
			
			allData = new ArrayList<DeptDTO>();
			while(rset.next()) {
				EmpDTO e = new EmpDTO();
				e.setEmpno(rset.getInt("empno"));
				e.setEname(rset.getString("ename"));
				e.setJob(rset.getString("job"));
				e.setMgr(rset.getInt("mgr"));
				e.setHiredate(rset.getDate("hiredate"));
				e.setSal(rset.getFloat("sal"));
				e.setComm(rset.getFloat("comm"));
				e.setDeptno(rset.getInt("deptno"));
				
				DeptDTO d = new DeptDTO(rset.getString("dname"), e);
				allData.add(d);
			}
		}finally {
			DButil.close(rset, pstmt, conn);
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
//			System.out.println(insertDept(new DeptDTO(50, "PROGRAMMING", "BUSAN")));
			Dept deptBuilder = new Dept.Builder()
					.deptno(50)
					.dname("PROGRAMMING")
					.loc("BUSAN")
					.build();
			System.out.println(insertDept(deptBuilder));
			
			// (부서 번호로) 검색한 해당 부서의 위치 수정
			// updateDept(50, "SEOUL") -> 50 BUSAN -> SEOUL
			System.out.println(updateDept(50, "SEOUL"));
			
			// (부서 번호로) 검색한 해당 부서 삭제
			// DELETEDept(50) -> 부서 삭제 
			System.out.println(deleteDept(50));
			
			System.out.println();
			
			// (부서 명으로) 검색한 해당 사원 출력
			for(DeptDTO emp : getDeptEmp("SALES")) {
				System.out.println(emp);
			}
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}



}
