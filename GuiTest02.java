package review;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GuiTest02 {

	public static void main(String[] args) {
		//1.�����̳�
		Frame fr = new Frame("BorderLayout");
		fr.setBounds(1200, 100, 400, 400);
		
		//2.��ġ������
		//fr.setLayout(new BorderLayout());//�̹� �����ӿ� ����
		fr.setLayout(null);
		
		//3.������Ʈ
		Button btn1 = new Button("����");
		btn1.setSize(100,100);
		btn1.setLocation(100,100);
		
		//4.������Ʈ �ֵ�
		fr.add(btn1, BorderLayout.EAST);
		
		//5.������
		fr.setVisible(true);

		//6.����
		fr.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}

}
