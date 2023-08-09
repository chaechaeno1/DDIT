package service;

import dao.AdminDAO;

public class AdminService {
		//싱글톤 패턴 
		private static AdminService instance = null;
		private AdminService() {}
		public static AdminService getInstance() { 
			if(instance == null) instance = new AdminService();
			return instance;
		}	
		
		AdminDAO dao = AdminDAO.getInstance();
		
		//버스 등록/수정
		
		//버스 배차 메뉴
		/* 1. 배차(날짜)선택
		 * 2. 시간선택
	 	 * 3. 버스선택
		 * 4. 등록
		 */
		
		public int list() {}
		
		
	
}
