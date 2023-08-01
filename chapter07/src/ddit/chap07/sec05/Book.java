package ddit.chap07.sec05;

public class Book {
	public String isbn; //도서번호
	public String title; //서명
	public int price; //가격
	
	public Book(){} //기본생성자
	public Book(String isbn, String title, int price){
		this.isbn=isbn;
		this.title=title;
		this.price=price;
	}

	//할인가격 설정 메소드
	public void setSalePrice(double discountRate) {
		price=price-(int)(price*discountRate);
	}
	
	public void printInfo() {
		System.out.println("서명 : "+title);
		System.out.println("가격 : "+price);
	}
	

}
