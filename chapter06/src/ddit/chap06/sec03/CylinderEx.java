package ddit.chap06.sec03;
//· CylinderEx 클래스의 main() 메소드에서 반지름이 2.8, 높이가 5.6의 원통의 부피를 출력

public class CylinderEx {

	public static void main(String[] args) {
		Cylinder cylinder = new Cylinder(new Circle(2.8),5.6);
		cylinder.getVolume();
		
		

	}

}
