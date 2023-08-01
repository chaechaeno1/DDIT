package ddit.chap04.sec01;

import java.util.Scanner;

public class switchstatementExample {

	private static final int True = 0;
	public static void main(String[] args) {
		//method1();
		//method2();
		method3();
		
	}

	public static void method1() {
		//키보드로 입력받은 수를 평가하여 짝수와 홀수를 구별하시오.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하시오 : ");
		
		int num = sc.nextInt();
		
		switch(num%2) {
			case 0:
				System.out.println(num+"은 짝수입니다.");
				break;
			case 1:
				System.out.println(num+"은 홀수입니다.");	
								
		}	
			
		
			}
	public static void method2() {
		//1~12사이의 숫자를 입력받아 그 값이
		//3~5월 : 봄
		//6~8월 : 여름
		//7~9월 : 가을
		//11~1월 : 겨울
					
		Scanner sc1 = new Scanner (System.in);
		System.out.print("월을 입력하시오 : ");
		
		int month = sc1.nextInt();
		
		
		switch(month) {
		case 3:	case 4: case 5:
			System.out.println("봄입니다.");
			break;
		case 6: case 7: case 8:
			System.out.println("여름입니다.");
			break;
		case 9: case 10: case 11:
			System.out.println("가을입니다.");
			break;
		case 12: case 1:case 2:	
			System.out.println("겨울입니다.");
			break;
		default : 
			System.out.println("월 입력이 잘못되었습니다.");
	
		}
		
		
	}
	public static void method3() {
		//회원들의 마일리지에 따라
		//마일리지가 1000 ~ 3999이면 "일반회원 입니다."
		//마일리지가 4000 ~ 6000이면 "우수회원 입니다."
		//그 이상이면 "VIP회원 입니다."를 비고에 출력하시오.
		//입력자료는 회원번호, 회원명, 마일리지이고
		//출력은 회원번호, 회원명, 마일리지, 비고
		 
		
		Scanner sc = new Scanner(System.in);
		System.out.print("회원번호 : ");
		String mNum = sc.nextLine();
		System.out.print("회원명 : ");
		String mName = sc.nextLine();
		System.out.print("마일리지 : ");
		int mPoint = sc.nextInt();
		String kind ="";
		
		switch(mPoint/1000) {
		case 0:
			kind="비회원";
			break;
		case 1: case 2: case 3:
			kind="일반회원";
			break;
		case 4: case 5: case 6:
			kind="우수회원";
			break;
		default :
			kind="VIP회원";
		
		
		}
		
		System.out.println("회원번호 :"+mNum);
		System.out.println("회원명 :"+mName);
		System.out.println("마일리지 :"+mPoint);
		System.out.println("비고 :"+kind);
	
	}
	
	
	
	
	
	
}
