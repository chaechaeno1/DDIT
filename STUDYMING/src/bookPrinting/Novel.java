package bookPrinting;

public class Novel extends Book{
	String genre;
	
	Novel(){}
	Novel(String title, String author, int price, String isbn, String genre){
		super(title, author, price, isbn);
		this.genre=genre;
	}
	
	@Override
	public void printInfo() {
		System.out.println("서명: "+title);
		System.out.println("저자: "+author);
		System.out.println("가격: "+price);
		System.out.println("ISBN: "+isbn);
		System.out.println("장르: "+genre);
		
		
	}
	public void refund() {
		System.out.println("소설책을 반품하다...");
	}
	
	
	

}
