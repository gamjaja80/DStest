package review;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEx {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i = 0; i<7; i++) {
			list.add(i*10);
		}
		
		System.out.println("1. for");
		for(int i =0; i<list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		
		System.out.println("\n2. 단축 for, for-each문");
		for(int tmp:list) {
			System.out.print(tmp + " ");
		}
		
		System.out.println("\n3. iterator 반복자");
		Iterator<Integer> iter = list.iterator();
		while(iter.hasNext()) {
			//요소를 하나씩 꺼내와서 다 꺼내면 종료
			System.out.print(iter.next() + " ");
		}
		
	}

}
