package review;
//final ���� = ���
public class FinalTest {
	
	public static final int PLATINUM_MEMBER = 1;
	public static final int ROYAL_MEMBER = 2;
	public static final int GOLD_MEMBER = 3;
	public static final int SILVER_MEMBER = 4;
	
	
	public static void main(String[] args) {
		
		int grade = GOLD_MEMBER;
		int sale = 0;
		
		switch (grade) {
		case PLATINUM_MEMBER: sale = 30; break;
		case ROYAL_MEMBER: sale = 20; break;
		case GOLD_MEMBER: sale = 10; break;
		case SILVER_MEMBER: sale = 5; break;
		}
			
		System.out.println("������ " + sale + "% ������ �����մϴ�.");
	}

}
