package review;

public class StringTest03 {

	public static void main(String[] args) {
		
		String name = "lee sun shin";
		
		int idx = name.indexOf(" ");
		
		String sung = name.substring(0,idx);
		//0 ~ idx 미만까지 추출
		String irum = name.substring(idx + 1);
		//시작 인덱스부터 끝까지 추출
		
		System.out.println("성 :" + sung);
		System.out.println("이름 :" + irum);
		
		System.out.println(idx);
	}

}
