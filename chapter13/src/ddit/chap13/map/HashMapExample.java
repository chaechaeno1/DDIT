package ddit.chap13.map;
/* 
 * 학번(정수), 이름(문자열)자료를 저장하는 map
 */

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapExample {

	public static void main(String[] args) {
		mapMethod01();

	}
	
	public static void mapMethod01() {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		//put(k, v) : 자료 저장
		map.put(1001, "홍길동");
		map.put(1101, "정몽주");
		map.put(2011, "이성계");
		map.put(1903, "임현우");
		
		//map 전체자료 출력
		System.out.println(map);
		// 출력값 : {1001=홍길동, 2011=이성계, 1101=정몽주, 1903=임현우}
		// HashMap은 데이터의 순서가 보장되지 않는다.
		// 내용 확인하는 정도로 쓰이며, 자주 쓰이지 않는다.
		
		//get(key값) : key값으로 value 추출
		System.out.println(map.get(2011));
		
		//set은 map을 list로 변환시킬때 주로 사용
		//entry 객체를 이용하여 순차검색
		System.out.println("학번        이름");
		System.out.println("============");
		for(Entry<Integer, String> entrySet : map.entrySet()) {
			if(entrySet.getKey()==1101) {
				System.out.println("이름 : "+entrySet.getValue());
			}
			//System.out.println(entrySet.getKey()+"   "+entrySet.getValue());
		}
		
		//map의 keySet()을 이용한 검색
		for(Integer i: map.keySet()) {
			System.out.println(i+" => "+map.get(i));
			
		}
		
	}

}
