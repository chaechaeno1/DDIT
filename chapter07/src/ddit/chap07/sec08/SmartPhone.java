package ddit.chap07.sec08;

public class SmartPhone extends Computer implements Phone, Repair {
	boolean power;
	
	@Override
	public void call() {
		String number1 = String.valueOf(PHONE_NUM_1);
		String number2 = String.valueOf(PHONE_NUM_2);

		System.out.println("간첩신고는 "+number1+number1+number2+"입니다.");

	}

	@Override
	public void turnOn() {
		if (power!=true) power=!power;
		System.out.println("전원이 켜졌습니다.");
		
	}

	@Override
	public void turnOff() {
		if (power) power=!power;
		System.out.println("전원이 꺼졌습니다.");

	}
}
