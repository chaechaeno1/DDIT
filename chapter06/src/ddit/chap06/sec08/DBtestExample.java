package ddit.chap06.sec08;

public class DBtestExample {

   public static void main(String[] args) {
      JDBCUtil jdbc = JDBCUtil.getInstance();
      String sql = "select mem_id, mem_name, mem_regno1, mem_regno2, mem_hp,";
      sql = sql+"mem_mileage from member where mem_regno1 like '0%'";
      
      jdbc.selectList(sql);

   }

}