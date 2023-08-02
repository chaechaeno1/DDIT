package ddit.chap13.list;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayExample02 {

	public static void main(String[] args) {
		ArrayList<Employees> list = new ArrayList<Employees>();
		
		list.add(new Employees("10101","홍길동",15000));
		list.add(new Employees("22102","홍길순",25000));
		list.add(new Employees("10191","정몽주",10500));
		list.add(new Employees("13101","이순신",20000));
		
		System.out.println(list);
		System.out.println();
		for(Employees emp: list) {
			System.out.println(emp.eid+" "+emp.name+", "+emp.salary);
		}
		System.out.println();
		
		Iterator<Employees> iter = list.iterator();
		while(iter.hasNext()) {
			Employees emp = iter.next();
			System.out.println(emp.eid+" "+emp.name+", "+emp.salary);
		}
		
		System.out.println();
		Iterator<Employees> iter1 = list.iterator();
		while(iter1.hasNext()) {
			Employees emp = iter1.next();
			if(emp.eid.equals("10191"))
			System.out.println(emp.eid+" "+emp.name+", "+emp.salary);
	}

	}
}


