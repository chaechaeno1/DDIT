package ddit.chap07.sec06;

public class Point {
	int x;
	int y;
	
	Point(){
	this(0,0);
//		x=0; 
//		y=0;
	}

	Point(int x, int y){
		this.x=x;
		this.y=y;
	}
	
	@Override
	public String toString() {
		return "("+x+", "+y+")";
	}
}
