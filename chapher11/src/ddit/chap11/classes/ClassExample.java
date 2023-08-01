package ddit.chap11.classes;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import ddit.chap11.object.ObjectExample02;

public class ClassExample {

	public static void main(String[] args) throws Exception{
		//자바에서 사용되는 모든 class와 interface들의 일반적 정보
		
		Class c1 = ObjectExample02.class;
		Class c2 = Byte.class;
		Class c3 = Class.forName("ddit.chap07.sec05.Book");
		
//		//getName() : 클래스명(패키지 포함) 확인
//		System.out.println(c1.getName());
//		//getSimpleName() : 클래스명(패키지 미포함) 확인
//		System.out.println(c1.getSimpleName());
//		//getPackage() : 패키지명 확인
//		System.out.println(c1.getPackage());
//		//getConstructors() : 생성자메소드 정보반환 -> Constructor 클래스 타입의 배열로 반환
		Constructor[] constructors = c3.getConstructors();
		Method[] methods=c3.getDeclaredMethods();
		Field[] fields = c3.getDeclaredFields(); //public 필드만 반환
		Field[]	fieldInher=c3.getDeclaredFields(); //상속받은 필드만 반환

		for(Constructor c:constructors) {
			System.out.println("생성자 : "+c);
		}
		for(Method m: methods) {
			System.out.println("메서드 : "+m);
		}
		
		for(Field f: fields) {
			System.out.println("필드명 : "+f.getName());
			System.out.println("필드타입 : "+f.getType());
			
		}
		
	}
	

}
