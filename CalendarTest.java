package review;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest {

	public static void main(String[] args) {
		Date date = new Date();
		date.getDate();//deprecated
		
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.get(1)); //��
		System.out.println(cal.get(2) + 1);//��  +1 �����..
		System.out.println(cal.get(5));//��
		
		//�׷��� �̰� ������ �ܿ�� ���� �� ������ ����� ������ ���´�.
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH));
		System.out.println(cal.get(Calendar.DATE));
		
		//��(1) ��(2) ȭ(3) ... ��(7)
		int yoil = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println(yoil);
		
		System.out.println(MyCalendar.toHangulYoil(yoil));
		System.out.println(MyCalendar.toHangulYoil(cal));
		
	}

}


class MyCalendar {
	//api�ּ��ֱ�
	/**
	 *���ڿ����� �Ѱ��ָ� �ѱ� ���Ϸ� �������ִ� �޼��� 
	 *@param numYoil
	 *@return hangulYoil
	 *@author gamja
	 */
	
	public static String toHangulYoil(int numYoil) {
		String hangulYoil = "";
		switch(numYoil) {
		case 1 : hangulYoil = "�Ͽ���"; break;
		case 2 : hangulYoil = "������"; break;
		case 3 : hangulYoil = "ȭ����"; break;
		case 4 : hangulYoil = "������"; break;
		case 5 : hangulYoil = "�����"; break;
		case 6 : hangulYoil = "�ݿ���"; break;
		case 7 : hangulYoil = "�����"; break;
		}
		
		return hangulYoil;
	}
	
	
	//�� �� ���� �����ε� ��Ű��
	public static String toHangulYoil(Calendar cal) {
		/**
		 * Ķ���� ��ü�� �Ѱ��ָ� �ѱ� ������ �������ִ� �޼���
		 * @param cal
		 * @return hangulYoil
		 * @author gamja
		 */
		
		int numYoil = cal.get(Calendar.DAY_OF_WEEK);
		
		String hangulYoil = "";
		switch(numYoil) {
		case 1 : hangulYoil = "�Ͽ���"; break;
		case 2 : hangulYoil = "������"; break;
		case 3 : hangulYoil = "ȭ����"; break;
		case 4 : hangulYoil = "������"; break;
		case 5 : hangulYoil = "�����"; break;
		case 6 : hangulYoil = "�ݿ���"; break;
		case 7 : hangulYoil = "�����"; break;
		}
		
		return hangulYoil;
	}
}
