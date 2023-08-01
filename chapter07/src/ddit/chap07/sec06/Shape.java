package ddit.chap07.sec06;

//추상클래스
//객체로 만들어질 수 없음
public abstract class Shape {
	//변수
	String kind;
		
	//생성자
	Shape(String kind){
		this.kind=kind;
	}
	
	//추상메서드
	public abstract void draw();
	
	@Override
	//객체가 가지고 있는 값을 주소값이 아닌 내용값으로 재정의
	//오버라이딩할 때 원본의 접근제한자를 같게 하거나 더 넓게 지정해야 한다
	//반환타입, 메서드명, 매개변수 수정 불가
	public String toString() {
		return kind;
	}
		
	}

class Circle extends Shape{
	private Point p;
	private int radius;
	
	Circle(String kind, Point p, int radius){
		super(kind);
		this.p=p;
		this.radius=radius;
		
	}
	
	@Override
	public void draw() {
		System.out.println("원점이"+p+"이고 반지름이 "+radius+"인 원을 그리다.");
	}
	
}


