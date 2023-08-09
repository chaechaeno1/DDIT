package service;

import java.util.List;
import java.util.Map;

import dao.AdminDAO;
import util.ScanUtil;
import util.View;

public class AdminService {
		//싱글톤 패턴 
		private static AdminService instance = null;
		private AdminService() {}
		public static AdminService getInstance() { 
			if(instance == null) instance = new AdminService();
			return instance;
		}	
		//AdminDAO 호출 생성
		AdminDAO dao = AdminDAO.getInstance();
		
		//버스 등록/수정
		
		//버스 배차 메뉴
		/* 1. 노선명 선택
		 * 2. 배차(날짜)선택
	 	 * 3. 시간 선택
		 * 4. 등록
		 */
		
		public int BusList() {
			System.out.println("----버스 배차 목록----");
			System.out.println("번호\t노선명\t운행날짜\t운행시간\t등록일");
			System.out.println("===================================");
			List<Map<String, Object>> list = dao.list();
			
			if(list==null) {
				System.out.println("등록된 버스 배차 목록이 없습니다.");
				System.out.println("===================================");
				System.out.println("2.버스등록 0.종료");
			}else {
				for(Map<String, Object> item : list) {
					System.out.print(item.get("LIST_NUMBER"));
					System.out.print("\t" + item.get("RT_NAME"));
					System.out.print("\t" + item.get("SV_DATE"));
					System.out.print("\t" + item.get("SV_TIME"));
					System.out.print("\t" + item.get("SUBMIT_DATE"));
					System.out.println();			
				}
				System.out.println("===================================");
				System.out.println("1.버스확인 2.노선 선택 3.운행일시 선택 0.종료");
				
			}
			
			System.out.print("번호 선택 >> ");
			switch(ScanUtil.nextInt()) {
			case 1: return View.MANAGE_BUS;
			case 2: return View.MANAGE_STATION;
			case 3: return View.MANAGE_SERVICE;
			default: return View.HOME;
			
			
			}
		}
		
		
		public int insert() {}
		
		
	
}

		
		
		sessionStorage.put("RT_BUS", "대전-서울");
		String str = (String) sessionStorage.get("RT_BUS");
		sessionStorage.remove("RT_BUS");
		System.out.println(str);