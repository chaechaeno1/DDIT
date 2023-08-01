package ddit.chap02.sec02;

public class CharExample {

	public static void main(String[] args) {
		// char : 2byte(부호 없는 정수 : 0 ~ 65535)
		// 			' ' 안에 표현하는 한 글자 저장, ' 대한민국'
		//			ASCII로 변환하여 저장
		
		char ch1 = 'a';
		char ch2 = '대';
		char ch3 = '한';
		
		System.out.println("ch1="+ch1);
		System.out.println("ch1="+(ch1+1));
		System.out.println("ch=2"+(int)ch2);
		System.out.println(ch2+ch3);
		
		// ABCD......Z출력
		for(char c = 'A'; c<='Z'; c++) {
			System.out.print(c);
	
		}
		
		System.out.println(); //줄바꿈
		
		for(int i=65; i<=90; i++) {
			System.out.print((char)i); //int를 char로 변환
		}
		
		byte b1=100; //char 변환 안됨
		short s1=67; //char 변환 안됨
		//char ch4=s1; (byte->char (x)) char는 음수표현 불가능
		//char ch5=b; (short->char (x))
		
		char ch6='a';
		short s2=(short)ch6; // (정수형) : 캐스트 연산자
		
		int res=ch6; //
		 
		
	}

}
