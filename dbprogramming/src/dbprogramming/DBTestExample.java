package dbprogramming;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DBTestExample {

	public static void main(String[] args) {
		DBTest dt = new DBTest();
		//실제로 실행되는 DBTest 클래스의 객체 생성
		StringBuilder sb = new StringBuilder();
		//문자열 연결
		Scanner sc= new Scanner(System.in); 
		//작업 번호 선택을 위한 scanner 사용
		String sql=null;
		//마지막에 쿼리문을 문자열로 담기위해 String 선언
		List<Object> param=null;//param 변수 선언
		
		//CRUD - 생성,삭제,삽입,갱신
		System.out.println("[[데이터베이스 관리]]");
		System.out.println("1.전체검색");
		System.out.println("2.단일검색");
		System.out.println("3.신규자료입력");
		System.out.println("4.자료수정");
		System.out.println("5.자료삭제");
		System.out.println("9.종료");
		System.out.println("=====================");
		System.out.print("작업번호 >> ");
		int choice=new Scanner(System.in).nextInt();
		//한번만 쓰기 때문에 객체 생성X, choice 변수로 선언
		
		switch(choice) {
		
		case 1:
			sb.append(" SELECT PROD_ID, PROD_NAME, PROD_PRICE, ");
			sb.append(" PROD_PROPERSTOCK ");
			sb.append(" FROM TPROD ");
			sb.append(" WHERE PROD_PRICE >= 1000000 ");
			sb.append(" ORDER BY PROD_PRICE DESC ");
			sql=sb.toString();
			dt.selectList(sql);
			break;
			
			
		case 2:
			sb.append(" SELECT PROD_ID, PROD_NAME, PROD_PRICE, ");
			sb.append(" PROD_PROPERSTOCK ");
			sb.append(" FROM TPROD ");
			sb.append(" WHERE PROD_ID = ? ");
			sb.append(" ORDER BY PROD_PRICE DESC ");
			sql=sb.toString();
			System.out.print("조회할 상품코드 : ");
			String pd=sc.next();
			dt.selectOne(sql, pd);
			System.out.println("======조회완료======");
			break;
			
			
		case 3: //신규입력(insert into~) 
			param=new ArrayList<Object>();
			
			System.out.print("상품코드 : ");
			String p=sc.nextLine();
			param.add(p);
			
			System.out.print("상품명 : ");
			String pname=sc.nextLine();
			param.add(pname);
			
			System.out.print("가격 : ");
			int pr=Integer.parseInt(sc.next());
			param.add(pr);
			
			System.out.print("적정재고 : ");
			int ps=Integer.parseInt(sc.next());
			param.add(ps);
			
			sql="INSERT INTO TPROD VALUES( ?, ?, ?, ? )";
			int flag = dt.update(sql,param);
			if(flag != 0) {
				System.out.println("자료입력 성공");
			}else {
				System.out.println("자료가 입력되지 않았습니다.");
			}
			break;
			
			
		case 4: //갱신 update 테이블명 set ~ 
			param=new ArrayList<Object>();
			sql="UPDATE TPROD SET ";
			String yesOrNot="";
			flag=0;
			
			System.out.print("변경할 상품번호 : ");
			String cpid=sc.nextLine();
			param.add(cpid);
			
			System.out.print("상품명 변경? (Y/N)");
			yesOrNot = sc.nextLine();
			while(yesOrNot.equalsIgnoreCase("y")) {
				System.out.print("상품명 : ");
				String p1=sc.nextLine();
				sql=sql+"PROD_NAME = '"+p1+"', ";
				break;
			}
			System.out.print("상품가격 변경? (Y/N)");
			yesOrNot = sc.nextLine();
			while(yesOrNot.equalsIgnoreCase("y")) {
				System.out.print("상품가격 : ");
				int p2=Integer.parseInt(sc.nextLine());
				sql=sql+"PROD_PRICE = "+p2+", ";	
				break;
			}
			System.out.print("적정재고 변경? (Y/N)");
			yesOrNot = sc.nextLine();
			while(yesOrNot.equalsIgnoreCase("y")) {
				System.out.print("적정재고 : ");
				int p3=Integer.parseInt(sc.nextLine());
				sql=sql+"PROD_PROPERSTOCK = "+p3+", ";
				break;
			}
			
			int len = sql.length();
			sql=sql.substring(0,len-2);
			sql=sql+" WHERE PROD_ID = ? ";
			
			flag=dt.update(sql, param);
			if(flag != 0) {
				System.out.println("자료갱신 성공");
			}else {
				System.out.println("자료갱신 실패");				
			}
			break;
			
			
		case 5: //삭제 delete from ~ [where  ]
			param=new ArrayList<Object>();
			sql="DELETE FROM TPROD ";
			
			System.out.print("삭제할 상품번호 : ");
			cpid=sc.nextLine();			
			sql=sql+" WHERE PROD_ID = ? ";
			
			param.add(cpid);
			flag=dt.update(sql, param);
			
			if(flag != 0) {
				System.out.println("자료삭제 성공");
			}else {
				System.out.println("자료삭제 실패");				
			}
			break;	
			
		case 9: 
			System.out.println("시스템을 종료합니다.");
			System.exit(0);
		}
			
	}
	
}
