package review;

import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.JOptionPane;

public class IoTest04 {

	public static void main(String[] args) {
		
		FileOutputStream fos = null;
		
		try {
			
		fos = new FileOutputStream("test05.txt",true);
		 String msg = JOptionPane.showInputDialog("�ϰ���� ���� �ۼ��ϼ���.")+"\n";
		 byte[] b = msg.getBytes();
		 
		 fos.write(b);
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {fos.close();}catch (IOException e) {}
		}
	}
}
