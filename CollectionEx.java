package review;

import java.util.HashSet;

public class CollectionEx {

	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet<>();
		set.add("���̽�");
		set.add("�ڹ�");
		set.add("���̽�");
		
		System.out.println(set.size());//2 = �ߺ��� ����
		
		Object[] obj = set.toArray();
		for(int i=0; i<obj.length; i ++) {
			System.out.println(obj[i]);
		}
		
	}

}
