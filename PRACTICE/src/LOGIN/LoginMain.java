package LOGIN;

import java.util.HashMap;

public class LoginMain {
	// private : 자기 자신의 클래스 내에서만 접근 가능
	private String id;
	private String password;
	// static : 모든 객체가 공유하여 하나의 멤버를 어디서든지 참조할 수 있지만,
	// 			static 영역 멤버들은 프로그램 종료시까지 메모리가 할당된 채로 존재
	// static 선언 기준 : 공용으로 사용할 것인지 아닌지
	static boolean loginFlag = false;
	//HashMap : key, value 쌍으로 저장
	//			반드시 객체로 기술(int x, Integer)
	//			순서 보장X
	HashMap<String, String> memberTable = new HashMap<String,String>();
	
	public void setID(String id) {
		this.id = id;
	}
	public String getID() {
		return id;
	}
	public void setPassword(String password) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}

	/*
	 * 메뉴 출력 메소드
	 */
	
	
	














	public static void main(String[] args) {
		

	}

}
