package review;

import java.io.File;

public class IoTest02 {

	public static void main(String[] args) {
		
		File file = new File("\\");
		
		String[] lists = file.list();
		
		for(int i = 0; i < lists.length; i++) {
			File sFile = new File(file, lists[i]);
			//���ڿ��� ���� ��ü�� ������ִ� ������
			if(sFile.isDirectory()) {
				System.out.println("<DIR>\t" + sFile.getName());
			}else if(sFile.isFile()){
				System.out.println(sFile.length() + "\t" + sFile.getName());
			}
		}
		
	}

}
