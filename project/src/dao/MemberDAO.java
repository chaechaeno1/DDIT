package dao;

import java.util.List;
import java.util.Map;

import util.JDBCUtil;

public class MemberDAO {
   private static MemberDAO instance = null;
   private MemberDAO() {}
   public static MemberDAO getInstance() {
      if(instance == null) instance = new MemberDAO();
      return instance;
   }
   
   JDBCUtil jdbc = JDBCUtil.getInstance();
   
   public Map<String, Object> login(String id, String pass) {
      return jdbc.selectOne("SELECT * FROM TMEMBER "
            + " WHERE MEM_ID='"+id+"' AND MEM_PASS='"+pass+"' ");
   }
   
   public int signUp(List<Object> param) {
      return jdbc.update( "INSERT INTO TMEMBER ( MEM_ID, MEM_PASS ) VALUES (?, ?)", param);
   } //update라는 메소드가 여러 dao들을 한꺼번에 총괄 
   	 //오라클의 영향을 받음, 컬럼명 띄어서 인쇄하기
   	 //  
   
   public List<Map<String, Object>> selectAll() {
      return jdbc.selectList("SELECT * FROM TMEMBER");
   }
}

