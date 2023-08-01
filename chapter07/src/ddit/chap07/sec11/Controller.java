package ddit.chap07.sec11;

import java.util.Scanner;

public class Controller {

	//static은 객체들이 서로 공유해서 사용할 수 있도록
	//static 메서드에서 객체를 사용하려면 static을 붙여야 함
	//아니면 new Controller ().start(); 사용
	public static void main(String[] args) {
		new Controller().start(); 
//		한번만 실행하는 경우 변수선언 해줄필요 없음
//		Controller c = new Controller();
	}
	
	public void start() {
		int view = View.HOME;
		while(true) {
			switch(view) {
			case View.HOME:
				view=home();
				break;
			case View.MEMBER_LOGIN:
//				view=memberService.logIn();
				break;
			case View.MEMBER_SIGNUP:
//				view=memberService.signUp();
				break;
			case View.ADMIN_LOGIN:
//				view=memberService.adminLogIn();
				break;
			}
			
			
		}
	}

	public int home() {
		System.out.println("	  <<회 원 관 리>>");
		System.out.println(" (1) 로그인   (2) 회원관리   (3) 관리자 접속");
		System.out.print("[선택] : ");
		Scanner sc = new Scanner(System.in);
		switch(sc.nextInt()) {
		case 1:
			return View.MEMBER_LOGIN;
		case 2:
			return View.MEMBER_SIGNUP;
		case 3:
			return View.ADMIN_LOGIN;
		default:
			return View.HOME;
		}
	}

}







