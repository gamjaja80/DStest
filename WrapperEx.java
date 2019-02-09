package review;

public class WrapperEx {

	public static void main(String[] args) {
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		
		Integer n1 = new Integer(100);
		Integer n2 = new Integer(200);
		System.out.println(n1 + n2);
		
		int num = n1; //jdk1.5 에서부터 허용
	    int num0 = n1.intValue(); //jdk1.4 이하에선 이렇게!

	  //JDK1.5부터 박싱과 언박싱은 자동으로 이루어진다.
        int num1 = 10;
        Integer i3 = num1;                  //auto boxing 자동으로 참조형으로 포장해 주겠다.
        int num2 = new Integer(100);        //auto unboxing 
		
	}

}
