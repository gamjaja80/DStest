package game_project;

//override
public class InheritTest {

	public static void main(String[] args) {
		Students st = new Students();
		st.love();
		
		Employee em = new Employee();
		em.love();
		
		System.out.println();
		
		Sub s = new Sub();    //자손 클래스 객체 생성시 부모 생성자 호출
        s.getNum();
        
        System.out.println();
        
        Sub s2 = new Sub(15);
        s2.getNum();

	}

}

class Person{
	String name;
	int age;
	
	void love() {
		System.out.println("love");
	}
}

class Students extends Person{
	@Override
	void love() {
		System.out.println("friendship");
	}
}

class Employee extends Person{
	@Override
	void love() {
		System.out.println("fellow love");
	}
}


class Super{
	int x = 20;
	int y = 0;
	
	public Super() {
		System.out.println("부모 생성자 호출");
	}
	
	public Super(int y) {
		//인자가 있는 생성자 만들면 기본 생성자는 자동으로 만들어지지 않는다.
		this.y = y;
	}
	
}


class Sub extends Super{
	int x = 10;
	
	public Sub() {
		super();                //안 써줘도 자동 호출
	}
	
	public Sub(int x) {
		this.x = x;
		System.out.println("자식 생성자 호출");
	}
	
	void getNum() {
		System.out.println("sub = " + this.x);
		System.out.println("super = " + super.x);
	}
	
}


