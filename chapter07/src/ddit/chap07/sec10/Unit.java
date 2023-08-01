package ddit.chap07.sec10;


interface Repairable{}

public class Unit {
	int hitPoint; //쓰고 남은 파워 양
	final int MAX_HP; //상수는 최초 1회 초기값이 고정
	
	Unit(int hp){
		MAX_HP=hp;
		
	}
}


class GroundUnit extends Unit{
	GroundUnit(int hp){
		super(hp);
	}
}

class AirUnit extends Unit{
	AirUnit(int hp){
		super(hp);
	}
}



class Tank extends GroundUnit implements Repairable{
	Tank(){
		super(150); //MAX_HP
		hitPoint=MAX_HP;
	}
	
	@Override
	//주소값 출력X return 문자값 반환
	// public String toString()는 무조건 변형XXX
	public String toString() { //Object클래스
		return "탱크";
	}
}

class DropShip extends AirUnit implements Repairable{
	DropShip(){
		super(125);//MAX_HP
		hitPoint=MAX_HP;
	}
	
	@Override
	public String toString() { //Object클래스
		return "수송선";
	}
}

class SCV extends GroundUnit implements Repairable{
	SCV(){
		super(50);//MAX_HP
		hitPoint=MAX_HP;
	}

	public void repair(Repairable r) {
		if(r instanceof Unit) {
			Unit u = (Unit)r;
			while(u.hitPoint != u.MAX_HP) {
				u.hitPoint++;
			}
			System.out.println(u+"의 수리 완료.");
		}
	}
	
	@Override
	public String toString() { //Object클래스
		return "수리공장";
	}
}

class Marine extends GroundUnit {
	Marine(){
		super(30);
		hitPoint=MAX_HP;
	}
	
	@Override
	public String toString() { //Object클래스
		return "해병";
	}
}



