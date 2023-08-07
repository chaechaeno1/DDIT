package dao;

import java.util.List;
import java.util.Map;

import util.JDBCUtil;

public class BoardDAO {//싱글톤패턴
	private static BoardDAO instance = null;
	private BoardDAO() {}
	public static BoardDAO getInstance() {
		if(instance == null) instance = new BoardDAO();
		return instance;
	}
	
	JDBCUtil jdbc = JDBCUtil.getInstance();
	
	public List<Map<String, Object>> list() {
		return jdbc.selectList(" SELECT * FROM BOARD ORDER BY BOARD_NUMBER ASC ");
		//물음표가 없음
		//JDBCUTIL에서 public List<Map<String, Object>> selectList(String sql)을 호출함
	}
	
	public Object createBoardNumber(String dt){
		String sql = "SELECT FN_CREATE_BOARD_NUMBER(dt) FROM BOARD";
		sql = sql+" SUBSTR(BOARD_NUMBER, 1, 8) = dt";
		
		System.out.println(sql);
		return jdbc.selectValue(sql);
	}
}







