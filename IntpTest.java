package game_project;


interface Testable{// 인터페이스명은 뒤에 ~able 붙이는게 관례

	 /*public static final*/ int MAX_NUM = 10; //상수 : /**/의 부분은 당연한 것이므로 생략해도 됨
	 /*public abstract*/ void add();//추상메서드

}

public class IntpTest {

	public static void main(String[] args) {

		int num = 10;
		num = 20;
		
		final int NUM2 = 1; //상수명은 대문자 표기가 관례
		//NUM2 = 2; 상수는 한번 값을 초기화하면 바꿀수없다.
		
		final int MAX_VOLUMN = 30; //_로 의미구분

		
		System.out.println(num + " , " + NUM2 + ", MAX : " + MAX_VOLUMN);
	}

}
