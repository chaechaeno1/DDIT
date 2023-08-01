package ddit.chap05.sec04;

public class ShapeExample {

	public static void main(String[] args) {
		Point[] p=new Point[3];
		Triangle t1=new Triangle(new Point[3]);
		// = Triangle t1=new Triangle(p);
		
		t1.draw();
	}

}
