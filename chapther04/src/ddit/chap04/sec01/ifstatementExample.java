package ddit.chap04.sec01;

import java.util.Scanner;

public class ifstatementExample {

	public static void main(String[] args) {
		//method01();
		//method02();
		//method03();
		//method04();
		method05();
	}

		
	public static void method01() {
			//점수를 하나 입력 받아 60점 이상면 "합격"을 출력

		int score=65;
		if(score>=60) {
			System.out.println("합격");
		}

	}
	
	public static void method02() {
		//점수를 하나 입력 받아 60점 이상면 "합격"을 60점 미만이면 "불합격"을 출력
		
		int score=59;
		if(score>=60) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}
			
}

	// Q. 1~12월에 해당하는 월 하나를 입력 받아
	// 3~5월 "봄" , 6~8월 "여름", 9~11월 "가을", 12월~2월 "겨울"을 출력하시오.
	public static void method03() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("월 입력 :" );
			
		int a = sc.nextInt();
		String season="";
		
		if(a<0 || a>12) {
			System.out.println("월 입력이 올바르지 않습니다.");

		}else {
			if(a>=3 && a<=5) {
				season="봄";
				
			}else if(a>=6 && a<=8) {
				season="여름";
			
			} else if(a>=9 && a<=11) {
				season="가을";
			
			} else {
				season="겨울";
					}
				System.out.println("계절은 "+season+" 입니다.");
				}
				
		
	}
	
	//점수를 입력받아 그 값이 
	//100~97 : A+
	//96~93 : A0
	//92~90 : A-
	//89~87 : B+
	//86~83 : B0
	//82~80 : B-
	//그 이하는 F를 출력하시오.
	
	public static void method04() {
		int score = 94;
		String grade = "";
		
		if(score <0 || score >100) {
			System.out.println("점수 입력이 잘못되었습니다.");
		} else {
			if(score>=90) {
				grade="A";
				if(score>96) {
					grade=grade+"+";
				}else if(score>92){
					grade=grade+"0";
				}else {
					grade=grade+"-";
				}
		
			}else if(score>=80){
				grade="B";
				if(score>86) {
					grade=grade+"+";
				}else if(score>82){
					grade=grade+"0";
				}else {
				grade=grade+"-";
				}	
			}else {
				grade="F";
			}
			
		}
		System.out.println("점수는 "+grade+" 입니다.");
	}

	
	// Q5. 키(m)와 체중(kg)을 입력하여 BMI지수를 구하고 BMI지수에 따른 판정을 하시오.
	// BMI 지수 = 체중 / (키*키)
	// 0 ~ 18.4 : 저체중
	// 18.5 ~ 22.9 : 정상
	// 23.0 ~ 24.9 : 과체중
	// 25.0 ~ 29.9 : 비만
	// 30.0 이상 : 고도비만
	
	public static void method05() {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("-BMI 계산기-");
		System.out.print("키를 입력하시오. : ");
		String h = sc.nextLine();
		System.out.print("몸무게를 입력하시오. : ");
		String w = sc.nextLine();
			
		double h2 = Double.parseDouble(h);
		double w2 = Double.parseDouble(w);
		
		h2 = h2/100;
		double bmi = w2 / (h2 * h2);
		String a = "";	
		
		if(bmi<18.5) {
			a = "저체중";
		} else if (bmi<23){
			a = "정상";
		} else if (bmi<25) {
			a = "과체중";
		} else if (bmi<30) {
			a = "비만";
		} else {
			a = "고도비만";
		}
		
		System.out.println("판정: " +a);
	
}
}


	
	

