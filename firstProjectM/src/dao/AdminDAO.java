package dao;

import util.JDBCUtil;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AdminDAO {
		//싱글톤 패턴
		private static AdminDAO instance = null;
		private AdminDAO() {}
		public static AdminDAO getInstance() {
			if(instance == null) instance = new AdminDAO();
			return instance;
		}
		
		JDBCUtil jdbc = JDBCUtil.getInstance();

	/**
	 * 	todo 직접 데이터베이스에서 데이터를 가져와야함
	 * 	지금은 임의의 데이터를 넣음
	 * @return
	 */
	public List<Map<String, Object>> list() {
		//노선ID
		//노선명
		//승차홈
		//소요시간
		//출발지ID
		//도착지ID
		List<Map<String, Object>> list = new ArrayList<>();

		//대전 - 천안 노선 데이터
		Map<String, Object> dtocMap = new HashMap<>();
		dtocMap.put("rt_id","DC"); //노선ID
		dtocMap.put("rt_name","대전-천안"); //노선명
		dtocMap.put("rt_price",20000); //비용
		dtocMap.put("rt_pnum",0); //승차홈
		dtocMap.put("rt_time",120); //소요시간 - 분단위
		dtocMap.put("st_start_name","대전"); //출발지 정류장명
		dtocMap.put("st_end_name","천안"); //도착지 정류장명

		list.add(dtocMap);

		//대전 - 부산 노선 데이터
		Map<String, Object> dtobMap = new HashMap<>();
		dtobMap.put("rt_id","DB"); //노선ID
		dtobMap.put("rt_name","대전-부산"); //노선명
		dtobMap.put("rt_price",40000); //비용
		dtobMap.put("rt_pnum",2); //승차홈
		dtobMap.put("rt_time",240); //소요시간 - 분단위
		dtobMap.put("st_start_name","대전"); //출발지 정류장명
		dtobMap.put("st_end_name","부산"); //도착지 정류장명

		list.add(dtobMap);

		//대전 - 서울 노선 데이터
		Map<String, Object> dtosMap = new HashMap<>();
		dtosMap.put("rt_id","DS"); //노선ID
		dtosMap.put("rt_name","대전-서울"); //노선명
		dtosMap.put("rt_price",30000); //비용
		dtosMap.put("rt_pnum",8); //승차홈
		dtosMap.put("rt_time",180); //소요시간 - 분단위
		dtosMap.put("st_start_name","대전"); //출발지 정류장명
		dtosMap.put("st_end_name","서울"); //도착지 정류장명

		list.add(dtosMap);

		return list;
	}
}
