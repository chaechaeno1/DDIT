package ddit.chap05.sec02;

import java.util.Arrays;

public class SortExample {

	public static void main(String[] args) {
		//BubbleSort bubbleSort = new BubbleSort(); 
		//bubbleSort.sort();
		SelectionSort selectionSort = new SelectionSort();
		selectionSort.selectionSort();
		selectionSort.printData();
		
	}

}


class BubbleSort {
	private int[] number; //private-> class �ȿ����� ȣ�� ����//number�� ����ʵ�
	
	BubbleSort() { //class�̸��� �Ȱ��� �޼ҵ�� ������ �޼ҵ�-> ����ʵ� �ʱ�ȭ
		number=new int[] {27, 35, 19, 5, 47, 80, 15, 65, 50, 12};
	}
	
	public void sort() {
		boolean flag=true;
		System.out.println("[원본 데이터]");
		System.out.println(Arrays.toString(number));
		for(int i=0; i<number.length-1; i++) { //number.length-1�� ȸ����
			flag=true;
			for(int j=0; j<number.length-1-i; j++) { //ȸ����(number.length-1)-i��  ��ȯȽ��
				if(number[j]>number[j+1]) {
					int temp=number[j];
					number[j]=number[j+1];
					number[j+1]=temp;
					flag=false; //�ڸ��ٲ��� �Ͼ ��
				}
			}
			if(flag) break; //flag=true�� �ڸ��ٲ��� �Ͼ�� �ʾ��� �� �ǹ�
		}
		System.out.println("[정렬된 데이터]");
		System.out.println(Arrays.toString(number));
		
	}
	

		
		
	}

class SelectionSort {
	private int[] num;
	//num = 멤버 변수= 인스턴스 변수
	//해당 클래스 내에서는 어디서든 사용 가능
	
	public SelectionSort() { //생성자: 인스턴스 변수(num) 초기화
		num= new int[]{35, 40, 70, 16, 95, 19, 27, 63, 88, 57} ;
		
	}
	public void selectionSort() {
		System.out.println("[ 원본 데이터 ]");
		System.out.println(Arrays.toString(num));
		for(int i=0; i<num.length-1; i++) { //회전 담당
			for(int j=i+1; j<num.length; j++) { //각 회전에서 비교 담당
				if(num[i]>num[j]) { 
					int temp=num[i];
					num[i]=num[j];
					num[j]=temp;
				}
			}
		}	
		
	}
	
	public void printData() {
		System.out.println("[ 정렬된 데이터 ]");
		System.out.print("[");
		for(int su:num) {
			System.out.printf("%-2d, ",su);
		}
		System.out.println("]");
	}
	
	
}


