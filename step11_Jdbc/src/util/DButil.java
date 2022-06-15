package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DButil {
	// step01 *
	// Driver loading
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	// step02 *
	// DB Connection
	// DB 연결 기능 메소드
	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/scott", "scott", "tiger");
	}
	
	// step06 *
	// DB 종료
	// DB 자원 반환 : close
	public static void close(ResultSet rset, Statement stmt, Connection conn) {
		try {
			if(rset != null) {
				rset.close();
				rset = null;
			}
			if(stmt != null) {
				stmt.close();
				stmt = null;
			}
			if(conn != null) {
				conn.close();
				conn = null;
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public static void close(ResultSet rset, PreparedStatement pstmt, Connection conn) {
		try {
			if(rset != null) {
				rset.close();
				rset = null;
			}
			if(pstmt != null) {
				pstmt.close();
				pstmt = null;
			}
			if(conn != null) {
				conn.close();
				conn = null;
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
