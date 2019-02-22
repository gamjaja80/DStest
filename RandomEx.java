package review;

import java.util.ArrayList;

public class RandomEx {

	public static void main(String[] args) {
		System.out.println("<랜덤 함수>");
		System.out.println("(int)(Math.random() * 변수의 범위) + 뱐수의 시작수");
		
		int x = 50;
		int y = 3;
		
		int r1 = (int)(Math.random()*180);//0~179
		int r2 = (int)(Math.random()*180)+1;//1~180
		
		System.out.println(r1 + " : 0 ~ 179");
		System.out.println(r2 + " : 1 ~ 180");
	}
}
