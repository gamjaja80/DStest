package game_project;

public class AccessTest {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.setName("Alia");
		s1.setNum("B1120");
		s1.setScore(84);
		
		System.out.println("name : " + s1.getName() + ", num : " + s1.getNum() + ", score : " + s1.getScore());

	    //Single s1 = new Single();
        Single s01 = Single.getInstance();
        Single s02 = Single.getInstance();
        Single s03 = Single.getInstance();
        System.out.println(s01);  //singleEx.Single@70dea4e
        System.out.println(s02);  //singleEx.Single@70dea4e
        System.out.println(s03);  //singleEx.Single@70dea4e �ּҰ� �� ����
    }

		

}


class Student{
	private String name;
	private String num;
	private int score;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	//private ���� <- get/set method
	//art + shift + s,r
	
}




//�̱��� ���� : Ŭ������ ��ü�� ������ �ϳ��� ����

class Single {
	 
    //1�ܰ� : ������ �տ� private�� ������.
    //        �̸� ���� new Single()�̶�� ��ɾ�δ�
    //        ��ü�� ������ �� ���� �ȴ�.
    private Single() {}
    
    private static Single s = null;
    //2�ܰ� : getInstance()��� �̸��� �޼��带 �����
    //        Single Ŭ������ ��ü�� ������ �� ���� ������ �� �ֵ���
    //        if���� ���� ���������� ��������.
    public static Single getInstance() { //<-���� new �� �ƴ϶� ���ν��Ͻ� �޼���� ��ü ����
        if(s==null) {
            s = new Single();
        }
        return s;
    }
}
