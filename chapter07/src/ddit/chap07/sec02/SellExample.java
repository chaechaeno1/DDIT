package ddit.chap07.sec02; 

public class SellExample {

	public static void main(String[] args) {
		
		Audio a1=new Audio("BOSS bluetooth audio",50000,0.1);
		Computer c1=new Computer("LG Gram 15.6 inch",980000,0.25);
		Tv t1=new Tv("SAMSUNG LED 70 inch",5600000,0.45);

		System.out.println(a1); //a1.toString
		System.out.println("*할인률 : "+a1.discountRate*100+"%");
		System.out.println("==========================");
		System.out.println(c1); //c1.toString
		System.out.println("*할인률 : "+c1.discountRate*100+"%");
		System.out.println("==========================");
		System.out.println(t1); //t1.toString
		System.out.println("*할인률 : "+t1.discountRate*100+"%");
		System.out.println("==========================");
		
	}

}
