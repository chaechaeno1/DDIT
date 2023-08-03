package Srtike;

import java.util.Random;
import java.util.Scanner;

public class StrikeGame {

	public static void main(String[] args) {
		
		// 랜덤숫자 생성
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		int r1 = 0;
		int r2 = 0;
		int r3 = 0;
		while(true) {
			r1 = rd.nextInt(9)+1;
			r2 = rd.nextInt(9)+1;
			r3 = rd.nextInt(9)+1;
			if(r1 != r2 && r1 != r3 && r2 != r3) {
				break;
			}
		}
		System.out.printf("정답 : %d, %d, %d", r1, r2, r3);
			
		while(true) {
			int strike = 0;
			int ball = 0;
			System.out.print("숫자1 : ");
			int n1 = sc.nextInt();
			System.out.print("숫자2 : ");
			int n2 = sc.nextInt();
			System.out.print("숫자3 : ");
			int n3 = sc.nextInt();
			
		if(n1 == r1) {
			strike++;
		}else if(n1 == r2 || n1 == r3) {
			ball++;
		}if(n2 == r2) {
			strike++;
		}else if(n2 == r1 || n2 == r3) {
			ball++;			
		}if(n3 == r3) {
			strike++;
		}else if(n3 == r1 || n3 == r2) {
			ball++;			
		}
		
		if(strike==3) {
			System.out.println("정답!");
			break;
		}else if(strike==0 && ball==0) {
			System.out.println("아웃!");
		}else {
			System.out.println(strike+"S "+ball+"B");
		}
	}
	
	}
}

