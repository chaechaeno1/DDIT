package ddit.chap04.sec02;

public class forExample01 {

	public static void main(String[] args) {
		//forMethod01();
		//forMethod02();
		//forMethod03();
		forMethod04();
		
	}
	
	public static void forMethod01() {
		//1부터 10사이의 수를 붙여서 출력
		
		for(int i=1; i<=10; i++) {
			System.out.printf("%-3d",i);
			
			
	}

			
		}
		
	public static void forMethod02() {
		//Q. 알파벳 A~Z까지 한줄에 출력하시오.
		//대문자 A = 65
		for(int ch='A'; ch<='Z'; ch++) {
			
			System.out.print((char)ch);
			
		}
	
		
	}
	public static void forMethod03() {
		//0 ~ 50사이의 fibonacchi number(피보나치 수열) 값을 구하시오.
		//피보나치 수열: 첫 번째와 2번째 수가 1로 주어지고 3번째 수 부터 전의 두 수의 합이 
		//현재 수가 되는 수열(1,1,2,3,5,8,13,...)
		
		//첫번째 수(pp), 두번째 수(p), 현재 수(c)를 포함하는 최소한의 변수 3개 필요
		
		int p=1; //이전 항(n-1)
		int pp=1; //전전 항 (n-2)
		int current=0; //현재 수
		
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
		System.out.printf("결과 = %7.2f", sum);
		
	}
	

}
