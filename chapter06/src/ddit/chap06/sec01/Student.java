package ddit.chap06.sec01;

public class Student {
	
	private String major; // 멤버변수
	private int studID; // 멤버 변수
	
	Student(){} //생성자 메서드 : 멤버필드(멤버변수) 초기화
		
	Student(String major, int studID){
		this.major=major;
		this.studID=studID;
		
	
	}
	public String getMajor() {
		return major;
	}
	//get 반환타입  O 매개변수 X -> 무조건 return 있어야함
	//set 반환타입 X 매개변수 O	
		
	public int getStudID() {
		return studID;
	}
	
	public void setMajor(String major) {
		this.major=major;
	}
	
	public void setStudID(int studID) {
		this.studID=studID;
		
	}
	
}


