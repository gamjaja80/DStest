package review;

import java.io.FileInputStream;
import java.io.IOException;

public class IoTset02 {

	public static void main(String[] args) {
		
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("test02.txt");
			
			while(true) {
				int code = fis.read();
				if(code == -1)break;
				System.out.println((char)code);
				
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {fis.close();}catch(IOException e){}
		}
	}

}
