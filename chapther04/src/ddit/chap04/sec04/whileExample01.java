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
		// Q. 1~100������ Ȧ���� ¦���� ��
		
		int cnt=1; // 1~100������ ���� ����
		int even=0; //¦���� ��
		int odd=0; //Ȧ���� ��
		
		while(cnt<101){
			if(cnt%2==0) {
				even+=cnt;
			}else {
				odd+=cnt;
			}
			cnt++;
		}			
		System.out.println("Ȧ���� �� = "+odd);
		System.out.println("¦���� �� = "+even);
	}
	
	public void whileMetod02() {
		//Ű����� ���� �ϳ��� �Է� �޾� �� �ڸ� ���� ���� ���Ͻÿ�.
		//(ex. 23456 => 2+3+4+5+6 = 20
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �ϳ��� �Է��Ͻÿ� : ");
		int num = sc.nextInt();
		int sum = 0;
	
		
		while(num!=0) {
			sum+=num%10;
			num/=10;
						
		}
		System.out.println("�Է��� ������ �� �ڸ��� ���� "+sum+"�Դϴ�.");
		
	}
	
	public void whileMetod03(){
		//��ǻ�Ͱ� 1~50������ ������ �ϳ� �߻���Ű��
		//����ڰ� �� ���ڸ� ���ߴ� ����
		//��ǻ�� ���� > ������Է� ���� => "�� ū�� �Է�"
		//��ǻ�� ���� < ������Է� ���� => "�� ������ �Է�"
		//��ǻ�� ���� =������Է� ���� => "�����Դϴ�"
		
		int ch=0;
		int comNum = ((int)(Math.random()*50)+1);
		int cnt=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �ϳ�(1~50)�� �Է��Ͻÿ� : ");
		int userNum=sc.nextInt();
		cnt++;
		

			do {
				userNum=sc.nextInt();
			while(true) {
				if(userNum==comNum) {
					System.out.println("�����Դϴ�!");
					System.out.println("�õ�Ƚ�� : "+cnt);
				}else if(userNum>comNum) {
					System.out.print("�� ���� ���� �Է��Ͻÿ�: ");
				}else {
					System.out.print("�� ū ���� �Է��Ͻÿ�: ");
				}
				
				cnt++;
			}
			System.out.println("��� �Ͻðڽ��ϱ�?");
			
			}while((char)(ch=System.in.read())=='y');

		}


	
	}
}


