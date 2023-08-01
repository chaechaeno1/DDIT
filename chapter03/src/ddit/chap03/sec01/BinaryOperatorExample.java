package ddit.chap03.sec01;

import java.util.Scanner; // �ϴ� Scanner�Է� �� �߰�

public class BinaryOperatorExample {

	public static void main(String[] args) {
		//arithmeticOperator();
		//relationalOperator();
		//relationalOperator2();
		logicalOperator();
	}
	
	
	public static void arithmeticOperator() {
		//+, -, *, / , %
		//1~100������ ¦���� �հ� Ȧ���� ���� ���Ͻÿ�.
		int even = 0; //¦���� ��
		int odd = 0; //Ȧ���� ��
		
		for(int i=1; i<101; i++) {
			if(i%2==0) {
				even=even+i;
			}else {
				odd=odd+i;
			}
			
		}
		System.out.println("¦���� ��="+even);
		System.out.println("Ȧ���� ��="+odd);
	}
	
	
	public static void relationalOperator() {
		//��(����)���� : ũ���(>,<,=,>=,<=,!=(<>))
		//	����� true/false�̰�, �ַ� ���ǹ��� ���
		
		//Ű����� �Է¹��� ������ //Scanner ���
		// 90~100 : A����
		//  80~89 : B����
		//  70~79 : C����
		//  60~69 : D����
		//  �� ����  : F������ ����Ͻÿ�.
		
		String grade=""; //���ڿ�
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int score = sc.nextInt();
		if(score >=90) {
			grade="A����";
		}else if(score >=80) {
			grade="B����";
		}else if(score >=70) {
			grade="C����";
		}else if(score >=60) {
			grade="D����";
		}else {
			grade="F����";
		}
		
		System.out.println(score+"������ "+grade+"�Դϴ�");
	}
	
	public static void relationalOperator2() {
		
		//Ű����� ����(10�� �̻�)�� �Է¹޾� �׻���� ��� ������ ���ϴ��� ���
		// ex) 35���� -> "30�� �Դϴ�", 56���� -> "50�� �Դϴ�"
		
		//String age1="";
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int age=Integer.parseInt(sc.nextLine());
		//int age = sc.nextInt();
		int age1=(age/10)*10;
		String message = age1+"�� �Դϴ�.";
		System.out.println(age+"���� "+message);
		
//		if(age >=60 && age<=69) {
//			age1="60��";	
//		}else if(age >=50 && age<=59) {
//			age1="50��";
//		}else if(age >=40 && age<=49) {
//			age1="40��";
//		}else if(age >=30 && age<=39) {
//			age1="30��";
//		}else if(age >=20 && age<=29) {
//			age1="20��";
//		}else {
//			age1="10��";
//	}

// System.out.println(age+"����"+age1+"�Դϴ�.");
}

	
	
	public static void logicalOperator() {
		//�������� : !(NOT) , &&(AND), ||(OR) (���� �켱����)
		//�ڽ��� ����⵵�� �Է� �޾� ����� ����� �Ǵ��Ͻÿ�.
		//����:(1)4�� ����̸鼭 100�� ����� �ƴ� ���̰ų�, (2)400�� ����� �Ǵ� ��
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�⵵ : ");
		int year = Integer.parseInt(sc.nextLine());
		
		if((year%4==0 && year%100!=0) || (year%400==0)) {
			System.out.println(year+"���� �����Դϴ�.");
		}else {
			System.out.println(year+"���� ����Դϴ�.");
		
			
			
	}
}
}
