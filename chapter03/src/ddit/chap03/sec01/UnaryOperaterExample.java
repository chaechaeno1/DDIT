package ddit.chap03.sec01;
//단항연산자 : ++(--), +(-) -> 부호, !(NOT)
public class UnaryOperaterExample {

	public static void main(String[] args) {
		//incrementOperator();
		signOperator();

	}

	public static void incrementOperator() {
		int res = 0;
		int incre = 10;
		int decre = 10;
		
		res = incre++;
		System.out.println("res="+res+", incre="+incre);
		
		res = 0;
		res = --decre;
		System.out.println("res="+res+", decre="+decre);
		
		int[] arr= {10, 20, 30, 40, 50};
		for(int i=0; i<arr.length;) {
			System.out.println(arr[i++]);
		}
		
	}

	public static void signOperator() {
		//음수(-)와 양수(+ 또는 생략)
		int sum = 0; // 결과
		int sign = -1 ; // 부호
		int cnt = 1;// 시작(1,2,3,...10)
		
		while(cnt<=10) {
			sign=sign*(-1);
			sum=sum+(sign*cnt);
			if(sign>0 && cnt!=1) {
				System.out.print("+"+cnt);
			}else {
			System.out.print(sign*cnt);
				
		}
		cnt++;
		
	}
	System.out.println("="+sum);	
	}
}
	
	
	

