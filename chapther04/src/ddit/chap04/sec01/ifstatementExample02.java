package ddit.chap04.sec01;

import java.util.Scanner;

public class ifstatementExample02 {

	public static void main(String[] args) {
		//method1(); //�ϴ��� �޼��带 �Է��Ͽ� ȣ��
		method2();
	}
	
	public static void method1() {
		//Ű����� ���� �ϳ��� �Է¹ް�,
		//��ǻ�Ϳ��� ������ �Է¹޾� �� ���� ��
		//���� ���̸� "�����Դϴ�"�� ����Ͻÿ�.
		
		
		Scanner sc = new Scanner(System.in);
			System.out.print("���� �ϳ�(1~10)�� �Է��Ͻÿ� -> ");
		
		int userNum = sc.nextInt(); 
		//����ڰ� �Է��� ���� int�� �ʱ�ȭ
		//.�� �Ҽ��� �ǹ�. nextInt()�� sc�� ����

		int comNum = (int)((Math.random()*10)+1); // 1~10������ ������ ����
		//0.0 <= Math.random() < 1.0 //double Ÿ���� ������ ��
		//0 <= (int)(Math.random()*10) < 10
		//1 <= (int)(Math.random()*10)+1 < 11
		
		if(userNum>0 && userNum<11) {
			if(userNum==comNum) {
				System.out.println("�����Դϴ�. Computer Number : "+comNum);
							
			}else {
				System.out.println("������ �ƴմϴ�. Computer Number :"+comNum);
			}
		}else {
			System.out.println("�ٽ� �Է��Ͻÿ�.");
	
		} 
	}

	
	public static void method2() {
		//Ű����� ���� �ϳ�(1~10)�� �Է¹ް�,
		//��ǻ�Ϳ��� ����(1~10)�� �Է¹޾� �� ���� ��
		//(1)��ǻ�Ϳ��� ������ ���� ������� ���ں��� �� ū ���̸�
		//	"�� ū ���� �Է��Ͻÿ�."�� ����ϰ�
		//(2)��ǻ�Ϳ��� ������ ���� ������� ���ں��� �� ���� ���̸�
		//	"�� ���� ���� �Է��Ͻÿ�. "�� ����ϰ�
		//(3)��ǻ�Ϳ��� ������ ���� ������� ���ڰ� ������
		//  "�����Դϴ�."�� ����Ͻÿ�.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �ϳ�(1~10)�� �Է��Ͻÿ� -> ");
		
		int userNum = sc.nextInt();
		int comNum = (int)((Math.random()*10)+1);
		
		
		
		while(true) {
			
			if(userNum < comNum) {
				System.out.print("�� ū���� �Է��Ͻÿ�. : ");							
			}else if(userNum > comNum) {
				System.out.print("�� ���� ���� �Է��Ͻÿ�. :");	
			}else {
				System.out.println("�����Դϴ�.");
				break;
			}
			userNum = sc.nextInt(); // �̹� ����� ���� ������ int ����
	
		} 
		}
		
	
	

}

