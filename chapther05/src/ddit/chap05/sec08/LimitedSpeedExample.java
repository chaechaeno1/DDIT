package ddit.chap05.sec08;

import java.util.Scanner;

public class LimitedSpeedExample {

	public static void main(String[] args) {
		String str ="";
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. 스쿨존 ");
		System.out.println("2. 시내 주행");
		System.out.println("3. 시외 주행");
		System.out.println("===========================");
		
		System.out.print("번호 입력 >> ");
		int num=sc.nextInt();
		
		switch(num) {
		case 1:
			str="SchoolZone";
			break;
		case 2:
			str="DownTown";
			break;
		case 3:
			str="CountrySide";
			break;
		default:
			System.out.println("※작업번호 오류※");
			System.exit(0);
		}
		
		//열거형에서 주로 사용되는 메서드 : valueOf(), ordinal(); values(); 
		//valueOf(String arg) : arg를 enum객체에서 가져옴. 없으면 오류발생.
		//values() : enum요소들을 순서대로 enum타입의 배열로 반환
		//열거타입변수명.ordinal() : 해당변수의 값이 enum에 저장된 순번(배열 index)을 반환 
		LimitedSpeed lSpeed = LimitedSpeed.valueOf(str);
		
		switch(lSpeed) {
		case SchoolZone:
			System.out.println(lSpeed.SchoolZone+"에서는 "+lSpeed.getValues()+"km/h 미만의 속도를 유지하시오."); //SchoolZone에 해당하는 인덱스 출력
			break;
		case DownTown:
			System.out.println(lSpeed.DownTown+"에서는 "+lSpeed.getValues()+"km/h 미만의 속도를 유지하시오.");
			break;
		case CountrySide:
			System.out.println(lSpeed.CountrySide+"에서는 "+lSpeed.getValues()+"km/h 미만의 속도를 유지하시오.");
			break;
		
		}
		
		for(LimitedSpeed var: lSpeed.values()) { //배열로 반환
			System.out.println(var+" -> "+var.ordinal());
		}
		
	}

}
