package ddit.chap04.sec01;

import java.util.Scanner;

public class ifstatementExample02 {

	public static void main(String[] args) {
		//method1(); //하단의 메서드를 입력하여 호출
		method2();
	}
	
	public static void method1() {
		//키보드로 숫자 하나를 입력받고,
		//컴퓨터에서 난수를 입력받아 두 수를 비교
		//같은 값이면 "정답입니다"를 출력하시오.
		
		
		Scanner sc = new Scanner(System.in);
			System.out.print("숫자 하나(1~10)를 입력하시오 -> ");
		
		int userNum = sc.nextInt(); 
		//사용자가 입력한 값을 int로 초기화
		//.은 소속을 의미. nextInt()는 sc에 포함

		int comNum = (int)((Math.random()*10)+1); // 1~10사이의 정수형 난수
		//0.0 <= Math.random() < 1.0 //double 타입의 임의의 수
		//0 <= (int)(Math.random()*10) < 10
		//1 <= (int)(Math.random()*10)+1 < 11
		
		if(userNum>0 && userNum<11) {
			if(userNum==comNum) {
				System.out.println("정답입니다. Computer Number : "+comNum);
							
			}else {
				System.out.println("정답이 아닙니다. Computer Number :"+comNum);
			}
		}else {
			System.out.println("다시 입력하시오.");
	
		} 
	}

	
	public static void method2() {
		//키보드로 숫자 하나(1~10)를 입력받고,
		//컴퓨터에서 난수(1~10)를 입력받아 두 수를 비교
		//(1)컴퓨터에서 생성된 수가 사용자의 숫자보다 더 큰 수이면
		//	"더 큰 수를 입력하시오."를 출력하고
		//(2)컴퓨터에서 생성된 수가 사용자의 숫자보다 더 작은 수이면
		//	"더 작은 수를 입력하시오. "를 출력하고
		//(3)컴퓨터에서 생성된 수와 사용자의 숫자가 같으면
		//  "정답입니다."를 출력하시오.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 하나(1~10)를 입력하시오 -> ");
		
		int userNum = sc.nextInt();
		int comNum = (int)((Math.random()*10)+1);
		
		
		
		while(true) {
			
			if(userNum < comNum) {
				System.out.print("더 큰수를 입력하시오. : ");							
			}else if(userNum > comNum) {
				System.out.print("더 작은 수를 입력하시오. :");	
			}else {
				System.out.println("정답입니다.");
				break;
			}
			userNum = sc.nextInt(); // 이미 만들어 놓은 변수라 int 생략
	
		} 
		}
		
	
	

}

