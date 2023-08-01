package ddit.chap04.sec04;

import java.io.IOException;
import java.util.Scanner;

public class whileExample01 {

	public static void main(String[] args) {
		try {
		Whilestatement ws = new Whilestatement();
		//ws.whileMetod01();
		//ws.whileMetod02();
		ws.whileMetod03();
		}catch(IOException e) {
		e.printStackTrace();

	}

}


class Whilestatement{
	public void whileMetod01() {
		// Q. 1~100사이의 홀수와 짝수의 합
		
		int cnt=1; // 1~100사이의 값을 보관
		int even=0; //짝수의 합
		int odd=0; //홀수의 합
		
		while(cnt<101){
			if(cnt%2==0) {
				even+=cnt;
			}else {
				odd+=cnt;
			}
			cnt++;
		}			
		System.out.println("홀수의 합 = "+odd);
		System.out.println("짝수의 합 = "+even);
	}
	
	public void whileMetod02() {
		//키보드로 숫자 하나를 입력 받아 각 자리 수의 합을 구하시오.
		//(ex. 23456 => 2+3+4+5+6 = 20
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 하나를 입력하시오 : ");
		int num = sc.nextInt();
		int sum = 0;
	
		
		while(num!=0) {
			sum+=num%10;
			num/=10;
						
		}
		System.out.println("입력한 숫자의 각 자리의 합은 "+sum+"입니다.");
		
	}
	
	public void whileMetod03(){
		//컴퓨터가 1~50사이의 난수를 하나 발생시키고
		//사용자가 그 숫자를 맞추는 게임
		//컴퓨터 난수 > 사용자입력 숫자 => "더 큰수 입력"
		//컴퓨터 난수 < 사용자입력 숫자 => "더 작은수 입력"
		//컴퓨터 난수 =사용자입력 숫자 => "정답입니다"
		
		int ch=0;
		int comNum = ((int)(Math.random()*50)+1);
		int cnt=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 하나(1~50)를 입력하시오 : ");
		int userNum=sc.nextInt();
		cnt++;
		

			do {
				userNum=sc.nextInt();
			while(true) {
				if(userNum==comNum) {
					System.out.println("정답입니다!");
					System.out.println("시도횟수 : "+cnt);
				}else if(userNum>comNum) {
					System.out.print("더 작은 수를 입력하시오: ");
				}else {
					System.out.print("더 큰 수를 입력하시오: ");
				}
				
				cnt++;
			}
			System.out.println("계속 하시겠습니까?");
			
			}while((char)(ch=System.in.read())=='y');

		}


	
	}
}


