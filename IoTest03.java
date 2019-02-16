package review;

import java.io.FileInputStream;
import java.io.IOException;

public class IoTest03 {

	public static void main(String[] args) {
		
		byte[] b = new byte[10];
		b[0] = (byte)164;
		b[1] = (byte)161;
		
		String str = new String(b);
		System.out.println(str);//
		
		FileInputStream file = null;
		try {
			file = new FileInputStream("C:\\test01.txt");
			
			byte[] c = new byte[file.available()];
			
			System.out.println("1. " + file.available());
			System.out.println("2. " + file.read(c));
			
			String msg = new String(c);
			System.out.println(msg);
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {file.close();} catch (IOException e) {}
		}
	}

}
