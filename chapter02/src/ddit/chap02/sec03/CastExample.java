package ddit.chap02.sec03;

import java.util.Scanner;//�����Է� or �ڵ�����

public class CastExample {

	public static void main(String[] args) {
		round();

	}

	public static void round() {
		//���� �ڸ��� �Ҽ����� �����ϴ� �Ǽ��� Ű����� �Է� �޾� �Ҽ��� 3�ڸ�����
		//�ݿø� �� ����Ͻÿ�...
		//Ű����� �Է�
		// 1) Scanner class import
		//	  import java.util.scanner;
		// 2) Scanner class ��ü����-new ������ ���
		//	  Scanner sc=new Scanner(System.in);
		// 3) �Է¸޽��� ��� - System.out.print("�޽���")
		//	  System.out.print("�Ǽ��ڷ� �Է� : ");
		// 4) �Է��ڷ� ���� - Scanner class�� �Է��ڷ����� �´� �޼��� ���
		//	    �����Է� : nextInt(), �Ǽ��Է� : nextFloat(), nextDouble(),
		//	    ���ڿ� : next(), nextLine(),...
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�Ǽ��ڷ� �Է� : ");
		double number = sc.nextDouble();
		
		double number1=number;
		number1=(int)((number1*100)+0.5)/100.; //100�ڿ� .������ �Ǽ� ���. ������ ���� ���.
		System.out.println("number1="+number1);
		
		number=(number*100)+0.5;
		number=(int)number;
		number=number/100;
		System.out.println("number="+number);
		
		
		//23.4269�� �Ҽ��� 3�ڸ� �ݿø�(10^3-1 + 0.5)
		
		
		long a = 10000000000L;
		System.out.println(a);
	}
	
	
}
