package dao;

import util.JDBCUtil;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BusDAO {
		//싱글톤 패턴
		private static BusDAO instance = null;
		private BusDAO() {}
		public static BusDAO getInstance() {
			if(instance == null) instance = new BusDAO();
			return instance;
		}
		
		JDBCUtil jdbc = JDBCUtil.getInstance();

    /**
     * 	todo 직접 데이터베이스에서 데이터를 가져와야함
	 * 	지금은 임의의 데이터를 넣음
	 * @return
     */
	public List<Map<String, Object>> list() {
		List<Map<String, Object>> list = new ArrayList<>();

		//버스 1대 //N H P
		Map<String, Object> bus1 = new HashMap<>();
		bus1.put("bus_id","n001");
		bus1.put("bus_num","4567");
		bus1.put("bus_grade","P");
		list.add(bus1);

		Map<String, Object> bus2 = new HashMap<>();
		bus2.put("bus_id","n002");
		bus2.put("bus_num","1234");
		bus2.put("bus_grade","H");
		list.add(bus2);

		Map<String, Object> bus3 = new HashMap<>();
		bus3.put("bus_id","n003");
		bus3.put("bus_num","4567");
		bus3.put("bus_grade","N");
		list.add(bus3);

		return list;
	}
}
