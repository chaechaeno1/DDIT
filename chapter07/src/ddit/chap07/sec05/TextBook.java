package ddit.chap07.sec05;

public class TextBook extends Book{
	String major; //전공
	
	TextBook(){}
	TextBook(String isbn, String title, int price, String major){
		super(isbn, title, price);
		this.major=major;		
	}
	
	@Override
	public void printInfo() {
		System.out.println("전공분야 : "+major);
		System.out.println("서명 : "+title);
		System.out.println("가격 : "+price);
	}
	
	public void supplyBook(String buyer) {
		System.out.println(buyer+"에게 "+title+" 책을 납품할 예정입니다.");
	}

}
