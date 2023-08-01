package ddit.chap10.sec01;

public class ExceptionExample02 {

	public static void main(String[] args) {
		exceptionMethod01();
	}

	public static void exceptionMethod01() {
		// 1/5 + 1/4 + 1/3 + 1/2 ....
		double sum=0;
		try {
			for(int i=5; i>=0; i--) {
				sum+=(1/i);
			}
			System.out.println("합="+sum); //try문에서 예외처리 발생. catch문으로 바로 넘어감. 출력안됨.
		}catch(Exception e) {
//			System.out.println("예외발생");
			System.out.println(e.getMessage());
		}finally {
			System.out.println("예외처리 종료");
			
		
	
		}
	}
}
	
