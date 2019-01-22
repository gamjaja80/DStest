package review;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GuiTest02 {

	public static void main(String[] args) {
		//1.컨테이너
		Frame fr = new Frame("BorderLayout");
		fr.setBounds(1200, 100, 400, 400);
		
		//2.배치관리자
		//fr.setLayout(new BorderLayout());//이미 프레임에 내장
		fr.setLayout(null);
		
		//3.컴포넌트
		Button btn1 = new Button("동쪽");
		btn1.setSize(100,100);
		btn1.setLocation(100,100);
		
		//4.컴포넌트 애드
		fr.add(btn1, BorderLayout.EAST);
		
		//5.보여줘
		fr.setVisible(true);

		//6.종료
		fr.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}

}
