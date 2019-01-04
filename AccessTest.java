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
        System.out.println(s03);  //singleEx.Single@70dea4e 주소가 다 같다
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
	
	//private 변수 <- get/set method
	//art + shift + s,r
	
}




//싱글톤 패턴 : 클래스에 객체가 오로지 하나만 생성

class Single {
	 
    //1단계 : 생성자 앞에 private를 붙이자.
    //        이를 통해 new Single()이라는 명령어로는
    //        객체를 생성할 수 없게 된다.
    private Single() {}
    
    private static Single s = null;
    //2단계 : getInstance()라는 이름의 메서드를 만들어
    //        Single 클래스의 객체가 오로지 한 개만 생성될 수 있도록
    //        if문을 통해 제약조건을 설정하자.
    public static Single getInstance() { //<-이제 new 가 아니라 겟인스턴스 메서드로 객체 생성
        if(s==null) {
            s = new Single();
        }
        return s;
    }
}
