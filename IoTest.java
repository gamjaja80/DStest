package review;

import java.io.File;

public class IoTest {

	public static void main(String[] args) {
		
		File filePathRel = new File("test.txt");//�����
		
		System.out.println(filePathRel.getPath());
		System.out.println(filePathRel.getAbsolutePath());
		
		System.out.println(filePathRel.getName());
		System.out.println(filePathRel.length());//������ byte ũ��
		
		System.out.println(filePathRel.isFile());
		System.out.println(filePathRel.isDirectory());
		
	}

}
