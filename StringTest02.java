package review;

import javax.swing.JOptionPane;

public class StringTest02 {

	public static void main(String[] args) {

		String name = "lee sun shin";
		System.out.println("���ڿ��� ���� : " + name.length());
		
		int idx = name.indexOf("n"); //�ش� ���ڰ� ������ -> �� ���� ���� ��ġ ���� 
		System.out.println("ù��° ���� n ��ġ : " + idx);
		
		idx = name.lastIndexOf("n");
		System.out.println("������ ���� n ��ġ : " + idx);
		
		idx = name.indexOf("m");
		System.out.println("���� m ��ġ : " + (idx==-1 ? "����" : idx));//���� �� -1
		
		name.contains("choi");//���� ���� �Ǵ� - boolean�� ����
		
		name = name.toUpperCase();
		System.out.println(name);//�빮�ڷ�
		
		name = name.toLowerCase();
		System.out.println(name);//�ҹ��ڷ�
		
		char ch = name.toUpperCase().charAt(5);//�ټ���° ����
		System.out.println(ch);
		
		String search =
				JOptionPane.showInputDialog(name + " ���� \nã������ �ܾ� �Է�");
		
		if(name.contains(search)) {
			JOptionPane.showMessageDialog(null, name +" �� " + search + "�� �ֽ��ϴ�.");
		}else {
			JOptionPane.showMessageDialog(null, "�ش繮�ڿ��� �����ϴ�.");
		}
		
	}

}
