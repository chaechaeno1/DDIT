package ddit.chap07.sec02;

public class Audio extends Product {
	double discountRate;

	Audio(String prodName, int price, double discountRate) {
		super(prodName, (int)(price*discountRate));
		this.discountRate = discountRate;

	}



}
