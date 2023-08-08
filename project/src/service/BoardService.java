package service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import controller.Controller;
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
		System.out.println("번호\t\t제목\t작성자\t작성일"); //\t는 탭키 누른것만큼 띄어줌
		System.out.println("---------------------------------------------------------------");
		List<Map<String, Object>> list = dao.list();
		//반환타입이 여러개인 것
		
		if(list==null) {
			System.out.println("게시글이 없습니다.");
			System.out.println("---------------------------------------------------------------");
			System.out.println("2.등록 0.종료");
		}else {
			for(Map<String, Object> item : list) {
				System.out.print(item.get("BOARD_NUMBER"));
				System.out.print("\t" + item.get("TITLE"));
				System.out.print("\t" + item.get("MEM_ID"));
				System.out.print("\t" + item.get("DATETIME"));
				System.out.println();
			}
		
			System.out.println("---------------------------------------------------------------");
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
		List<Object> param=new ArrayList<>();
		//날짜를 구하기 위한 방법
		Date now=new Date(); // 오늘날짜 받기
		SimpleDateFormat format=new SimpleDateFormat("yyyyMMdd"); //해당되어지는 날짜의 형식 지정, 월은 반드시 대문자로
		String dt=format.format(now); //오늘 날짜를 format 형태대로 문자열 dt에 초기화
		
		System.out.println("게시글 등록");
		//게시글번호 생성	
		String  result=dao.createBoardNumber(dt);
		System.out.print("글번호 : "+result+"\n");
		param.add(result);
		
		System.out.print("제목 : ");
		String title=ScanUtil.nextLine();
		param.add(title);
		
		System.out.print("내용 : ");
		String content=ScanUtil.nextLine();
		param.add(content);
		
		//로그인 유무 검증
		if (Controller.sessionStorage.get("loginInfo")==null) {
			System.out.println("로그인하지 않았습니다. \n게시글은 로그인 후 작성할 수 있습니다.");
			return View.MEMBER_LOGIN;
		}
		String memID=Controller.sessionStorage.get("loginInfo").toString(); //Object에 .toString()으로 문자열 변환
		System.out.print("작성자 : "+memID+"\n");
		param.add(memID);
		
		System.out.println("작성일자 : "+dt);
		param.add(dt);
		
		int res= dao.insert(param); //BoardDAO
		if(res>0) {
			System.out.println("게시글이 등록됐습니다.");
		}else {
			System.out.println("게시글이 등록되지 않았습니다.");
		}
		return View.HOME;
	}
}