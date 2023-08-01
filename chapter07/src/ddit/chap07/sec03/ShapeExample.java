package ddit.chap07.sec03;

public class ShapeExample {

	public static void main(String[] args) {
		Circle circle = new Circle("원",10);
		Triangle triangle = new Triangle("삼각형",10,20);
		Rectangle rectangle = new Rectangle("사각형",10,20);
		
		System.out.println(circle.kind+"의 넓이 :"+circle.calcurateArea());
		System.out.println(triangle.kind+"의 넓이 :"+triangle.calcurateArea());
		System.out.println(rectangle.kind+"의 넓이 :"+rectangle.calcurateArea());

	}

	
}
