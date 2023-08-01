package ddit.chap07.sec08;

public class InterfaceExample {

	public static void main(String[] args) {
		SmartPhone smartPhone = new SmartPhone();
		smartPhone.call();

		
		//업캐스팅, 다형성
		Phone phone = new SmartPhone();
		phone.call();
		phone.turnOn();
		phone.turnOff();


	}

}
