package ddit.chap07.sec07;

//추상클래스는 객체가 될 수 없음
public abstract class SmartPhone extends Phone {
	String model;
	
	SmartPhone(String phoneNumber,String model){
		super(phoneNumber);
		this.model=model;
	}

	public void game() {
		System.out.println("게임기능이 제공됨");
	}
}


class IPhone extends SmartPhone{
	
	IPhone(String phoneNumber,String model){
		super(phoneNumber,model);
		
	}

	@Override
	public void turnOn() {
		System.out.println("우측버튼 사용");

		
	}
	
}
