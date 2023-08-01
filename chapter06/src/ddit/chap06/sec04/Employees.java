package ddit.chap06.sec04;
// 사원 클래스
// 사원번호(empID), 사원명(empName), 부서명(deptName), 급여(salary)
// 5명의 사원정보를 생성하여 저장하고 
// 전체조회, 개별조회를 수행하는 메서드 생성
public class Employees {
	private String empID;
	private String empName;
	private String deptName;
	private int salary;
	
	
//기본 생성자 : 클래스 이름과 동일, 매개변수X
	public Employees() {}
	//Employees() {}
	
//사원번호, 사원명, 부서명만 입력받는 생성자(salary는 0으로 설정)
	public Employees(String empID, String empName,String deptName) {
		this.empID=empID;
		this.empName=empName;
		this.deptName=deptName;	
		salary=0;
		//지역변수에 salary가 없으므로 this 유무 상관 없음.
	}
	
//급여를 설정하는 메서드 : 세터 반환타입 X, 매개변수 O
	public void setSalary(int salary) {
		this.salary=salary;

	
	}
	

	public String getEmpID() {
		return empID;
	}


	public String getEmpName() {
		return empName;
	}


	public String getDeptName() {
		return deptName;
	}

	
}

