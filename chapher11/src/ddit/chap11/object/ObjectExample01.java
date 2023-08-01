package ddit.chap11.object;

public class ObjectExample01 {

	public static void main(String[] args) {
		
		Person p1 = new Person("정몽주");
		Person p2 = new Person("정몽주");
		String p3 = "정몽주";
		
		System.out.println("p1 = "+p1);
		System.out.println("p2 = "+p2);
		
		System.out.println("p1 = "+p1.toString());
		System.out.println(p1.classInfo());
		System.out.println(p1.equals(p3));
		
		if(p1==p2) {
			System.out.println("같은 객체");
		}else {
			System.out.println("다른 객체");
		}
		
		if(p1.toString().equals(p2.toString())) {
			System.out.println("같은 내용");
		}else {
			System.out.println("다른 내용");
		}

	}
}

class Person{
	String name;
	
	Person(){}
	Person(String name){
		this.name=name;
	}
	
	public String classInfo() {
		return getClass().getName()+'@'+hashCode();
	}
	
	@Override
	public String toString() {
		return name;
	}
}