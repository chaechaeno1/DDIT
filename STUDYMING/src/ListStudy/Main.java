package ListStudy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

	//primitive type 기본타입
	
	int a;
	boolean b=true;
	float f=0;
	
	//wrapper type 래퍼클래스
	//첫글자 대문자
	
	Integer i = 0;
	Boolean bb = true;
	Float ff = 0f;
	
	public static void main(String[] args) {
		
		//배열은 사이즈가 정해져 있음
		int[] arr = new int[3];
		
		//리스트 선언
		List<Integer> list = new ArrayList<>();
		
		//리스트에 값 넣기
		list.add(1); //0번째 인덱스
		list.add(2); //1번째 인덱스
		list.add(3); //2번째 인덱스
		
		System.out.println("=========리스트 출력==========");
		
		//리스트 출력
		for(int i:list) {
			System.out.println(i);
		}
		
		System.out.println("=========리스트 출력 2==========");
		//리스트 출력 -> 인덱스로 출력
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		
		System.out.println("=========0번째 인덱스 값 빼기=========");
		//리스트에 값 빼기
		list.remove(0);
		for(int i:list) {
			System.out.println(i);
		}
		
		System.out.println("=======리스트 사이즈 출력==========");
		System.out.println(list.size());
		
		System.out.println("===성적리스트 만들기===");
		List<Integer> scores = new ArrayList<>();
		
		scores.add(70);
		scores.add(60);
		scores.add(45);
		scores.add(90);
		scores.add(100);

		for(int i:scores) {
			System.out.println(i);
		}
		
		System.out.println("===성적정렬하기===");
		scores.sort(Comparator.naturalOrder());
		for(int i:scores) {
			System.out.println(i);
		}
		
		System.out.println("===성적역순정렬===");
		scores.sort(Comparator.reverseOrder());
		for(int i:scores) {
			System.out.println(i);
		}
		
		System.out.println("====배열 정렬====");
		int[] arrayScores = {70, 85, 45, 100};
		
		Arrays.sort(arrayScores);
		
		for(int i:arrayScores) {
			System.out.println(i);
		}
		
		System.out.println("===배열복사====");
		//배열 역순 정렬은 Integer(wrapper type)만 가능
		
		Integer[] arrayScores2 = new Integer[arrayScores.length];
		
		//배열복사
		for(int i=0; i<arrayScores2.length; i++) {
			
			arrayScores2[i]=arrayScores[i];
			System.out.println(arrayScores2[i]);
		}
		
		System.out.println("==배열 역순 정렬==");
		
		Arrays.sort(arrayScores2, Collections.reverseOrder());
		
		for(int i:arrayScores2) {
			System.out.println(i);
		}
		
		
		
	}

}
