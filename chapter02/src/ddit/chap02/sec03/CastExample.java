package ddit.chap02.sec03;

import java.util.Scanner;//직접입력 or 자동생성

public class CastExample {

	public static void main(String[] args) {
		round();

	}

	public static void round() {
		//여러 자리의 소수점을 포함하는 실수를 키보드로 입력 받아 소수점 3자리에서
		//반올림 후 출력하시오...
		//키보드로 입력
		// 1) Scanner class import
		//	  import java.util.scanner;
		// 2) Scanner class 객체생성-new 연산자 사용
		//	  Scanner sc=new Scanner(System.in);
		// 3) 입력메시지 출력 - System.out.print("메시지")
		//	  System.out.print("실수자료 입력 : ");
		// 4) 입력자료 저장 - Scanner class의 입력자료형에 맞는 메서드 사용
		//	    정수입력 : nextInt(), 실수입력 : nextFloat(), nextDouble(),
		//	    문자열 : next(), nextLine(),...
		
		Scanner sc = new Scanner(System.in);
		System.out.print("실수자료 입력 : ");
		double number = sc.nextDouble();
		
		double number1=number;
		number1=(int)((number1*100)+0.5)/100.; //100뒤에 .찍으면 실수 출력. 없으면 정수 출력.
		System.out.println("number1="+number1);
		
		number=(number*100)+0.5;
		number=(int)number;
		number=number/100;
		System.out.println("number="+number);
		
		
		//23.4269의 소수점 3자리 반올림(10^3-1 + 0.5)
		
		
		long a = 10000000000L;
		System.out.println(a);
	}
	
	
}
