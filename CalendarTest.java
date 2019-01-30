package review;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest {

	public static void main(String[] args) {
		Date date = new Date();
		date.getDate();//deprecated
		
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.get(1)); //연
		System.out.println(cal.get(2) + 1);//월  +1 해줘야..
		System.out.println(cal.get(5));//일
		
		//그런데 이걸 일일이 외우고 있을 순 없으니 상수로 포장해 놓는다.
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH));
		System.out.println(cal.get(Calendar.DATE));
		
		//일(1) 월(2) 화(3) ... 토(7)
		int yoil = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println(yoil);
		
		System.out.println(MyCalendar.toHangulYoil(yoil));
		System.out.println(MyCalendar.toHangulYoil(cal));
		
	}

}


class MyCalendar {
	//api주석넣기
	/**
	 *숫자요일을 넘겨주면 한글 요일로 리턴해주는 메서드 
	 *@param numYoil
	 *@return hangulYoil
	 *@author gamja
	 */
	
	public static String toHangulYoil(int numYoil) {
		String hangulYoil = "";
		switch(numYoil) {
		case 1 : hangulYoil = "일요일"; break;
		case 2 : hangulYoil = "월요일"; break;
		case 3 : hangulYoil = "화요일"; break;
		case 4 : hangulYoil = "수요일"; break;
		case 5 : hangulYoil = "목요일"; break;
		case 6 : hangulYoil = "금요일"; break;
		case 7 : hangulYoil = "토요일"; break;
		}
		
		return hangulYoil;
	}
	
	
	//좀 더 쉽게 오버로딩 시키기
	public static String toHangulYoil(Calendar cal) {
		/**
		 * 캘린더 객체를 넘겨주면 한글 요일을 리턴해주는 메서드
		 * @param cal
		 * @return hangulYoil
		 * @author gamja
		 */
		
		int numYoil = cal.get(Calendar.DAY_OF_WEEK);
		
		String hangulYoil = "";
		switch(numYoil) {
		case 1 : hangulYoil = "일요일"; break;
		case 2 : hangulYoil = "월요일"; break;
		case 3 : hangulYoil = "화요일"; break;
		case 4 : hangulYoil = "수요일"; break;
		case 5 : hangulYoil = "목요일"; break;
		case 6 : hangulYoil = "금요일"; break;
		case 7 : hangulYoil = "토요일"; break;
		}
		
		return hangulYoil;
	}
}
