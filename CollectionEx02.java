package review;

import java.util.HashMap;
import java.util.Set;

public class CollectionEx02 {

	public static void main(String[] args) {
		
		HashMap<Integer, String> map = new HashMap<>();
		
		map.put(1, "����");
		map.put(2, "����");
		map.put(3, "����");
		map.put(4, "��ȸ");
		
		System.out.println(map.get(3));
		
		Set<Integer> set = map.keySet();
		Object[] objSet = set.toArray();
		for(int i = 0; i<objSet.length; i++) {
			System.out.println((i+1) + " " + map.get(objSet[i]));
		}
		
	}

}
