package ddit.chap04.sec01;

import java.util.Scanner;

public class HW0707 {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		System.out.print("����(1), ����(2), ��(3) �߿� �� ������ �Է��Ͻÿ�. : ");
		
		String str="";
		int a = sc.nextInt();
		
		if(a>0 && a<4) {
			if(a==1) {
				str="����� ������ �½��ϴ�.";
			}else if(a==2) {
				str="����� ������ �½��ϴ�.";
			}else if(a==3) {
				str="����� ���� �½��ϴ�.";	
				
			}
			System.out.println(str);
			System.out.println((int)(Math.random()*3)+1);
		}else {
			str="�ٽ� �Է��Ͻÿ�.";
			System.out.println(str);

			}		
	}
}


