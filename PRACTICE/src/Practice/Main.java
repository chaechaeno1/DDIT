/**
 * 대학교 성적 계산기
 */

package Practice;

public class Main {

	
		public static void main(String[] args) {
			//이름, 나이, 학번, 과목명, 평균점수(배열사용, 5과목 점수)
			//성적 변수(ABCEF....)	
			
			String name="";
			int age=0;
			String studentNum="";
			String subject="";
			int score=0;
			int[] scores= new int[] {75, 80, 95, 100, 70};
			char grade='z';
			
			//점수 평균값이 90 이상 A, 80 이상 B, 70 이상 C, 그 아래 F
			
			int total =0;
			
			for(int s:scores) { //s는 출력하기 위한 임의의 변수명
				//배열 또는 배열을 리턴하는 함수
				//System.out.printf(" %2d",s);
				
				total += s;
			}
			System.out.println(total);
			score=total/scores.length;
			System.out.println(score);
			
			if(score>=90) {
				grade='A';
			}else if(score>=80) {
				grade='B';
			}else if(score>=70) {
				grade='c';
			}else {
				grade='F';
			}

			System.out.println(score+"점의 학점은 "+grade+"입니다.");
			


/**
 * 하나의 학생이 아닌 여러 명 이라면?
 * 
 * 객체(하나의 틀)을 만든다.
 * 붕어빵(객체=인스턴스, 만들어 낸 것) - 붕어빵 틀(Class)
 * 
 */

	//김철수
	Student01 chulsu = new Student01();
	chulsu.name="김철수";
	chulsu.age=20;
	chulsu.studentNum="20230332";
	chulsu.score=new int[] {100,50,80,90,60};
	
	System.out.println(chulsu.name);
	System.out.println(chulsu.age);
	
	//김유리
	Student01 yuri = new Student01("김유리","20230011",20);
	System.out.println(yuri.name);
	System.out.println(yuri.age);
	
	//홍길동
	Student01 gildong=new Student01();
	System.out.println(gildong.name);
	System.out.println(gildong.age);
	
	
	//신짱구
	
	Student02 jjangu = new Student02();
	jjangu.setName("신짱구");
	jjangu.setAge(20);
	
	
	System.out.println(jjangu.getName());
	System.out.println(jjangu.getAge());
	
	
	//과목 객체
	Subject sub=new Subject();
	sub.setSubName("데이터베이스 이론");
	sub.setProf("홍길동");
	sub.setClassNo(123);
	
	System.out.println(sub.getSubName());
	System.out.println(sub.getProf());	
	System.out.println(sub.getClassNo());
	
		}
		

		
}

