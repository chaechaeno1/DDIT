package ddit.chap07.sec02;

public class Product {
	String prodName; //멤버변수
	int price; //멤버변수

	Product(String prodName, int price) {
		this.prodName = prodName; //this는 멤버변수 prodName을 참조하기 위함
		this.price = price;

	}
	
	@Override
	public String toString() { //클래스의 객체가 가지고 있는 내용을 반환받을 때
		return "*제품명 : "+prodName+"\n*가격 : "+price;
	}
}
