package review;

import java.util.Date;

//InnerClass �� ���� ���� : ������ ����

class Schedule{
	int year, month, day;
	Date date = new Date();
	
	class Diary{
		void record() {
			System.out.println(date + "�� ���̾ ����");
		}
	}
	
	class HouseHold{
		void write() {
			System.out.println(date + "�� ��Ʈ�� ��");
		}
	}
	
	
	void print() {
		new Diary().record();
		new HouseHold().write();
	}
}


public class InnerTest {

	public static void main(String[] args) {
		Schedule s = new Schedule();
		s.print();

	}

}
