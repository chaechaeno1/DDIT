package ddit.chap04.sec03;

public class NestedForExample021 {

	public static void main(String[] args) {
		//method01();
		//method02();
		//method03();
		method04();
		
	}
	public static void method01 () {
		
		for(int i = 0; i<5; i++) {
			
			// ���� j for��
			for(int j = 0; j < 4-i; j++) {
				System.out.print(" ");
			} 
			
			// �� j for��
			for(int j=0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();// �ٹٲ�
		}
		
	}
	public static void method02 () {
		//������ ������ �������� ��
		
		for(int i=0; i<5; i++) {
			for(int j = 0; j<5-i; j++) {
				System.out.print("*");
			}
			for(int j=0; j <= i; j++) {
				System.out.print("");
			}
			System.out.println();
		}
		
	
	}
	public static void method03() {
		for(int i = 0; i<5; i++) {
			for(int j=0; j < i; j++) {
				System.out.print(" ");
			}
			for(int j=0; j <5-i; j++) {
				System.out.print("*");
		}
		System.out.println();
		
		
		
	}

}
	public static void method04() {
		
		
		
	}
	
}

