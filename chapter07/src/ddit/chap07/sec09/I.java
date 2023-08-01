package ddit.chap07.sec09;

class A{
	public void methodA(B b) { //B클래스 타입
		b.methodB();
	}
		
	public void methodA(I i) { //인터페이스 타입
		i.methodB();

	}
}

class B implements I{
	public void methodB() {
		System.out.println("B클래스의 methodB");
	}
}
	
	
class C implements I{
	public void methodB() {
		System.out.println("C클래스의 methodB");
	
}
}


public interface I {
	void methodB();

}



