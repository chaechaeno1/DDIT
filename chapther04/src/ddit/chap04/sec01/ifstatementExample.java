package ddit.chap04.sec01;

import java.util.Scanner;

public class ifstatementExample {

	public static void main(String[] args) {
		//method01();
		//method02();
		//method03();
		//method04();
		method05();
	}

		
	public static void method01() {
			//������ �ϳ� �Է� �޾� 60�� �̻�� "�հ�"�� ���

		int score=65;
		if(score>=60) {
			System.out.println("�հ�");
		}

	}
	
	public static void method02() {
		//������ �ϳ� �Է� �޾� 60�� �̻�� "�հ�"�� 60�� �̸��̸� "���հ�"�� ���
		
		int score=59;
		if(score>=60) {
			System.out.println("�հ�");
		}else {
			System.out.println("���հ�");
		}
			
}

	// Q. 1~12���� �ش��ϴ� �� �ϳ��� �Է� �޾�
	// 3~5�� "��" , 6~8�� "����", 9~11�� "����", 12��~2�� "�ܿ�"�� ����Ͻÿ�.
	public static void method03() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�� �Է� :" );
			
		int a = sc.nextInt();
		String season="";
		
		if(a<0 || a>12) {
			System.out.println("�� �Է��� �ùٸ��� �ʽ��ϴ�.");

		}else {
			if(a>=3 && a<=5) {
				season="��";
				
			}else if(a>=6 && a<=8) {
				season="����";
			
			} else if(a>=9 && a<=11) {
				season="����";
			
			} else {
				season="�ܿ�";
					}
				System.out.println("������ "+season+" �Դϴ�.");
				}
				
		
	}
	
	//������ �Է¹޾� �� ���� 
	//100~97 : A+
	//96~93 : A0
	//92~90 : A-
	//89~87 : B+
	//86~83 : B0
	//82~80 : B-
	//�� ���ϴ� F�� ����Ͻÿ�.
	
	public static void method04() {
		int score = 94;
		String grade = "";
		
		if(score <0 || score >100) {
			System.out.println("���� �Է��� �߸��Ǿ����ϴ�.");
		} else {
			if(score>=90) {
				grade="A";
				if(score>96) {
					grade=grade+"+";
				}else if(score>92){
					grade=grade+"0";
				}else {
					grade=grade+"-";
				}
		
			}else if(score>=80){
				grade="B";
				if(score>86) {
					grade=grade+"+";
				}else if(score>82){
					grade=grade+"0";
				}else {
				grade=grade+"-";
				}	
			}else {
				grade="F";
			}
			
		}
		System.out.println("������ "+grade+" �Դϴ�.");
	}

	
	// Q5. Ű(m)�� ü��(kg)�� �Է��Ͽ� BMI������ ���ϰ� BMI������ ���� ������ �Ͻÿ�.
	// BMI ���� = ü�� / (Ű*Ű)
	// 0 ~ 18.4 : ��ü��
	// 18.5 ~ 22.9 : ����
	// 23.0 ~ 24.9 : ��ü��
	// 25.0 ~ 29.9 : ��
	// 30.0 �̻� : ����
	
	public static void method05() {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("-BMI ����-");
		System.out.print("Ű�� �Է��Ͻÿ�. : ");
		String h = sc.nextLine();
		System.out.print("�����Ը� �Է��Ͻÿ�. : ");
		String w = sc.nextLine();
			
		double h2 = Double.parseDouble(h);
		double w2 = Double.parseDouble(w);
		
		h2 = h2/100;
		double bmi = w2 / (h2 * h2);
		String a = "";	
		
		if(bmi<18.5) {
			a = "��ü��";
		} else if (bmi<23){
			a = "����";
		} else if (bmi<25) {
			a = "��ü��";
		} else if (bmi<30) {
			a = "��";
		} else {
			a = "����";
		}
		
		System.out.println("����: " +a);
	
}
}


	
	

