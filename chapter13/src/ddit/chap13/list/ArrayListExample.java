package ddit.chap13.list;
import java.util.ArrayList;

public class ArrayListExample {
	ArrayList list=new ArrayList();
	
	public static void main(String[] args) {
		ArrayListExample arrayList = new ArrayListExample();
		arrayList.addDate();
	}

	public void addDate() {
		list.add(100);
		list.add("홍길순");
		list.add(false);
		list.add(12.5);
		
		for(int i=0; i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println(list);
	}
	
}

