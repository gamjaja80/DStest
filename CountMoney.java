package game_project;

import javax.swing.JOptionPane;

public class CountMoney {

	public static void main(String[] args) {

		int money = Integer.parseInt(JOptionPane.showInputDialog("�ݾ��� �Է��ϼ���"));
		
		int fiftyTh = money/50000;
		int tenTh = money/10000 % 5;
		int fiveTh = money/5000 % 2;
		int oneTh = money/1000 % 5;
		int fiveHu = money/500 % 2;
		int oneHu = money/100 % 5;
		int fifty = money/50 % 2;
		int ten = money/10 % 5;
		
		String message = "�ݾ� : " + money + "��\n" 
				+ "������ : " + fiftyTh + "��\n"
                + "�ϸ��� : " + tenTh + "��\n"
                + "��õ�� : " + fiveTh + "��\n"
                + "��õ�� : " + oneTh + "��\n"
                + "����� : " + fiveHu + "��\n"
                + "�Ϲ�� : " + oneHu + "��\n"
                + "���ʿ� : " + fifty + "��\n"
                + "��   �� : " + ten + "��\n";

		JOptionPane.showMessageDialog(null, message);
		
	}

}
