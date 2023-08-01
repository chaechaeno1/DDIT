package ddit.chap06.sec05;

public class Customer {
	private int money;
	private int bonusPoint;
	private String cart=""; //구입한 목록 저장
	
	
	Customer() {}
	
	public void buy(Tv t) {
		money+=t.price;
		bonusPoint+=t.bonusPoint;
		cart+=","+t;
	}
	
	public void buy(Computer c) {
		money+=c.price;
		bonusPoint+=c.bonusPoint;
		cart+=","+c;
	}
	
	public void buy(Audio a) {
		money+=a.price;
		bonusPoint+=a.bonusPoint;
		cart+=","+a;
	}
	
	public void summary() {
		System.out.print("구입품목 : "+cart.substring(1));
		System.out.println("\n구입금액 합계 : "+money);
		System.out.println("적립포인트 : "+bonusPoint);
		
		
	}
	

	
	}
	


// TV t = Tv t.toString

