package ddit.chap04.sec03;
// 1)        2)   
// *				*	
// **			   **
// ***		      ***
// **** 		 ****
// ***** 		*****

public class NestedForExample02 {

	public static void main(String[] args) {
		method01();
		
	}
	public static void method01() {

		for(int i = 0; i<5; i++) {
			for(int j = 0; j<=i; j++) {
				System.out.print("*");
			}System.out.println();
		}

	}
	
}

