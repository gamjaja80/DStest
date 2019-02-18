package review;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IoTest05 {

	public static void main(String[] args) {
		String path = "test05.txt";
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
		fis = new FileInputStream(path);
		byte[] b = new byte[fis.available()];
		fis.read(b);
		
		int idx = path.indexOf(".");
		String fileName = path.substring(0,idx);
		String extName = path.substring(idx + 1);
		String fullName = fileName + "-บนป็บป." + extName;
		
		fos = new FileOutputStream(fullName);
		fos.write(b);
		
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			try {fis.close();}catch(IOException E){}
			try {fos.close();}catch(IOException E){}
		}
	}	
}

