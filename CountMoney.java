package game_project;

import javax.swing.JOptionPane;

public class CountMoney {

	public static void main(String[] args) {

		int money = Integer.parseInt(JOptionPane.showInputDialog("금액을 입력하세요"));
		
		int fiftyTh = money/50000;
		int tenTh = money/10000 % 5;
		int fiveTh = money/5000 % 2;
		int oneTh = money/1000 % 5;
		int fiveHu = money/500 % 2;
		int oneHu = money/100 % 5;
		int fifty = money/50 % 2;
		int ten = money/10 % 5;
		
		String message = "금액 : " + money + "원\n" 
				+ "오만원 : " + fiftyTh + "장\n"
                + "일만원 : " + tenTh + "장\n"
                + "오천원 : " + fiveTh + "장\n"
                + "일천원 : " + oneTh + "장\n"
                + "오백원 : " + fiveHu + "장\n"
                + "일백원 : " + oneHu + "장\n"
                + "오십원 : " + fifty + "장\n"
                + "십   원 : " + ten + "장\n";

		JOptionPane.showMessageDialog(null, message);
		
	}

}
