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
			System.out.println("�հ��Դϴ�.");
		}
		
	}
	public static void method02() {
		int x=0;
		System.out.print("x=%d �� ��, ���� ���� ");
		
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
		 	System.out.print("���ڸ� �ϳ� �Է��Ͻÿ� : ");
		 	
		 int num = sc.nextInt();
		 
		 if(num==0) {
			 System.out.println("�Է��� ���ڴ� 0�Դϴ�.");
		 } else {
			 System.out.println("�Է��� ���ڴ� 0�� �ƴմϴ�.");
		 }
		
	}
	public static void method04() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��Ͻÿ� : ");
		
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
	
		System.out.println(score+"�� ������ "+grade+"�Դϴ�.");
	}
	
	public static void method05() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��Ͻÿ� : ");
		
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
		
		System.out.println(score+"���� ������ "+grade+"�Դϴ�.");
	}
	
	public static void method06() {
		
		
	}
	
	
	
}
