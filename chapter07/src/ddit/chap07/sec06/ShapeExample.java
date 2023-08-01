package ddit.chap07.sec06;

public class ShapeExample {

	public static void main(String[] args) {
		Shape p1 = new Circle("원", new Point(200,100), 15);
		p1.draw();
		
		Shape p2 = new Rectangle("사각형",100,200);
		p2.draw();
		

	}

}
