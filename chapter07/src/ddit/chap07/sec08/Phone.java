package ddit.chap07.sec08;

//전화번호 키패드 정의
//상수는 전체 대문자
//인터페이스는 변수가 없음
//public abstract void -> 인터페이스의 고정적인 추상메서드 값 = 객체가 될 수 없음

public interface Phone {
	
	int PHONE_NUM_1 = 1;
	
	public static final int PHONE_NUM_2 = 2;
	
	int PHONE_NUM_3 = 3;
	int PHONE_NUM_4 = 4;
	int PHONE_NUM_5 = 5;
	int PHONE_NUM_6 = 6;
	int PHONE_NUM_7 = 7;
	int PHONE_NUM_8 = 8;
	int PHONE_NUM_9 = 8;
	int PHONE_NUM_0 = 0;
	
	public void call();
	void turnOn();
	abstract void turnOff();
	
	
	
}
