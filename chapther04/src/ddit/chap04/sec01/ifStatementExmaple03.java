package ddit.chap04.sec01;

import java.util.Scanner;

public class ifStatementExmaple03 {

	public static void main(String[] args) {
		method1();

	}
	public static void method1() {
		//키보드로 아이디와 패스워드를 입력받아 로그인되는 과정이다. (문자열로 미리 저장)
		//먼저 아이디를 비교하여 아이디가 일치하면 비밀번호를 비교하고
		//아이디가 일치하지 않으면 "아이디가 일치하지 않습니다."를 출력하고
		//프로그램실행을 종료하며, 비밀번호도 같은 방법으로 비교하여
		//모두 일치하면 "xx님 환영합니다"라는 메시질르 출력하시오.
		
		String id = "e1004";
		String pw = "1234";
		
		Scanner sc = new Scanner(System.in);
		System.out.print("ID를 입력하시오 : ");	
		String uid = sc.nextLine(); 
		System.out.print("PW를 입력하시오 : ");	
		String upw = sc.nextLine(); 
		//next() : 공백 전의 모든 자료를 대입
		//nextLine() : enter키 치기 전까지의 모든 자료를 대입
		
		//if(id==uid) 라고 적으면 안됨! id가 내용이 아닌 주소값.
		//객체 참조 변수인 경우(내용 비교하기 위해서는) .equals 사용.
		//참조형 변수 : 배열, 클래스(대문자로 시작), 열거형, 인터페이스
		//equealsIgnoreCase 사용하면 대소문자 비교 안해도됨.
		if(id.equals(uid)) {
			if(pw.equals(upw)) {
				System.out.println(uid+"님 환영합니다.");
			}else {
				System.out.println("비밀번호가 일치하지 않습니다.");
			}
		}else {
			System.out.println("아이디가 일치하지 않습니다.");
		
		}
		
	}
	

}
