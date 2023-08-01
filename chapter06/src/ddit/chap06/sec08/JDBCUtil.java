package ddit.chap06.sec08;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


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

   public void selectList(String sql) {
	   //view에 해당
      try {
         conn = DriverManager.getConnection(url, user, password);
         stmt=conn.createStatement();
         rs=stmt.executeQuery(sql);
         
         
         while(rs.next()) {
            String mid = rs.getNString("MEM_ID");
            String mname = rs.getNString("MEM_NAME");
            String jumin = rs.getNString("MEM_REGNO1")+"-"+rs.getString("MEM_REGNO2");
            String hp = rs.getNString("MEM_HP");
            int mileage = rs.getInt("MEM_MILEAGE");
            
            System.out.printf("%6s %5s  %13s    %15s   %6d\n",mid,mname,jumin,hp,mileage);
         }
         
      }catch(SQLException e) {
         e.printStackTrace();
      }finally {
    	 //열었던 순서의 반대로 다시 닫아주어야 함
         if(rs!=null) 
        	 try {
        		 rs.close();
        	 }catch(Exception e) {}
         if(stmt!=null) try {stmt.close();}catch(Exception e) {}
         if(conn!=null) try {conn.close();}catch(Exception e) {}
      }
   }
}