package ddit.chap02.sec02;

public class BooleanExample {

	public static void main(String[] args) {
		//boolean : 1byte�� ����
		//			true/false
		//			�ڸ�� �⺻Ÿ���� boolean���� ��ȯ �Ұ���
		//�ַ� ���ǹ� ������ ���
		//������ �� ���迬����(>,<,==,>=,<=,1=)�� ����������(!, &&, ||)�� ��������
		//boolean ���̴�.
		//�⺻ ���� false.
		
		boolean flag=true;
		int num=200;
		String name="ȫ�浿"; // ������ ����(�ּҰ��� ����)
		// ������ �������� ==�� ����ϸ� �����x �ּҺ�o
		
		System.out.println(flag);
		
		flag=num>1000 && name.equals("ȫ�浿");
		
		System.out.println(flag);
		
		Person p1=new Person();
		Person p2=new Person();
		System.out.println("��ü ����� : "+p1.equals(p2));
		System.out.println("��ü �ּҺ� : "+(p1==p2));
		System.out.println(p1); //16���� ǥ�� �ּҰ�
		
		int a=400;
		long b=300;
		System.out.println(a/b);
		
	}

}


class Person{}