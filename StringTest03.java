package review;

public class StringTest03 {

	public static void main(String[] args) {
		
		String name = "lee sun shin";
		
		int idx = name.indexOf(" ");
		
		String sung = name.substring(0,idx);
		//0 ~ idx �̸����� ����
		String irum = name.substring(idx + 1);
		//���� �ε������� ������ ����
		
		System.out.println("�� :" + sung);
		System.out.println("�̸� :" + irum);
		
		System.out.println(idx);
	}

}
