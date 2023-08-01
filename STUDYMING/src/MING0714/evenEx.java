package MING0714;

import java.util.Scanner;

public class evenEx {

	
	public static void main(String[] args) {
		//method01();
		//method02();
		//method03();
		//method04();
		method05();

	}
	
	public static void method01() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();
		
		if(num%2==0) {
			System.out.println("짝수입니다!");
		}else {
			System.out.println("짝수가 아닙니다...");
		}
		
	}
	
	public static void method02() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		
		if(age>=18) {
			System.out.println("투표권 있는 유권자입니다!");
			System.out.println("출생년도 : "+(2023-(age-1))+"년");
		}
		
		
	}
	public static void method03() {
		
		
		int rnd = (int)(Math.random()*50)+1;
		
		if(rnd%5==0) {
			System.out.println("랜덤 숫자("+rnd+")는 5의 배수 입니다!");
		}else {
			System.out.println("랜덤 숫자("+rnd+")는 5의 배수가 아닙니다...");
		}
		
	}
	public static void method04() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("가위(1), 바위(2), 보(3) 중 하나를 입력하시오 : ");
		int rsp = sc.nextInt();
		
		int rnd = (int)(Math.random()*3)+1;
		
		int res = rnd-rsp;
		
		if(res==-1 || res==2) {
			System.out.println("com : "+rnd+"\nuser :"+rsp+"==> user 승리!");	
		}else if(res==-2 || res==1) {
		}
		}
		
		
	public static void method05() {
		
	

}
}
