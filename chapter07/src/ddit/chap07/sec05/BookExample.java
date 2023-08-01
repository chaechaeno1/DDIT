package ddit.chap07.sec05;

public class BookExample {

	public static void main(String[] args) {
		
		Novel n1=new Novel("979-1-19-009001-8","우리가 빛의 속도로 갈 수 없다면",14000,"SF/판타지");
		n1.printInfo();
		System.out.println("=============================");
		n1.setSalePrice(0.1);
		n1.printInfo();
		System.out.println("=============================");
		
		TextBook t1=new TextBook("979-1-18-726851-2","문헌정보학개론",20000,"문헌정보");
		t1.printInfo();
		System.out.println("=============================");
		t1.setSalePrice(0.1);
		t1.printInfo();
		System.out.println("*****************************");
		System.out.println("*****************************");
		
		
		Book b1=new Novel("979-1-19-009001-8","우리가 빛의 속도로 갈 수 없다면",14000,"SF/판타지");
		Book b2=new TextBook("979-1-18-726851-2","문헌정보학개론",20000,"문헌정보");
		b1.printInfo();
		System.out.println("=============================");
		b1.setSalePrice(0.1);
		b1.printInfo();
		System.out.println("=============================");
		//b1.refund(); -> novel 클래스에만 있는 메서드이므로 출력불가
		//b2.major="문헌정보"; => TextBook 클래스에만 있는 변수이므로 출력불가
		
		/**
		 * TextBook 클래스의 supplyBook()호출이 요구될때 -> down casting
		 * instanceof 
		 * b2 instanceof Textbook은 "b2 객체가 new Textbook으로 만들어진 객체인가?" 를 묻는 조건식이다.
		 */
		
		
		if(b2 instanceof TextBook) {
			TextBook tb1=(TextBook)b2;
			tb1.supplyBook("한국대학교");
		}
		
		
		


	}

}
