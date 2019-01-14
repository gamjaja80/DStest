package game_project;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class fisTest {

	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("test.txt");
			
		}catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println(e.toString());
		}finally {
			try {fis.close();} catch(IOException e) {}
		}
	}

}
