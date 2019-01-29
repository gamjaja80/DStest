package review;

public class StringBfTest01 {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("This");
		
		//sb = sb + "연결" // + 연산자 불가
		sb.append(" is apple.");
		sb.insert(7, " my");
		System.out.println(sb);
		
		sb.replace(8, 10, "your");
		System.out.println(sb);

	}

}
