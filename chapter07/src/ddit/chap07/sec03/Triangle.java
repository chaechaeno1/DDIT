package ddit.chap07.sec03;

public class Triangle extends Shape {
	private int width;
	private int height;

	Triangle(String kind,int width,int height){
		super(kind); //부모를 항상 먼저 기술
		this.width=width;
		this.height=height;
	
	}
	
	
	@Override
	public double calcurateArea() {
		return (double)height*width/2;
	}
	
}
