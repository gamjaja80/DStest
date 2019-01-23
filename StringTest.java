package review;


public class StringTest {

	public static void main(String[] args) {
		
		int num = 0;
		double d = 0;
		
		String str1 = null;
		System.out.println(str1 + " <= null로 초기화"); //>>null 도 문자로 입력되버림
		
		String str2 = ""; //String은 ""로 초기화해주는게 좋다.
		System.out.println(str2 + " <= 빈 문자열로 초기화");
		
	}

}
