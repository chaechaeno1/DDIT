package ddit.chap04.sec01;

import java.util.Scanner;

public class ifStatementExmaple03 {

	public static void main(String[] args) {
		method1();

	}
	public static void method1() {
		//Ű����� ���̵�� �н����带 �Է¹޾� �α��εǴ� �����̴�. (���ڿ��� �̸� ����)
		//���� ���̵� ���Ͽ� ���̵� ��ġ�ϸ� ��й�ȣ�� ���ϰ�
		//���̵� ��ġ���� ������ "���̵� ��ġ���� �ʽ��ϴ�."�� ����ϰ�
		//���α׷������� �����ϸ�, ��й�ȣ�� ���� ������� ���Ͽ�
		//��� ��ġ�ϸ� "xx�� ȯ���մϴ�"��� �޽����� ����Ͻÿ�.
		
		String id = "e1004";
		String pw = "1234";
		
		Scanner sc = new Scanner(System.in);
		System.out.print("ID�� �Է��Ͻÿ� : ");	
		String uid = sc.nextLine(); 
		System.out.print("PW�� �Է��Ͻÿ� : ");	
		String upw = sc.nextLine(); 
		//next() : ���� ���� ��� �ڷḦ ����
		//nextLine() : enterŰ ġ�� �������� ��� �ڷḦ ����
		
		//if(id==uid) ��� ������ �ȵ�! id�� ������ �ƴ� �ּҰ�.
		//��ü ���� ������ ���(���� ���ϱ� ���ؼ���) .equals ���.
		//������ ���� : �迭, Ŭ����(�빮�ڷ� ����), ������, �������̽�
		//equealsIgnoreCase ����ϸ� ��ҹ��� �� ���ص���.
		if(id.equals(uid)) {
			if(pw.equals(upw)) {
				System.out.println(uid+"�� ȯ���մϴ�.");
			}else {
				System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
			}
		}else {
			System.out.println("���̵� ��ġ���� �ʽ��ϴ�.");
		
		}
		
	}
	

}
