package ddit.chap02.sec02;

public class CharExample {

	public static void main(String[] args) {
		// char : 2byte(��ȣ ���� ���� : 0 ~ 65535)
		// 			' ' �ȿ� ǥ���ϴ� �� ���� ����, ' ���ѹα�'
		//			ASCII�� ��ȯ�Ͽ� ����
		
		char ch1 = 'a';
		char ch2 = '��';
		char ch3 = '��';
		
		System.out.println("ch1="+ch1);
		System.out.println("ch1="+(ch1+1));
		System.out.println("ch=2"+(int)ch2);
		System.out.println(ch2+ch3);
		
		// ABCD......Z���
		for(char c = 'A'; c<='Z'; c++) {
			System.out.print(c);
	
		}
		
		System.out.println(); //�ٹٲ�
		
		for(int i=65; i<=90; i++) {
			System.out.print((char)i); //int�� char�� ��ȯ
		}
		
		byte b1=100; //char ��ȯ �ȵ�
		short s1=67; //char ��ȯ �ȵ�
		//char ch4=s1; (byte->char (x)) char�� ����ǥ�� �Ұ���
		//char ch5=b; (short->char (x))
		
		char ch6='a';
		short s2=(short)ch6; // (������) : ĳ��Ʈ ������
		
		int res=ch6; //
		 
		
	}

}
