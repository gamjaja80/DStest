package review;

import java.util.HashSet;

public class CollectionEx {

	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet<>();
		set.add("ÆÄÀÌ½ã");
		set.add("ÀÚ¹Ù");
		set.add("ÆÄÀÌ½ã");
		
		System.out.println(set.size());//2 = Áßº¹Àº ¾ø¾Ú
		
		Object[] obj = set.toArray();
		for(int i=0; i<obj.length; i ++) {
			System.out.println(obj[i]);
		}
		
	}

}
