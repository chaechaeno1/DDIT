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
		
		System.out.println("1���� "+d+"�� "+h+"�ð� "+m+"�� "+s+"��"); // 1���� 365�� 5�ð� 48�� 46��
		
		
		//����
		double year=365.2422;
		int days=(int)year;
		
		//�ð�
		double hours=(year-days)*24;
		int hour=(int)hours;
		
		//��
		double minutes=(hours-hour)*60;
		int minute=(int)minutes;
		
		//��
		double seconds=(minutes-minute)*60;
		int second=(int)seconds;
		
		System.out.println("1���� "+days+"�� "+hour+"�ð� "+minute+"�� "+second+"��");
				

	}

}
