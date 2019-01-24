package review;

import javax.swing.JOptionPane;

public class StringTest02 {

	public static void main(String[] args) {

		String name = "lee sun shin";
		System.out.println("문자열의 길이 : " + name.length());
		
		int idx = name.indexOf("n"); //해당 문자가 여러개 -> 맨 앞의 문자 위치 리턴 
		System.out.println("첫번째 문자 n 위치 : " + idx);
		
		idx = name.lastIndexOf("n");
		System.out.println("마지막 문자 n 위치 : " + idx);
		
		idx = name.indexOf("m");
		System.out.println("문자 m 위치 : " + (idx==-1 ? "없다" : idx));//없을 땐 -1
		
		name.contains("choi");//포함 유무 판단 - boolean값 리턴
		
		name = name.toUpperCase();
		System.out.println(name);//대문자로
		
		name = name.toLowerCase();
		System.out.println(name);//소문자로
		
		char ch = name.toUpperCase().charAt(5);//다섯번째 문자
		System.out.println(ch);
		
		String search =
				JOptionPane.showInputDialog(name + " 에서 \n찾으려는 단어 입력");
		
		if(name.contains(search)) {
			JOptionPane.showMessageDialog(null, name +" 에 " + search + "가 있습니다.");
		}else {
			JOptionPane.showMessageDialog(null, "해당문자열이 없습니다.");
		}
		
	}

}
