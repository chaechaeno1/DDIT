package MING0710;

import java.util.Scanner;

public class study01 {

	public static void main(String[] args) {
		//method01();
		//method02();
		//method03();
		//method04();
		method05();
		
	}
	
	public static void method01() {
		
		int score = 75;
		
		if(score>60) {
			System.out.println("합격입니다.");
		}
		
	}
	public static void method02() {
		int x=0;
		System.out.print("x=%d 일 때, 참인 것은 ");
		
		if(x==0) {
			System.out.println("x==0");
		}
		if(x!=0) {
			System.out.println("x!=0");
		}
		if(!(x==0)) {
			System.out.println("!(x==0)");

		}
		
		
	}
	public static void method03() {
		
		Scanner sc = new Scanner(System.in);
		 	System.out.print("숫자를 하나 입력하시오 : ");
		 	
		 int num = sc.nextInt();
		 
		 if(num==0) {
			 System.out.println("입력한 숫자는 0입니다.");
		 } else {
			 System.out.println("입력한 숫자는 0이 아닙니다.");
		 }
		
	}
	public static void method04() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하시오 : ");
		
		int score = sc.nextInt();
		String grade ="";
		
		if(score>=90) {
			grade = "A";
		} else if(score>=80) {
			grade ="B";
		} else if(score>=70) {
			grade = "C";
		} else {
			grade = "D";
		}
	
		System.out.println(score+"의 학점은 "+grade+"입니다.");
	}
	
	public static void method05() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하시오 : ");
		
		int score = sc.nextInt();
		String grade = "";
		
		
		if (score>=90) {
			grade = "A";
			if(score>=98) {
				grade = grade+"+";
			}else if(score>=94) {
				grade = grade+"0";
			}else {
				grade = grade+"-";
			}
		
		}else if(score>=80) {
			grade = "B";
			if(score>=88) {
				grade = grade+"+";
			}else if(score>=84) {
				grade = grade+"0";
			}else {
				grade = grade+"-";
			}
		}else {
			grade = "C";
		}		
		
		System.out.println(score+"점의 학점은 "+grade+"입니다.");
	}
	
	public static void method06() {
		
		
	}
	
	
	
}
