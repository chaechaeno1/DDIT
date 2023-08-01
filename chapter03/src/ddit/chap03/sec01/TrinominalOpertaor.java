package ddit.chap03.sec01;

import java.util.Scanner;

public class TrinominalOpertaor {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		//삼항연산자
		// (조건문)? 명령문1 : 명령문2
		// 조건이 true : 명령문 1 수행, false : 명령문 2 수행
		
		// Q. 나이를 입력 받아 성년인지 미성년인지 판단하시오.
		
		//method1();
		method2();
	}
	
	public static void method1() {

		System.out.print("나이 : ");
		
		int age = Integer.parseInt(sc.nextLine());
		String str = (age>18)?"성년":"미성년";
		
		System.out.println(str+" 입니다.");
		
	}
	
	public static void method2() {
		//키보드로 입력받은 점수가 //Scanner 사용
		// 90~100 : A학점
		//  80~89 : B학점
		//  70~79 : C학점
		//  60~69 : D학점
		//  그 이하  : F학점을 출력하시오.
		System.out.print("점수 : " );
		int score = sc.nextInt();
//		String str = (score>=90 ? "A학점":(score>=80 ? "B학점":
//					 (score>=70 ? "C학점" : (score >= 60 ? "D학점" : "F학점"))));
		String str = (score>=90) ? "A학점" : (score>=80) ? "B학점" :
			(score>=70) ? "C학점" : (score >= 60) ? "D학점" : "F학점";		
		
		System.out.println(score+" => "+str);
		
		
		
		
	}

}
