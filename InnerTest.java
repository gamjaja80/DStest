package review;

import java.util.Date;

//InnerClass 를 쓰는 이유 : 데이터 공유

class Schedule{
	int year, month, day;
	Date date = new Date();
	
	class Diary{
		void record() {
			System.out.println(date + "에 다이어리 구매");
		}
	}
	
	class HouseHold{
		void write() {
			System.out.println(date + "에 마트에 감");
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
