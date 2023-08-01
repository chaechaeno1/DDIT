package ddit.chap10.sec01;

public class ExceptionExample05 {

	public static void main(String[] args) throws Exception{
		ExceptionExample05 ex05 = new ExceptionExample05();
//		try {
//			ex05.method01();
//		}catch(Exception e) {}
		ex05.method01();
	}
	
	public void method01() throws Exception{
		method02();
		
	}
	
	public void method02() throws Exception{
		method03();
		
	}
	
	public void method03() throws Exception{
		Class c1=Class.forName("ddit.chap06.sec02.Circle");
		
	}

}
