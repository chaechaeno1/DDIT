/**
 * 2차원 배열
 */

// 5명의 3과목 성적이 다음과 같다. 이를 배열에 저장하고 출력하시오.
// [데이터]
/*  국어  영어  수학  
 *  75  80  65
 *  95  85  85
 *  65  85  85
 *  90  60	85		
 *  95	90	95
 */ 
//

package ddit.chap05.sec05;

import java.util.Arrays;

public class TwoDimArrayExample01 {
	static int[][] score; //배열생성X 배열명만 생성O 
	//클래스 하단에 선언하면 하위 메서드에서 모두 적용 가능
	//단, 하단에서 이용하려면 하단과 같이 static 선언해줘야함

	static String[] name;
	
	public static void main(String[] args) {
		method01();
		printScore();
		sortData();

	} 
	public static void method01() {
	
		//세 과목의 총점 구하는 법
		//score[i][3]+=score[i][j];
		

		score=new int[][] {{75,80,65,0,0,1},{95,85,85,0,0,1},{65,85,85,0,0,1},
							{90,60,85,0,0,1},{95,90,95,0,0,1}};
		
		name = new String[] {"홍길동","이순신","홍길순","이성계","강감찬"};
		
		for(int i=0;i<score.length;i++) { //행
			for(int j=0;j<3;j++) { //열
				score[i][3]+=score[i][j];
			}
			score[i][4]=score[i][3]/3;
		}
		getRank();
		
	}
	public static void printScore() {
		System.out.println("===================================");
		System.out.println("이　름　 국어 　영어    수학   총점　  평균　　등수");
		System.out.println("===================================");
		for(int i=0;i<score.length;i++) {//밖 for문 : 행
			System.out.print(name[i]+" ");
			for(int j=0;j<score[i].length;j++) {//안 for문 : 열
				System.out.printf("%5d",score[i][j]);				
			}
			System.out.println(); 
		}
		

		}
	public static void getRank() {
		for(int i=0;i<score.length;i++) {//기준값 위치
			for(int j=0; j<score.length;j++) {//비교값 위치
				if(score[i][3]<score[j][3]) score[i][5]++;
			
				}
				
			}		
	}
	
	//bubble sort 적용
	//1등부터 순서대로 출력하기
	public static void sortData() {
		for(int i=0; i<score.length-1;i++) {
			for(int j=0; j<score.length-1-i;j++) {
				if(score[j][3]<score[j+1][3]) {
					//이름 순서 바꾸기
					String temp=name[j];
					name[j]=name[j+1];
					name[j+1]=temp;
					
					for(int k=0; k<score[j].length;k++) {
						int t = score[j][k];
						score[j][k] = score[j+1][k];
						score[j+1][k] = t;
					}				
				}				
			}
			System.out.println("\n\n\n");
			printScore();
		}
			
	}
}
