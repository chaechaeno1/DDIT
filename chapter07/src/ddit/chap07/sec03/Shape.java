package ddit.chap07.sec03;

public class Shape {
	String kind; //상속되어야 하므로 private 사용X

	Shape(){}
	Shape(String kind){
		this.kind=kind;
		
	}
	
	public double calcurateArea() {
		return 0.0;
	}

}
