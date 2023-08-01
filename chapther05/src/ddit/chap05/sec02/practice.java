package ddit.chap05.sec02;

import java.util.Arrays;

public class practice {

	public static void main(String[] args) {
		
		
		int[] s = {50, 75, 35, 90, 26};
		
		//버블정렬
		for(int i=0 ;  i<s.length-1 ; i++) {
			for(int j = 0; j< s.length-1-i ; j++) {
			if(s[j]>s[j+1]) {
			int t = s[j];
			s[j]=s[j+1];
			s[j+1]= t;
			}
			System.out.println(Arrays.toString(s));
			
			
		//선택정렬	
		for(int i1=0; i1<s.length-1;i++) {
			for(int j1=i1+1; j1<s.length;j1++) {
				if(s[i1]>s[j1]) {
					int t=s[i1];
					s[i1]=s[j1];
					s[j1]=t;
				}
				System.out.println(Arrays.toString(s));	
				
				}
			

			}
		}
	}
}
}

