package service;

import java.util.Map;

import controller.Controller;
import dao.LoginDAO;
import util.ScanUtil;
import util.View;

public class LoginService {
	// 싱글톤 패턴을 만든다.
	private static LoginService instance = null;
	private LoginService() {}
	public static LoginService getInstance() {
		if(instance == null) 
			instance = new LoginService();
		return instance;
	}
	
	public static int loginCount = 0; //로그인 시도 횟수
	
	
	// Dao를 부른다
	LoginDAO dao = LoginDAO.getInstance();
	int pageNo = 0;
	
	public int login(){
		System.out.print("아이디 입력>>> ");
		String id = ScanUtil.nextLine();
		System.out.print("비밀번호 입력>>> ");
		String pass = ScanUtil.nextLine();
		
		Map<String, Object> result = dao.login(id,pass);

		if(result != null && result.get("MEM_ID").equals(id)){
			Controller.sessionStorage.put("login", true); //초기에 false를 true로 변경
			Controller.sessionStorage.put("loginInfo", result.get("MEM_ID"));
			//sessionStorage -> login, loginInfo 정보 저장
			System.out.println(result.get("MEM_NAME") + "님! 로그인 되었습니다");
			pageNo = View.HOME; 
		}else{
			System.out.println("다시 로그인해주세요!");
			pageNo = View.HOME;
		}
		return pageNo;
	}
}
