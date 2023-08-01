package ddit.chap05.sec08;

public enum LimitedSpeed {
	//각 상수에 30, 50, 70을 부여
	//꼭 순서대로인 값만 인덱스가 아닌 임의로 상수를 부여할 수 있음
	SchoolZone(30),
	DownTown(50),
	CountrySide(70);
	
	//values는 정수형 상수를 보관
	private final int values; //인덱스 30,50,70을 보관하는 상수

	
	LimitedSpeed(int values){ //enum 클래스 생성자 메서드(인덱스를 보유한 enum 클래스가 생성되어질 수 있도록)
		this.values=values;
	}
	
	public int getValues() { //해당 인덱스(values)를 enum 클래스를 호출한 위치에 반환
		return values;
	}
	
}
