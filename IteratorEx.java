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
		
		System.out.println("\n2. ���� for, for-each��");
		for(int tmp:list) {
			System.out.print(tmp + " ");
		}
		
		System.out.println("\n3. iterator �ݺ���");
		Iterator<Integer> iter = list.iterator();
		while(iter.hasNext()) {
			//��Ҹ� �ϳ��� �����ͼ� �� ������ ����
			System.out.print(iter.next() + " ");
		}
		
	}

}
