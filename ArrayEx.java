package review;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayEx {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i = 0; i<7; i++) {
			list.add(i *10);
		}
		System.out.println(list);

		if(list.contains(20)&&list.contains(40)) {
			int fidx = list.indexOf(20);
			int eidx = list.indexOf(40);
			
			List<Integer> sList = list.subList(fidx, eidx+1);
			System.out.println(sList);
			
			ArrayList<Integer> list2 = new ArrayList<>(sList);//����Ʈ ����
			
		}else {
			System.out.println("20�� 40�� �����ϴ�.");
		}
		
		Collections.shuffle(list);
		System.out.println("shuffle : "+list);
		
		Collections.reverse(list);
		System.out.println("reverse : " + list);
		
		Collections.sort(list);
		System.out.println("�������� ���� : " + list);
		Collections.reverse(list);
		System.out.println("�������� ���� : " + list);
		
		list.remove(new Integer(40)); //���ڸ� �׳ɾ��� ������Ʈ�� �浹
		System.out.println(list);
		
		for(int i = list.size()-1; i>=0 ; i--) {
			if(list.get(i) >= 30) {
				list.remove(i);
			}
		}System.out.println(list);
	}

}
