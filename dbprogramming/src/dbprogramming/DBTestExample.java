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
			List<Object> param=new ArrayList<Object>();
			
			System.out.println("상품코드 : ");
			String p=sc.next();
			param.add(p);
			
			System.out.println("상품명 : ");
			String pname=sc.next();
			param.add(pname);
			
			System.out.println("가격 : ");
			int pr=sc.nextInt();
			param.add(pr);
			
			System.out.println("적정재고 : ");
			int ps=sc.nextInt();
			param.add(ps);
			
			sql="INSERT INTO TPROD VALUES( ?, ?, ?, ? )";
			int flag = dt.update(sql,param);
			if(flag != 0) {
				System.out.println("자료입력 성공");
			}else {
				System.out.println("자료가 입력되지 않았습니다.");
			}
			break;
						
		}
			
	}
}
