package ddit.chap06.sec03;
//· Circle는 반지름, 원주율(상수:3.1415926)-원의 면적을 반환하는 메서드(getArea())
public class Circle {
	private double radius;//반지름
	private final double PI=3.1415926;
	//상수는 변수가 아니기 때문에 변수명을 대문자로만 적음
	//상수는 한번 선언해주면 변경 불가
	
	Circle(double radius){ //PI는 이미 상수값이므로 매개변수로 넣어주지 않아도 됨
		this.radius=radius;
		
	}
	public double getArea() { //원의 면적을 반환하는 메서드
		return radius*radius*PI;
		
	}
	
	
}
