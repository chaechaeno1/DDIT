package ddit.chap07.sec07;
/**
 * 추상클래스
 */

public abstract class Phone {
	String phoneNumber;
	
	Phone(String phoneNumber){
		this.phoneNumber=phoneNumber;
		
	}
	public void call() {
		System.out.println("통화하다");
	}
	
	//모든 자식 클래스들이 같은 기능(turnOn)을 가지고 있으나 수행하는 방법이 다를 경우
	//부모 클래스에서는 추상메서드로 구현
	public abstract void turnOn();

}
