package ddit.chap06.sec02;
//정수형 원점의 좌표(x,y)와 실수 타입의 가로와 세로를 입력받아 사각형을 만드는
//클래스를 설계하고, 사각형의 면적을 계산하는 메서드를 포함 시키시오.

public class Retangle {
	private Point p1;
	private double width;
	private double height;
	
	Retangle(Point p1, double width, double height){
		this.p1=p1;
		this.width=width;
		this.height=height;
		
		
		
	}
	
	public void getArea() {
		double area= width*height;
		System.out.println(p1+" 위치에 존재하는 사각형의 넓이 : "+area);
		
	}
	

}
