package game_project;

//�������� �����ϱ�
public class RefTest {
	
	public static void refTest(Demo v1, Demo v2) {
		v2.x = 30;
		System.out.println(v2.x);
		
		v1 = v2; 
		//�������� v1�� ���� "�ּҰ�"�� v2�� "�ּҰ�"���� �ٲ���� ��, d1�� x ������ ������ ����.
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
