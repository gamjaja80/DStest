package review;

class Apple{}

public class ObjectTest02 {

	public static void main(String[] args) {

		Apple a1 = new Apple();
		Apple a2 = new Apple();
		
		System.out.println(a1);
		System.out.println(a1.toString());
		System.out.println(a2);
		
		System.out.println(a1 == a2);
		System.out.println(a1.equals(a2));
		
		String str1 = new String("Java");
		String str2 = new String("Java");
		
		System.out.println(str1 == str2); //==�� �ּҰ� �� -> false
		System.out.println(str1.equals(str2));
		//String�� equals�� �� �񱳷� �������̵��Ǿ���
	}

}
