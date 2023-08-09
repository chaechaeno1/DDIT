package dao;

import util.JDBCUtil;

public class AdminDAO {
		//싱글톤 패턴
		private static AdminDAO instance = null;
		private AdminDAO() {}
		public static AdminDAO getInstance() {
			if(instance == null) instance = new AdminDAO();
			return null;
		}
		
		JDBCUtil jdbc = JDBCUtil.getInstance();
}
