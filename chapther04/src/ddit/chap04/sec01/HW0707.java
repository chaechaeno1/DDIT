package ddit.chap04.sec01;

import java.util.Scanner;

public class HW0707 {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		System.out.print("가위(1), 바위(2), 보(3) 중에 한 가지를 입력하시오. : ");
		
		String str="";
		int a = sc.nextInt();
		
		if(a>0 && a<4) {
			if(a==1) {
				str="당신은 가위를 냈습니다.";
			}else if(a==2) {
				str="당신은 바위를 냈습니다.";
			}else if(a==3) {
				str="당신은 보를 냈습니다.";	
				
			}
			System.out.println(str);
			System.out.println((int)(Math.random()*3)+1);
		}else {
			str="다시 입력하시오.";
			System.out.println(str);

			}		
	}
}


