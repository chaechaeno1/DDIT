package ddit.chap06.sec02;

public class Point {
	//private 선언했으므로 Point Class 밖에서 x,y 값을 넣을수가 없음
	
	private int x; //멤버변수
	private int y; //멤버변수
	
	Point(){}
	//매개변수 없는 메서드
	
	Point(int x, int y){ //int x, int y 지역변수(매개변수)
		this.x=x; // private int x 에 저장
		this.y=y; // private int y 에 저장
	} // x,y 는 사라짐
	
	@Override //컴파일 되어지는 주석
	//toString 메서드를 재정의
	public String toString() { //객체 내용을 문자열로 반환
		return "("+x+", "+y+")";
		//return getClass().getName()+Integer.toHexString(hashCode());
		//return getClass().getName()+'@'+hashCode();
	}


}
