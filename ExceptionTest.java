package game_project;

import javax.swing.JOptionPane;

public class ExceptionTest {

	public static void main(String[] args) {

		
		try {
			int num1 = Integer.parseInt(JOptionPane.showInputDialog("����1�� �Է����ּ���"));
			int num2 = Integer.parseInt(JOptionPane.showInputDialog("����2�� �Է����ּ���"));
			System.out.println("������ = " + (num1/num2));
		}catch (ArithmeticException e) {
			System.out.println("0���� ���� �� �����ϴ�");
		}catch(NumberFormatException e) {
			System.out.println("���ڸ� �Է����ּ���");//���� catch
		}catch(Exception e) {
			System.out.println("��� ����ó�� ����");//������ exception ���� ��
		}//���� ó���� �� ��� �θ� ���� �شܿ� �д�.
		
		System.out.println("���α׷� ����");
	}

}
