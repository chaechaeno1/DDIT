package ddit.chap03.sec01;

public class BinaryOperatorExmaple02 {

	public static void main(String[] args) {
		//bitwiserOperator();
		//shiftOperator();
		assignOperator();
	}

	public static void bitwiserOperator() {
		// |, &, ^(exclusive-or, 배타적 논리합)
		// 연산결과가 숫자값
		int num1 = 34;
		int num2 = 19;
		System.out.println("&(비트별 AND) = " + (num1 & num2));
		System.out.println("|(비트별 OR) = " + (num1 | num2));
		System.out.println("^(배타적 논리합) = " + (num1 ^ num2));
		
	}
	
	public static void shiftOperator() {
		//>>(right), <<(left), >>>(logical right)
		
		int num1 = 17;
		int num2 = -17;
		
		System.out.println("num1>>2 = " + (num1 >> 2));
		System.out.println("num1<<2 = " + (num1 << 2));
		System.out.println("num2>>>2 = " + (num2 >>> 2));
	}
	
	public static void assignOperator() {
		// =
		// +=, -+, *=, /=, %= ;결합연산자
		// 연산식의 형태가 "변수1 = 변수1 연산자(+,-,*,/,%) 값)
		// -> 변수1은 연산에 참여하고 결과가 기억되는 기억공간
		// 변수1 연산자= 값
		
		int sum = 0;
		for(int i=0; i<1000; i++) {
			//sum=sum+i
			sum+=i;
			
			
		}
		
		
	}
	
	
	
	
	
	
	
}
