package ddit.chap05.sec01;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample03 {
	Scanner sc = new Scanner(System.in);
	//메소드 밖에서 선언되어짐. 모든 메소드 안에서 사용 가능. static 메소드 제외.
	//멤버필드
	public static void main(String[] args) {
		//(1)정수배열 10개(score)를 선언하고 (2)키보드를 통하여 값을 입력된 값으로 초기화한 수
		//(3)최대값과 최소값을 구하시오.
		int[] num=new ArrayExample03().setDate(); //하위 메소드에 static이 없는 대신에 선언
		new ArrayExample03().getMaxMin(num); //하위 메소드에 static이 없는 대신에 선언
			
	}
	
	
	public int[] setDate() { //static 없음. void대신 int[] 입력.
		
		int[] number = new int[10]; 
		for(int i=0; i<number.length; i++) {
			System.out.print("number["+i+"]= ");
			number[i]=Integer.parseInt(sc.nextLine()); //엔터치기 전까지의 모든 자료를 문자열로 출력 -> 해당 문자열이 정수로 변환하여 num에 저장
		}
		return number;
	
	
	}
	
	public void getMaxMin(int[] num) { //static 없음.
		
		int tmax= num[0]; //임시최대값
		int tmin=num[0]; //임시최소값
		
		for(int i=1; i<num.length;i++) {
			if(tmax<num[i]) tmax=num[i];
			if(tmin>num[i]) tmin=num[i];
			
		}
		System.out.println("원본 배열 : "+Arrays.toString(num));
		System.out.println("최대값 = "+tmax);
		System.out.println("최소값 = "+tmin);
		
	}
	

}
