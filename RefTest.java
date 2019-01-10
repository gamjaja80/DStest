package game_project;

//참조변수 이해하기
public class RefTest {
	
	public static void refTest(Demo v1, Demo v2) {
		v2.x = 30;
		System.out.println(v2.x);
		
		v1 = v2; 
		//참조변수 v1이 가진 "주소값"이 v2의 "주소값"으로 바뀌었을 뿐, d1의 x 값에는 영향이 없다.
	}

	public static void main(String[] args) {
		
		Demo d1 = new Demo(10);
		Demo d2 = new Demo(10);
		
		refTest(d1, d2);
		
		System.out.println(d1.x + ", " + d2.x); //10, 30
		
	}

}

class Demo{
	int x = 0;
	
	public Demo(int x) {
		this.x = x;
	}
}
