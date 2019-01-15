package game_project;

import javax.swing.JOptionPane;

public class ExceptionTest {

	public static void main(String[] args) {

		
		try {
			int num1 = Integer.parseInt(JOptionPane.showInputDialog("정수1를 입력해주세요"));
			int num2 = Integer.parseInt(JOptionPane.showInputDialog("정수2를 입력해주세요"));
			System.out.println("나눗셉 = " + (num1/num2));
		}catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다");
		}catch(NumberFormatException e) {
			System.out.println("숫자를 입력해주세요");//다중 catch
		}catch(Exception e) {
			System.out.println("모든 예외처리 가능");//보통은 exception 많으 씀
		}//다중 처리를 할 경우 부모를 제일 밑단에 둔다.
		
		System.out.println("프로그램 종료");
	}

}
