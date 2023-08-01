package bookPrinting;

public class TextBook extends Book{
	String major;
	
	TextBook(){}
	TextBook(String title, String author, int price, String isbn, String major){
		super(title, author, price, isbn);
		this.major=major;
		
	}
	@Override
	public void printInfo() {
		System.out.println("서명: "+title);
		System.out.println("저자: "+author);
		System.out.println("가격: "+price);
		System.out.println("ISBN: "+isbn);
		System.out.println("전공분야: "+major);
		
		
	}
	
	public void supply(String buyer, int amount) {
		System.out.println(buyer+"에게 "+title+" 책을 "+amount+"권 납품할 예정입니다.");
	}

}
