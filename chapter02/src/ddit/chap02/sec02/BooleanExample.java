package ddit.chap02.sec02;

public class BooleanExample {

	public static void main(String[] args) {
		//boolean : 1byte에 저장
		//			true/false
		//			★모든 기본타입은 boolean으로 변환 불가능
		//주로 조건문 구성에 사용
		//연산자 중 관계연산자(>,<,==,>=,<=,1=)와 논리연산자(!, &&, ||)의 연산결과는
		//boolean 값이다.
		//기본 값은 false.
		
		boolean flag=true;
		int num=200;
		String name="홍길동"; // 참조형 변수(주소값이 찍힘)
		// 참조형 변수에서 ==을 사용하면 내용비교x 주소비교o
		
		System.out.println(flag);
		
		flag=num>1000 && name.equals("홍길동");
		
		System.out.println(flag);
		
		Person p1=new Person();
		Person p2=new Person();
		System.out.println("객체 내용비교 : "+p1.equals(p2));
		System.out.println("객체 주소비교 : "+(p1==p2));
		System.out.println(p1); //16진수 표현 주소값
		
		int a=400;
		long b=300;
		System.out.println(a/b);
		
	}

}


class Person{}
