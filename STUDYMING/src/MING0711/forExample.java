package MING0711;

import java.util.Scanner;

public class forExample {

	public static void main(String[] args) {
		//method01();
		//method02();
		//method03();
		//method04();
		//method05();
		method06();
	}
	public static void method01() {
		
		for(int i=1;i<=5;i++) {
			System.out.println(i);
		}
		for(int i=1;i<=5;i++) {
			System.out.print(i);
		}
		
	}
	public static void method02(){
		
		int sum = 0;
		
		for(int i=1;i<=5;i++) {
			sum += i ;
			System.out.printf("1부터 %2d 까지의 합:%2d%n", i, sum);
		}
	}
	public static void method03(){
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	public static void method04(){
		
		int i = 5;
		
		while(i--!=0) {
			System.out.println(i+"- I can do it.");
		}
	}
	public static void method05() {
		int sum = 0;
		int i = 0;
		
		while(sum<=100) {
			System.out.printf("%d - %d%n", i, sum);
			sum += ++i;
		}
		
	}
	public static void method06() {

		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		
		int num= sc.nextInt();
		int sum=0;
		
		while(num!=0) {
			sum += num%10; // 10으로 나머지 연산하면 마지막 자리 알 수 있음
			System.out.printf("sum=%3d num=%d%n", sum, num);
			
			num/= 10; //10으로 나누면 마지막 한자리 제거
		}
		System.out.println("각 자리수의 합:"+sum);
	
		
	}
	
}
