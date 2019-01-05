package game_project;

//override
public class InheritTest {

	public static void main(String[] args) {
		Students st = new Students();
		st.love();
		
		Employee em = new Employee();
		em.love();
		
		System.out.println();
		
		Sub s = new Sub();    //�ڼ� Ŭ���� ��ü ������ �θ� ������ ȣ��
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
		System.out.println("�θ� ������ ȣ��");
	}
	
	public Super(int y) {
		//���ڰ� �ִ� ������ ����� �⺻ �����ڴ� �ڵ����� ��������� �ʴ´�.
		this.y = y;
	}
	
}


class Sub extends Super{
	int x = 10;
	
	public Sub() {
		super();                //�� ���൵ �ڵ� ȣ��
	}
	
	public Sub(int x) {
		this.x = x;
		System.out.println("�ڽ� ������ ȣ��");
	}
	
	void getNum() {
		System.out.println("sub = " + this.x);
		System.out.println("super = " + super.x);
	}
	
}


