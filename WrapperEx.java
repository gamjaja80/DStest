package review;

public class WrapperEx {

	public static void main(String[] args) {
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		
		Integer n1 = new Integer(100);
		Integer n2 = new Integer(200);
		System.out.println(n1 + n2);
		
		int num = n1; //jdk1.5 �������� ���
	    int num0 = n1.intValue(); //jdk1.4 ���Ͽ��� �̷���!

	  //JDK1.5���� �ڽ̰� ��ڽ��� �ڵ����� �̷������.
        int num1 = 10;
        Integer i3 = num1;                  //auto boxing �ڵ����� ���������� ������ �ְڴ�.
        int num2 = new Integer(100);        //auto unboxing 
		
	}

}
