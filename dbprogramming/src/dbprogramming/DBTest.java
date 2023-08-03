package dbprogramming;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

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
		
		
	public void selectList(String sql) { //DB 연결 설정
		try {
			conn=DriverManager.getConnection(url, user, password);
			System.out.println("DB연결 성공");
			
			stmt=conn.createStatement(); // 정적쿼리
			rs=stmt.executeQuery(sql); 
			//실행시키려는 쿼리가 select 문일때만 executeQuery 사용
			//insert, update, delete 문일때는 executeUpdate 사용
			//rs가 view를 보관하고 있음
			
			while(rs.next()) {
				String pid=rs.getString("PROD_ID");
				String pname=rs.getString("PROD_NAME");
				StringBuilder ss = new StringBuilder(pname);
				for(int i=pname.length(); i<20; i++) {
					ss.append("\0");
				}
				String name=ss.toString();
				int price=rs.getInt("PROD_PRICE");
				int pstock=rs.getInt("PROD_PROPERSTOCK");
				
				System.out.printf("%-12s %20s %10d %5d\n",pid,name,price,pstock);
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			if(rs!=null) try{rs.close();}catch(Exception e) {}
			if(stmt!=null) try{stmt.close();}catch(Exception e) {}
			if(pstmt!=null) try{pstmt.close();}catch(Exception e) {}	
			if(conn!=null) try{conn.close();}catch(Exception e) {}	
			}
		}
	
	public void selectOne(String sql, String pd) {
		try {
			conn=DriverManager.getConnection(url, user, password);
			
			pstmt=conn.prepareStatement(sql); 
			pstmt.setString(1, pd); //쿼리 실행전 물음표와 실제 데이터를 연결해주어야함
			// 1= 첫번째 물음표 라는 뜻, pr을 1에 대입
			// sql = "SELECT * FROM article WHERE id = ?";
			//pstmt.setInt(1, inputedId);
            // 1번 '?' 자리에 값은 'inputedId'이다.
			rs=pstmt.executeQuery(); 
			//실행시키려는 쿼리가 select 문일때만 executeQuery 사용
			//insert, update, delete 문일때는 executeUpdate 사용
			//rs가 view를 보관하고 있음
			
			while(rs.next()) {
				String pid=rs.getString("PROD_ID");
				String pname=rs.getString("PROD_NAME");
				StringBuilder ss = new StringBuilder(pname);
				for(int i=pname.length(); i<20; i++) {
					ss.append("\0");
				}
				String name=ss.toString();
				int price=rs.getInt("PROD_PRICE");
				int pstock=rs.getInt("PROD_PROPERSTOCK");
				
				System.out.printf("%-12s %20s %10d %5d\n",pid,name,price,pstock);
				
			}
			
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			if(rs!=null) try{rs.close();}catch(Exception e) {}
			if(stmt!=null) try{stmt.close();}catch(Exception e) {}
			if(pstmt!=null) try{pstmt.close();}catch(Exception e) {}	
			if(conn!=null) try{conn.close();}catch(Exception e) {}	
			}
		}
	
	
	public int update(String sql, List<Object> param) {
		int result=0;
		try {
			conn=DriverManager.getConnection(url, user, password);
			
			pstmt=conn.prepareStatement(sql); 
			for(int i=0; i<param.size();i++) {
				//size()는 1부터 시작
				pstmt.setObject(i+1, param.get(i));
			}	// i+1은 오라클에서는 순번을 1번부터 카운트하기 때문			
			result=pstmt.executeUpdate(); 
			conn.commit();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			if(rs!=null) try{rs.close();}catch(Exception e) {}
			if(stmt!=null) try{stmt.close();}catch(Exception e) {}
			if(pstmt!=null) try{pstmt.close();}catch(Exception e) {}	
			if(conn!=null) try{conn.close();}catch(Exception e) {}	
			}
		return result;
		}
	}
	

		



