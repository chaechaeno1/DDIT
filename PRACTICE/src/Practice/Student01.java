/**
 * 학생 정보가 있는 객체
 */

package Practice;

public class Student01 {
	//이름 //나이 //학번 //성적들(5개의 과목 성적) //평균성적 //학점(A,B,C...)
	
	String name="";
	int age;
	String studentNum="";
	int[] score=new int[5];
	int avgScore=0;
	char grade='z';
	
	
	
	
	//public Student01() {
		
	//}
	
	
	public Student01(String name, String studentNum, int age) {
		this.name = name;
		this.studentNum = studentNum;
		this.age = age;
	
	}
	
	public Student01() {
		this.name="홍길동";
		this.age=99;
		this.studentNum="20142233";
		this.score=new int[] {60,70,80,90,100};
		
	}
	
	
	
	
}
