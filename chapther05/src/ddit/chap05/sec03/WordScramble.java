package ddit.chap05.sec03;

import java.util.Scanner;

public class WordScramble {
	

	private String[] word= {"apple","banana","orange","persimmon","hope"};
	
	//임의의 단어 선택(0~4사이의 난수)
	public String getWord() {
		int rnd=(int)(Math.random()*word.length);
		return word[rnd];
	}

	//한 단어의 철자들을 섞는 과정
	public String shuffle(String str) { //str에 들어있는 단어를 섞어야함
		char[] ch=str.toCharArray();// 문자열을 문자배열로 변환
		for(int i=0; i<1000; i++) { //문자끼리 섞는 횟수가 1000번
			int rnd=(int)(Math.random()*ch.length);//각 단어의 길이가 다르므로 난수 횟수를 ch.length로 범위 지정
			char temp=ch[0];// 임시변수 이용하여 자리 뒤바꿈
			ch[0]=ch[rnd];// 임시변수 이용하여 자리 뒤바꿈
			ch[rnd]=temp;// 임시변수 이용하여 자리 뒤바꿈
		}
		return new String(ch); //랜덤으로 섞인 문자배열을 다시 문자열로 변환
	}
	
	public void answer(String str) {
		int count=0; //시도횟수
		Scanner sc=new Scanner(System.in);
		String anStr=""; // 입력받은 문자열 저장하는 anStr변수 만들어 초기화
		
		while(true) {
		System.out.print("정답 : ");
		anStr=sc.nextLine(); //키보드로 입력
		count++;
			if(str.equalsIgnoreCase(anStr)) { //입력한값(anStr)을 대소문자 구분하지 않고 판단함
				System.out.println("==================");
				System.out.println("정답입니다!");
				System.out.println("시도횟수 :"+count);
				System.out.println("==================");
				
				break;
			}
			
	}
		System.out.println("프로그램 종료.");

	
}

}

