package ddit.chap06.sec07;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class StaticExample {

	public static void main(String[] args) {
		Product p1=new Product("볼펜");
		System.out.println(p1);
		System.out.println();
		
		Product p2=new Product("샤프펜슬");
		System.out.println(p2);
		System.out.println();
		
		Product p3=new Product("만년필");
		System.out.println(p3);
		System.out.println();
 
	}
	
}	
//제품정보(자동증가값 : 날짜(8)+3자리 증가값)
//제품명

class Product{
	String prodName;
	
	static LocalDate now=LocalDate.now();
	static DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyyyMMdd");
	static long prodID=Long.parseLong(now.format(formatter)+"000");
	
	
	Product(String prodName){
		prodID++;
		this.prodName=prodName;
		
	}
	
	@Override
	public String toString() {
		return "제품번호 : "+prodID+"\n제품명 : "+prodName;
	}

	

}
