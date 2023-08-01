package ddit.chap02.sec03;

public class PromotionExample {

	public static void main(String[] args) {
		int num1=100;
		short s1=15;
		byte b1=15; //1byte
		char ch1='b'; 
		float f1=0f;
		long l1=1000L;
		
		int res=0;
		short res1=0; //2byte
		float res2=0f;
		
		res=s1+ch1; //res는 int로 타입 변환
		res1=(short)(s1+b1); //res1=(short)s1+(short)b1;//int가 출력되므로 각각에 short X 
		res2=l1+f1;
		System.out.println(res); //113
		System.out.println(res1); //30
		System.out.println(res2); //1000.0
	}

}
