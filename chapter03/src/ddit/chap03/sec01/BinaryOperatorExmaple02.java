package ddit.chap03.sec01;

public class BinaryOperatorExmaple02 {

	public static void main(String[] args) {
		//bitwiserOperator();
		//shiftOperator();
		assignOperator();
	}

	public static void bitwiserOperator() {
		// |, &, ^(exclusive-or, ��Ÿ�� ����)
		// �������� ���ڰ�
		int num1 = 34;
		int num2 = 19;
		System.out.println("&(��Ʈ�� AND) = " + (num1 & num2));
		System.out.println("|(��Ʈ�� OR) = " + (num1 | num2));
		System.out.println("^(��Ÿ�� ����) = " + (num1 ^ num2));
		
	}
	
	public static void shiftOperator() {
		//>>(right), <<(left), >>>(logical right)
		
		int num1 = 17;
		int num2 = -17;
		
		System.out.println("num1>>2 = " + (num1 >> 2));
		System.out.println("num1<<2 = " + (num1 << 2));
		System.out.println("num2>>>2 = " + (num2 >>> 2));
	}
	
	public static void assignOperator() {
		// =
		// +=, -+, *=, /=, %= ;���տ�����
		// ������� ���°� "����1 = ����1 ������(+,-,*,/,%) ��)
		// -> ����1�� ���꿡 �����ϰ� ����� ���Ǵ� ������
		// ����1 ������= ��
		
		int sum = 0;
		for(int i=0; i<1000; i++) {
			//sum=sum+i
			sum+=i;
			
			
		}
		
		
	}
	
	
	
	
	
	
	
}
