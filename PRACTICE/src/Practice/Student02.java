/**
 * 학생 정보가 있는 객체
 * getter와 setter 사용
 * 객체의 값은 직접 접근(ex. yuri.age 등)하면 안된다는 원칙! 
 * getter와 setter 함수를 사용해서 요청  (yuri.getAge(), yuri.getName())
 */
package Practice;

public class Student02 {
	//이름 //나이 //학번 //성적들(5개의 과목 성적) //평균성적 //학점(A,B,C...)

	private String name="";
	private int age=0;
	private String studentNum="";
	private int[] score= new int[5];
	private int avgScore=0;
	private char grade='z';
	
	
	public String getName() {
		return name;

	}
	
	public int getAge() {
		return age;
		
	}
	
	public String getStNum() {
		return studentNum;
		
	}
	
	
	public void setName(String name) {
		this.name=name;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public void setStudentNum(String studentNum) {
		this.studentNum=studentNum;
	}
	
	

	
	
}
