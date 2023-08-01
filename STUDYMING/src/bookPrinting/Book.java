package bookPrinting;

public class Book {
	String title;
	String author;
	int price;
	String isbn;
	
	Book(){}
	Book(String title, String author, int price, String isbn){
		this.title=title;
		this.author=author;
		this.price=price;
		this.isbn=isbn;
	}
	
	public void setSaleRate(double discountRate) {
		price=price-(int)(price*discountRate);
		
	}
	
	public void printInfo() {
		System.out.println("서명: "+title);
		System.out.println("저자: "+author);
		System.out.println("가격: "+price);
		System.out.println("ISBN: "+isbn);
		
		
	}
	

}
