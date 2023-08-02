package dbprogramming;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBTest {

		//멤버변수이므로 한번만 정의하면 
		private String url="jdbc:oracle:thin:@localhost:1521:xe";
		private String user="pc_09";
		private String password="java";
		
		private Connection conn=null; //DB 연결 객체
		private Statement stmt=null; // 정적쿼리
		//동적쿼리가 정적쿼리의 기능까지 다 할 수 있으므로 정적쿼리는 사용하지 않아도 됨
		private PreparedStatement pstmt=null; // 동적쿼리
		private ResultSet rs=null; //
		
		
	public void dbConnection() { //DB 연결 설정
		try {
			conn=DriverManager.getConnection(url, user, password);
			System.out.println("DB연결 성공");
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			if(rs!=null) try{rs.close();}catch(Exception e) {}
			if(stmt!=null) try{stmt.close();}catch(Exception e) {}
			if(pstmt!=null) try{pstmt.close();}catch(Exception e) {}	
			if(conn!=null) try{conn.close();}catch(Exception e) {}	
			}
		}
		

				
}
