package bookPrinting;

import ddit.chap07.sec05.TextBook;

public class BookExample {

	public static void main(String[] args) {
		
		Novel n1 = new Novel("천 개의 파랑","천선란",14000,"9791190090261","SF/판타지");
		n1.setSaleRate(0.1);
		n1.printInfo();
		System.out.println("=========================");
		
		TextBook t1 = new TextBook("자료조직개론 1(분류)","오동근",30000,"9791187268437","문헌정보");
		t1.setSaleRate(0.2);
		t1.printInfo();
		System.out.println("=========================");
		
		Book b1 = new Novel("천 개의 파랑","천선란",14000,"9791190090261","SF/판타지");
		b1.setSaleRate(0.1);
		b1.printInfo();
		System.out.println("=========================");
		
		Book b2 = new TextBook("자료조직개론 1(분류)","오동근",30000,"9791187268437","문헌정보");
		
		if(b2 instanceof TextBook) {
			TextBook tb1=(TextBook)b2;
			tb1.supply("한국대학교",100);
		}
		
	}

}
