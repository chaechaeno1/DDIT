/**
 * 과목 클래스
 * 과목명/ 담당교수/ 강의실 번호
 */
package Practice;

public class Subject {
	
	String subName="";
	String prof="";
	int classNo;
	
	public String getSubName() {
		return subName;
	}
	
	public String getProf() {
		return prof;
	}
	
	public int getClassNo() {
		return classNo;
	}
	
	public void setSubName(String subName) {
		this.subName=subName;
	}
	public void setProf(String prof) {
		this.prof=prof;
	}
	public void setClassNo(int classNo) {
		this.classNo=classNo;
	}
	
}




