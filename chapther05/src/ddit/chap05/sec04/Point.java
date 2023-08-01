package ddit.chap05.sec04;

public class Point {
	private int x; //멤버변수=인스턴스변수
	private int y; //멤버변수=인스턴스변수
	//


	//Point p1=new Point(); //매개변수 없음 -> Point()에서 값을 가져옴	
	//Point p2=new Point(100, 100); //매개변수 2개 -> Point(int x, int y)에서 값을 가져옴
	
	
	
	//생성자 메소드 -> : 클래스 이름과 같은 이름 
	Point(){ //기본 생성자 default construct: ()안에 매개변수가 존재하지 않음
		x=0; 
		y=0;
	}
	
	//하나라도 만들어서 넣었다면 기본생성자는 만들지 않음
	Point(int x, int y){ //지역변수 -> 호출되어질때 생성되어 호출이 끝나면 소멸
		this.x=x; //private int x에 들어감 
		//참조변수 : this-자기클래스주소. super-부모클래스주소.
		this.y=y; //private int y에 들어감
	}
	
	@Override //상속관계에 있는 두개 이상의 Class에서 발생할 수 있음. 재정의.
	public String toString() { //Object 클래스, toString()
		//public 누구나 접근 가능
		//String 반환타입 -> 반드시 return 존재
		//toString() 
		//p1, p2 호출할 때 주소값 대신에 return값 나오게
		return "("+x+", "+y+")";
	}
	
}
//모든 클래스의 조상 클래스는 오브젝트 클래스
//모든 클래스는 오브젝트 클래스를 상속받도록 함



