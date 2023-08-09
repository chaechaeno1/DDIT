package controller;

import java.util.HashMap;
import java.util.Map;

import service.BoardService;
import service.FreeBoardService;
import service.LoginService;
import service.MemberService;
import service.TestBoardService;

public class Controller {

	public class Controller { // 사용자의 메인 메뉴
		// 세션
		public static Map<String, Object> sessionStorage = new HashMap<>();
		
		// 서비스 객체 선언
		MemberService memberService = MemberService.getInstance();
		LoginService loginService = LoginService.getInstance();
		BoardService boardService = BoardService.getInstance();
		FreeBoardService freeboardService = FreeBoardService.getInstance();
		TestBoardService testBoardService = TestBoardService.getInstance();
		
		public static void main(String[] args) {
			new Controller().start();
	
	
		}
	}
}	
