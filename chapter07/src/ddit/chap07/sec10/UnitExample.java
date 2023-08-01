package ddit.chap07.sec10;

public class UnitExample {

	public static void main(String[] args) {
		Tank tank = new Tank();
		
		Unit u = new Tank(); //업캐스팅
		SCV scv = new SCV();
		
		scv.repair(new Tank());
		scv.repair(tank);
		//scv.repair(u); //부모는 repair를 implements 하지 않아서 오류
		
		
		
		
		
	
		
	}

	
	
}
