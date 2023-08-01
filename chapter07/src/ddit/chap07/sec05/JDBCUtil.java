package ddit.chap07.sec05;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class JDBCUtil {
		//싱글톤 패턴
	   private static JDBCUtil instance = null;
	   private JDBCUtil() {}
	   public static JDBCUtil getInstance() {
	      if (instance == null)
	         instance = new JDBCUtil();
	      return instance;

	   }

	   private String url = "jdbc:oracle:thin:@localhost:1521:xe";
	   private String user = "pc_09";
	   private String password = "java";

	   private Connection conn = null;
	   private Statement stmt = null;
	   private PreparedStatement pstmt = null;
	   private ResultSet rs = null;

	   public List<Map<String, Object>> selectList(String sql,List<Object>param) {
		   //String sql -> 문자열로 쿼리를 받음
		   //
		   //view에 해당
	      List<Map<String,Object>> list=null;
	      try {
	         conn = DriverManager.getConnection(url, user, password);
	         pstmt=conn.prepareStatement(sql);
	         for(int i=0; i<param.size();i++) {
	        	 pstmt.setObject(i+1, param.get(i));
	         }
	         rs=stmt.executeQuery(sql);
	         
	         ResultSetMetaData rsmd=rs.getMetaData();
	         int columnCount=rsmd.getColumnCount();
	         
	         
	         while(rs.next()) {
	        	Map<String, Object>row=new HashMap<>();
	        	for(int i=0; i<columnCount;i++) {
	        		String key=rsmd.getColumnLabel(i+1);
	        		Object value=rs.getObject(i);
	        		row.put(key, value);
	        	}
	        	list.add(row);
	         }
	         
	      }catch(SQLException e) {
	         e.printStackTrace();
	      }finally {
	    	 //열었던 순서의 반대로 다시 닫아주어야 함
	         if(rs!=null) try {rs.close();}catch(Exception e) {}
	         if(stmt!=null) try {stmt.close();}catch(Exception e) {}
	         if(conn!=null) try {conn.close();}catch(Exception e) {}
	      }
	      return list;
	   }
	}
	

