package ddit.chap07.sec03;

public class Rectangle extends Shape {
	private double width;
	private double height;
	
	Rectangle(String kind,double width,double height){
		super(kind);
		this.width=width;
		this.height=height;
	}
	
	@Override
	public double calcurateArea() {
		return (double)height*width;
	}

}
