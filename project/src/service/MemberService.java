package service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import controller.Controller;
import dao.MemberDAO;
import util.ScanUtil;
import util.View;

public class MemberService {
	private static MemberService instance = null;
	private MemberService() {}
	public static MemberService getInstance() {
		if(instance == null) instance = new MemberService();
		return instance;
	}
	
	MemberDAO dao = MemberDAO.getInstance();
	//getInstance() -> 싱글톤패턴 사용
	//new 연산자가 쓰이지 않고 객체 생성
	
	public int login() {
		if((boolean) Controller.sessionStorage.get("login")) {
			System.out.println("이미 로그인되어있습니다.");
			return View.HOME;
		}
		System.out.println("-- 로그인 --");
		System.out.print("아이디 >> ");
		String id = ScanUtil.nextLine();
		System.out.print("비밀번호 >> ");
		String pass = ScanUtil.nextLine();
		Map<String, Object> row = dao.login(id, pass);
		if(row == null) {
			System.out.println("아이디가 없습니다.");
			return View.HOME;
		}else {
			Controller.sessionStorage.put("login", true);
			System.out.println(row.get("MEM_NAME") + "님 환영합니다!");
			return View.BOARD_LIST;
		}
	}
	public int signUp() {
		System.out.println("-- 회원가입 --");
		System.out.print("아이디 >> ");
		String id = ScanUtil.nextLine();
		//
		System.out.print("비밀번호 >> ");
		String pass = ScanUtil.nextLine();
		//
		
		List<Object> param = new ArrayList<>();
		//id, pass 입력값 받은 후 List에 저장, list는 순서 중요
		//param은 List 객체
		//0번째 - id 값, 1번째 - pw 값
		param.add(id);
		param.add(pass);
		
		int result = dao.signUp(param);
		//dao는 멤버변수, 메서드 밖에서 선언
		//	MemberDAO dao = MemberDAO.getInstance();
		return View.HOME;
	}
}







