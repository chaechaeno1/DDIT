package ddit.chap05.sec01;

import java.util.Arrays;

public class ArrayExample01 {

	public static void main(String[] args) {
		method01();
		//practice01();

	}
	public static void method01() {
		
		int[] num=null;
		System.out.println("num="+num);
		
		num=new int[5];
		System.out.println("num="+num);
		
		num[0]=50;
		num[1]=20;
		num[2]=90;
		num[3]=80;
		num[4]=60;
		
		System.out.println("num="+Arrays.toString(num));
		
		
		for(int a: num) {
			System.out.printf("%3d",a);
		}
		System.out.println();
		
		for(int i=0; i<num.length; i++) {
			System.out.printf("%3d",num[i]);
			
			
			
		}
		
		
		
				
	}
	public static void practice01() {
		
		int[] num = {10, 20, 30, 40};
		
		System.out.println(num);
		
		for(int a :num) {
			System.out.printf("%3d", a);
			
		}
		
		
	}
	
	
	
	

}
