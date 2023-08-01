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
			
			// 공백 j for문
			for(int j = 0; j < 4-i; j++) {
				System.out.print(" ");
			} 
			
			// 별 j for문
			for(int j=0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();// 줄바꿈
		}
		
	}
	public static void method02 () {
		//고정된 값에서 증가값을 뺌
		
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

