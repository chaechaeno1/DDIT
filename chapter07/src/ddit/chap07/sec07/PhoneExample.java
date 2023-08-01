package ddit.chap07.sec07;

public class PhoneExample {

	public static void main(String[] args) {
		
		//추상클래스는 객체생성이 불가
		//SmartPhone smartPhone = new SmartPhone("010-1234-5678","iPhone 14");
		
		//다형성
		//업캐스팅(자식클래스 타입을 부모클래스 참조변수에 저장)
		//new 연산자 -> 자식 클래스
		//좌측 -> 부모클래스
		SmartPhone smartPhone = new IPhone("010-1234-5678","iPhone 14");
		smartPhone.call();
		smartPhone.turnOn(); //다형성
		smartPhone.game();
		
		System.out.println("=====================");
		
		Phone phone= new IPhone("010-4567-9874","iPhone 14");
		phone.call();
		phone.turnOn(); //다형성, IPhone 클래스(자식클래스)에서 재정의한 추상메서드가 출력

		
		
		
	}

}
