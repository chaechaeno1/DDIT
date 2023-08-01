package ddit.chap06.sec02;

public class Product {
	static int pid; //제품번호
	//static 유무에 따라 결과값 달라짐
	//static이 붙은 변수는 객체(p1, p2, p3)들이 공통적으로 사용하는 변수
	static String pName="마커펜"; //제품명
	
	Product(){ //생성자메서드 목적 : 멤버필드(변수) 초기화
		pid++;
		pName="마커펜";
		
	}
	
	public static void showProduct() {
		System.out.println("제품번호 : "+(++pid));
		System.out.println("제품명 : "+pName);
	}

}
