package ddit.chap06.sec01;
/**
 * 문제 1 - 다음을 만족하는 Student 클래스를 작성하시오.
 * String형의 학과와 정수형의 학번을 필드로 선언
 * Student 클래스의 main() 메소드에서 Student 객체를 생성하여 학과와 학번 필드에 적당한 값을 입력 후 출력
 * 
 *
 */


public class StudentExample {

	public static void main(String[] args) {
		Student std=new Student();
		std.setMajor("경영학과");
		std.setStudID(20230155);
		
		System.out.println("학과 : "+std.getMajor());
		System.out.println("학번 : "+std.getStudID());
		
		
		
		
		
		
		
		
		
//		Student std = new Student();
		
//		System.out.println("학과 : "+std.major); //null
//		System.out.println("학번 : "+std.studID); //0
		
//		std.major="경영학과";
//		std.studID=20230115;
		
//		System.out.println("학과 : "+std.major);
//		System.out.println("학번 : "+std.studID);
	}

}
