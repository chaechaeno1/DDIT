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
		//Ű����� �Է¹��� ���� ���Ͽ� ¦���� Ȧ���� �����Ͻÿ�.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �Է��Ͻÿ� : ");
		
		int num = sc.nextInt();
		
		switch(num%2) {
			case 0:
				System.out.println(num+"�� ¦���Դϴ�.");
				break;
			case 1:
				System.out.println(num+"�� Ȧ���Դϴ�.");	
								
		}	
			
		
			}
	public static void method2() {
		//1~12������ ���ڸ� �Է¹޾� �� ����
		//3~5�� : ��
		//6~8�� : ����
		//7~9�� : ����
		//11~1�� : �ܿ�
					
		Scanner sc1 = new Scanner (System.in);
		System.out.print("���� �Է��Ͻÿ� : ");
		
		int month = sc1.nextInt();
		
		
		switch(month) {
		case 3:	case 4: case 5:
			System.out.println("���Դϴ�.");
			break;
		case 6: case 7: case 8:
			System.out.println("�����Դϴ�.");
			break;
		case 9: case 10: case 11:
			System.out.println("�����Դϴ�.");
			break;
		case 12: case 1:case 2:	
			System.out.println("�ܿ��Դϴ�.");
			break;
		default : 
			System.out.println("�� �Է��� �߸��Ǿ����ϴ�.");
	
		}
		
		
	}
	public static void method3() {
		//ȸ������ ���ϸ����� ����
		//���ϸ����� 1000 ~ 3999�̸� "�Ϲ�ȸ�� �Դϴ�."
		//���ϸ����� 4000 ~ 6000�̸� "���ȸ�� �Դϴ�."
		//�� �̻��̸� "VIPȸ�� �Դϴ�."�� ��� ����Ͻÿ�.
		//�Է��ڷ�� ȸ����ȣ, ȸ����, ���ϸ����̰�
		//����� ȸ����ȣ, ȸ����, ���ϸ���, ���
		 
		
		Scanner sc = new Scanner(System.in);
		System.out.print("ȸ����ȣ : ");
		String mNum = sc.nextLine();
		System.out.print("ȸ���� : ");
		String mName = sc.nextLine();
		System.out.print("���ϸ��� : ");
		int mPoint = sc.nextInt();
		String kind ="";
		
		switch(mPoint/1000) {
		case 0:
			kind="��ȸ��";
			break;
		case 1: case 2: case 3:
			kind="�Ϲ�ȸ��";
			break;
		case 4: case 5: case 6:
			kind="���ȸ��";
			break;
		default :
			kind="VIPȸ��";
		
		
		}
		
		System.out.println("ȸ����ȣ :"+mNum);
		System.out.println("ȸ���� :"+mName);
		System.out.println("���ϸ��� :"+mPoint);
		System.out.println("��� :"+kind);
	
	}
	
	
	
	
	
	
}
