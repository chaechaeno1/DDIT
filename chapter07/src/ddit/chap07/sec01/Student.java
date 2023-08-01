package ddit.chap07.sec01;

public class Student extends People {
	int grade;
	String name;
	
	Student(String name, int age, String gender,int grade){
		super(name, age, gender);
		this.grade=grade; //super보다 앞서 선언하면 안됨
		
	}
	
	public void printInfo() {
		System.out.println("학년 : "+grade);
		System.out.println("이름 : "+super.name);
		System.out.println("나이 : "+age);
		System.out.println("성별 : "+gender);
		
	}
	

}
