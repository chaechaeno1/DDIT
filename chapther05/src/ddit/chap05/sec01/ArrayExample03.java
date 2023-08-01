package ddit.chap05.sec01;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample03 {
	Scanner sc = new Scanner(System.in);
	//�޼ҵ� �ۿ��� ����Ǿ���. ��� �޼ҵ� �ȿ��� ��� ����. static �޼ҵ� ����.
	//����ʵ�
	public static void main(String[] args) {
		//(1)�����迭 10��(score)�� �����ϰ� (2)Ű���带 ���Ͽ� ���� �Էµ� ������ �ʱ�ȭ�� ��
		//(3)�ִ밪�� �ּҰ��� ���Ͻÿ�.
		int[] num=new ArrayExample03().setDate(); //���� �޼ҵ忡 static�� ���� ��ſ� ����
		new ArrayExample03().getMaxMin(num); //���� �޼ҵ忡 static�� ���� ��ſ� ����
			
	}
	
	
	public int[] setDate() { //static ����. void��� int[] �Է�.
		
		int[] number = new int[10]; 
		for(int i=0; i<number.length; i++) {
			System.out.print("number["+i+"]= ");
			number[i]=Integer.parseInt(sc.nextLine()); //����ġ�� �������� ��� �ڷḦ ���ڿ��� ��� -> �ش� ���ڿ��� ������ ��ȯ�Ͽ� num�� ����
		}
		return number;
	
	
	}
	
	public void getMaxMin(int[] num) { //static ����.
		
		int tmax= num[0]; //�ӽ��ִ밪
		int tmin=num[0]; //�ӽ��ּҰ�
		
		for(int i=1; i<num.length;i++) {
			if(tmax<num[i]) tmax=num[i];
			if(tmin>num[i]) tmin=num[i];
			
		}
		System.out.println("���� �迭 : "+Arrays.toString(num));
		System.out.println("�ִ밪 = "+tmax);
		System.out.println("�ּҰ� = "+tmin);
		
	}
	

}
