package ddit.chap06.sec01;
//제조사, 생산년도, 크기
public class Tv {
	
	//고정값 가지면 직접초기화, 초기화 블록 사용
	//하지만 주로 고정값이 아닌 경우가 많음
	
	//직접 초기화
	String company="SAMSUNG"; 
	int year=2022;	
	double size=60.5;
	
	{//초기화 블록
		company="LG";
		year=2023;
		size=75.5;		
	}
	
	//생성자 메소드
	
	Tv(String company,int year,double size){
		this.company=company;
		this.year=year;
		this.size=size;		
	}

}
