package ddit.chap07.sec02;

public class Computer extends Product {
	double discountRate;

	Computer(String prodName, int price, double discountRate) {
		super(prodName, (int)(price*discountRate));
		this.discountRate = discountRate;
	}

}
