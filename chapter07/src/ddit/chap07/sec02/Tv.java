package ddit.chap07.sec02;

public class Tv extends Product {
	double discountRate;

	Tv(String prodName, int price, double discountRate) {
		super(prodName, (int)(price-(price*discountRate)));
		this.discountRate = discountRate;

	}

}
