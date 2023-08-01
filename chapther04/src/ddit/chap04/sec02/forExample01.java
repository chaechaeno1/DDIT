package ddit.chap04.sec02;

public class forExample01 {

	public static void main(String[] args) {
		//forMethod01();
		//forMethod02();
		//forMethod03();
		forMethod04();
		
	}
	
	public static void forMethod01() {
		//1���� 10������ ���� �ٿ��� ���
		
		for(int i=1; i<=10; i++) {
			System.out.printf("%-3d",i);
			
			
	}

			
		}
		
	public static void forMethod02() {
		//Q. ���ĺ� A~Z���� ���ٿ� ����Ͻÿ�.
		//�빮�� A = 65
		for(int ch='A'; ch<='Z'; ch++) {
			
			System.out.print((char)ch);
			
		}
	
		
	}
	public static void forMethod03() {
		//0 ~ 50������ fibonacchi number(�Ǻ���ġ ����) ���� ���Ͻÿ�.
		//�Ǻ���ġ ����: ù ��°�� 2��° ���� 1�� �־����� 3��° �� ���� ���� �� ���� ���� 
		//���� ���� �Ǵ� ����(1,1,2,3,5,8,13,...)
		
		//ù��° ��(pp), �ι�° ��(p), ���� ��(c)�� �����ϴ� �ּ����� ���� 3�� �ʿ�
		
		int p=1; //���� ��(n-1)
		int pp=1; //���� �� (n-2)
		int current=0; //���� ��
		
		System.out.printf("%-3d %-3d",p, pp);
		for(int i=0; i<51; i++) {
			current = p+pp;
			if(current>=50) break;
			System.out.printf(" %-3d", current);
			pp=p;
			p=current;
			
		}
	
	
		
	}
	
	public static void forMethod04() {
		// 1 + 1/2 + 1/3 + ... 1/10=?

		double sum = 0.0;
		for(int i=1; i<=10; i++) {
			sum += 1/(double)i;


		}
		System.out.printf("��� = %7.2f", sum);
		
	}
	

}
