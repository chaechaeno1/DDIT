package ddit.chap02.sec03;

public class Project0705 {

	public static void main(String[] args) {
		double y = 365.2422;
		int d = (int)y; // 365
		int h = (int)((y-d)*24); // 5
		int m = (int)((((y-d)*24)-h)*60); // 48
		int s = (int)((((((y-d)*24)-h)*60)-m)*60); // 46
				
		System.out.println(y);
		System.out.println(d);
		System.out.println(h);
		System.out.println(m);
		System.out.println(s);
		
		System.out.println("1년은 "+d+"일 "+h+"시간 "+m+"분 "+s+"초"); // 1년은 365일 5시간 48분 46초
		
		
		//날수
		double year=365.2422;
		int days=(int)year;
		
		//시간
		double hours=(year-days)*24;
		int hour=(int)hours;
		
		//분
		double minutes=(hours-hour)*60;
		int minute=(int)minutes;
		
		//초
		double seconds=(minutes-minute)*60;
		int second=(int)seconds;
		
		System.out.println("1년은 "+days+"일 "+hour+"시간 "+minute+"분 "+second+"초");
				

	}

}
