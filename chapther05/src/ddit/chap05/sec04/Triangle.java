package ddit.chap05.sec04;

/**
 * 객체배열
 */


public class Triangle {
	//Point p1; //멤버변수
	//Point p2; //멤버변수
	//Point p3; //멤버변수
	//위에 세 변수처럼 선언하는 대신에 아래처럼 기술
	
	Point[] p; 
	//포인트 클래스 타입의 p
	//p에 저장된 주소값을 따라가면 포인트 클래스에 저장된 값을 알 수 있음
	//Point 타입의 배열'만' 생성
	//생성되려면 ()이 있어야 함.
	//참조형 변수를 초기화해주지 않으면 초기값은 null
	
		Triangle(Point[] p){
		this.p=new Point[]	{new Point(100,100), new Point(500,100), //
							 new Point(250,250)};
		}
			
	public void draw() {
		System.out.println(p[0]+"과"+p[1]+"를 연결합니다.");
		System.out.println(p[1]+"과"+p[2]+"를 연결합니다.");
		System.out.println(p[2]+"과"+p[0]+"를 연결합니다.");
	}
	
}
