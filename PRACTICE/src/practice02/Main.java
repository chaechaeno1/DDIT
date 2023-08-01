package practice02;

public class Main {

	public static void main(String[] args) {
		
		
		String name="";
		int age;
		String stNum="";
		String sbName="";
		int score=0;
		int[] scores= {70,95,60,100,95};
		char grade=' ';
		
		int total=0;
		
		for(int s:scores) {
			//System.out.printf("%-4d",s);
			
			total+=s;
		}
		
		
		int avgScore=total/scores.length;
		
		if(avgScore>=90) {
			grade='A';
		}else if(avgScore>=80) {
			grade='B';
		}else if(avgScore>=70) {
			grade='C';
		}else {
			grade='F';
		}
		
		System.out.println(avgScore+"점의 학점은 "+grade+"입니다.");


		
		Student chulsu = new Student();
		System.out.println(chulsu.name);
		System.out.println(chulsu.age);
		
		Student yuri = new Student("김유리",20);
		System.out.println(yuri.name);
		System.out.println(yuri.age);
		
		Student2 jjangu = new Student2();
		jjangu.setName("신짱구");
		jjangu.setAge(20);
		System.out.println(jjangu.getName());
		System.out.println(jjangu.getAge());
		
		Subject sub=new Subject();
		sub.setSubName("데이터베이스 이론");
		sub.setProf("홍길동");
		sub.setClassNo(404);
		sub.setStDate("2023.07.03");
		System.out.println(sub.getSubName());
		System.out.println(sub.getProf());
		System.out.println(sub.getClassNo());
		System.out.println(sub.getStDate());
		
		
		
	}
	
	
	

}
