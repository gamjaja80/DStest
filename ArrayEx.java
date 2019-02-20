package review;

import java.util.ArrayList;
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
		}
		
	}

}
