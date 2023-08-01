package ddit.chap07.sec05;

import java.util.ArrayList;
import java.util.List;

import ddit.chap07.sec05.JDBCUtil;

	public class DBtestExample {
	
	   public static void main(String[] args) {
		      JDBCUtil jdbc = JDBCUtil.getInstance();
		      String sql = "select mem_id, mem_name, mem_regno1, mem_regno2, mem_hp,";
		      sql = sql+"mem_mileage from member where mem_regno1 like '0%'";
		      
		     // jdbc.selectList(sql);
		      test();

		   }
	   
	   public static void test() {
		   List<Integer> list = new ArrayList<Integer>();
		   
		   list.add(5);
		   list.add(100);
		   System.out.println(list);
//		   System.out.println(list.get(0));
//		   System.out.println(list.get(1));	
		   
		   int sum=0;
		   for(int i=0; i<list.size();i++) {
			   System.out.println(list.get(i));
			   sum+=list.get(i);
		   }
		   System.out.println(sum);

		   
	   }

}
