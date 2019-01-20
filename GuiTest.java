package review;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GuiTest {

	public static void main(String[] args) {
		Frame f = new Frame();
		
		f.setSize(400, 400);
		f.setLocation(100,100);
		f.setTitle("GUI TEST");
		
		
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println("닫기 눌렀을 때 종료되도록");
				System.exit(0);
			}
		});
		
		
		f.setVisible(true);
	}

}
