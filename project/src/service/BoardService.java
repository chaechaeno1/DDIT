package service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import dao.BoardDAO;
import util.ScanUtil;
import util.View;

public class BoardService {//싱글톤 패턴
	private static BoardService instance = null; //인스턴스 변수 선언, private static 반환타입(자기클래스타입) instance = null;
	private BoardService() {} //생성자 메서드 선언, private
	public static BoardService getInstance() { // getInstance메서드 선언, 외부와 통신하기 위한 메소드
		if(instance == null) instance = new BoardService();
		return instance;
	}
	
	BoardDAO dao = BoardDAO.getInstance();
	
	public int list() {
		System.out.println("-- 게시판 목록 --");
		System.out.println("번호\t제목\t작성자\t작성일"); //\t는 탭키 누른것만큼 띄어줌
		System.out.println("---------------------------------------");
		List<Map<String, Object>> list = dao.list();
		//반환타입이 여러개인 것
		
		if(list==null) {
			System.out.println("게시글이 없습니다.");
			System.out.println("---------------------------------------");
			System.out.println("2.등록 0.종료");
		}else {
			for(Map<String, Object> item : list) {
				System.out.print(item.get("BOARD_NUMBER"));
				System.out.print("\t" + item.get("TITLE"));
				System.out.print("\t" + item.get("MEM_ID"));
				System.out.print("\t" + item.get("DATETIME"));
				System.out.println();
			}
		
			System.out.println("---------------------------------------");
			System.out.println("1.상세 2.등록 3.수정 4.삭제 0.종료");
	
		}	
	
		System.out.print("번호 선택 >> ");
		switch(ScanUtil.nextInt()) {
		case 1: return View.BOARD_DETAIL;
		case 2: return View.BOARD_INSERT;
		case 3: return View.BOARD_UPDATE;
		case 4: return View.BOARD_DELETE;
		default: return View.HOME;
		}
	}
	public int insert() {
		Date now = new Date();
		SimpleDateFormat format=new SimpleDateFormat("yyyyMMdd");
		String dt=format.format(now);
		System.out.println("게시글 등록");
		//게시글번호 생성
		Map<String, Object> result = dao.createBoardNumber(dt);
		System.out.print("글번호: ");
		return 1;
		
	}
	
}










