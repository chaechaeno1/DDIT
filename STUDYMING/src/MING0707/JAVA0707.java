package MING0707;

import java.util.Scanner;

public class JAVA0707 {

	public static void main(String[] args) {
		
		//STUDY_1();
		//STUDY_2();
		//STUDY_3();

		
	}
	
	public static void STUDY_1() {
		
	
		// Q. ���̸� �Է� �޾� �������� �̼������� �Ǵ��Ͻÿ�. ���׿����� �̿�.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���̸� �Է��Ͻÿ�. : ");
		
		int age = sc.nextInt();
		
		String a = (age>18)?"�����Դϴ�.":"�̼����Դϴ�.";
		System.out.println(a);
		
	}
	
	public static void STUDY_2() {
		//Ű����� �Է¹��� ������ //Scanner ���
		// 90~100 : A����
		//  80~89 : B����
		//  70~79 : C����
		//  60~69 : D����
		//  �� ����  : F������ ����Ͻÿ�. ���׿����� �̿�.
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��Ͻÿ�. : ");
		
		int score = sc.nextInt();
		String a = (score>=90)?"A����":(score>=80)?"B����":(score>=70)?"C����":(score>=60)?"D����":"F����";
		
		System.out.println(score+"=>"+a);
		
	}
	
	public static void STUDY_3() {
		//������ �ϳ� �Է� �޾� 60�� �̻�� "�հ�"�� ���
		//60�� �̸��̸� "���հ�"�� ���
		
		int score=59;
		if(score>=60) {
			System.out.println("�հ�");
		}else {
			System.out.println("���հ�");
		}
		
		

	
	
	
	
	
	}
}
