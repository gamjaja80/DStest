package game_project;

import javax.swing.JOptionPane;

/*
 * Dictionary Ŭ������ �����
 * �ѱ��� �Է��ϸ� �ش� ����ܾ �������ִ�
 * ���α׷��� �ۼ��غ���.
 * 
 * *** �ѿ����� ***
 * 1. �Է�
 * 2. ����
 * 3. ����
 * 4. ����
 * 5. �˻�
 * 6. ����
 */
class Dictionary{
    //�� �迭 ������ֱ�
    String[] eng = new String[10];
    String[] kor = new String[10];
    
    //����
    void run() {
        while(true) {
        	int num = choiceMenu();
            //6. ����
            if(num == 6) {
                JOptionPane.showMessageDialog(null, "���α׷��� �����մϴ�.");
                System.exit(0);
            }
            switch(num){
	            case 1 :
	                input();
	                break;
	            case 2 :
	                showInfo();
	                break;
	            case 3 :
	                edit();
	                break;
	            case 4 : 
	                delete();
	                break;
	            case 5 :
	                search();
	                break;
            }
        }
    }
    
    
    //�޴� ����
    int choiceMenu() {
        String menu = "*** �ѿ����� ***\r\n" + 
                "1. �Է�\n" + 
                "2. ����\n" + 
                "3. ����\n" + 
                "4. ����\n" + 
                "5. �˻�\n" + 
                "6. ����\n" +
                "��ȣ�� �������ּ���.";
        int choice = 0;
        while(true) {
            choice = Integer.parseInt(JOptionPane.showInputDialog(menu));
            if(1<=choice && choice <=6) {
                return choice;
            }else {
                JOptionPane.showMessageDialog(null, "���� �޴��Դϴ�.");
            }
        }
    }
    
    
    //1.�Է�
    void input() {
        String word = JOptionPane.showInputDialog("����ܾ� �Է� : \n��Ҵ� '0'�Է�").trim();
        
        if(word.equals("0")) {
        	JOptionPane.showMessageDialog(null, "�Է��� ����մϴ�.");
        }else {    
	        for(int i = 0; i<eng.length; i++) {
	            if(eng[i] == null && overlap(word)) {
	                //�ߺ�����
	                eng[i] = word;
	                kor[i] = JOptionPane.showInputDialog(eng[i]+"�� �� �Է� : ").trim();
	                JOptionPane.showMessageDialog(null, (i+1) + ". " + eng[i] + " : "+ kor[i]);
	                break;
	            }
	            if(overlap(word) == false) {
	                break;
	            }
	        }
        }
    }
    
    //2.����
    void showInfo() {
        String msg = "********** Word List **********";
        
        if(eng[0]==null) {
        	msg += "\n����Ʈ�� �����ϴ�.";
        	JOptionPane.showMessageDialog(null, msg);
        }else {
        	
        	for(int i = 0; i<eng.length;i++) {
        		if(eng[i] == null) {
        			break;
        		}else {
        			msg +=  "\n" + (i+1) + ". " + eng[i] + " : "+ kor[i];
        		}
        	}
        	JOptionPane.showMessageDialog(null, msg);	
        }
    }
    
    //3.����
    void edit() {
        //�ٲ� �ε��� ��ȣ �Է� �� ���� : �ѱ� �Է�
        int num = Integer.parseInt(JOptionPane.showInputDialog("������ �ܾ��� �ε��� ��ȣ�� �Է����ּ���.(����� '-1'�Է�)"));
        if(0 <= num && num <= 9 && eng[num] != null) {
            String word = JOptionPane.showInputDialog("����ܾ� �Է� : ");
            //�ߺ� �����ϱ�
            if(overlap(word)) {
                eng[num] = word;
                kor[num] = JOptionPane.showInputDialog(eng[num] + "�� �� �Է� : ");
            }
        }else if(num == -1){
        	JOptionPane.showMessageDialog(null, "������ �����մϴ�");
        }else {
            JOptionPane.showMessageDialog(null, "�ش� �ε����� �����ϴ�.(0 ~ 9)");
        }
        
    }
    //4.����
    void delete() {
        //�ش� ���� �Ǵ� �ѱ� �ܾ �Է��ϸ� �� �迭���� ��� ����/�迭 ���� ����
        String delWord = JOptionPane.showInputDialog("������ �ܾ �Է��ϼ���.(����� '0'�Է�)");
        boolean delCheck = false;
        
        if(delWord.equals("0")) {
        	JOptionPane.showMessageDialog(null, "������ �����մϴ�");
        }else {
        	for(int i = 0; i < eng.length; i++) {
        		if(eng[i] == null) {
        			break;
        		}
        		if(eng[i].equals(delWord) || kor[i].equals(delWord)) {
        			delCheck = true;
        			for(int j = i;j<eng.length-1;j++) {
        				eng[j] = eng[j+1];
        				kor[j] = kor[j+1];
        			}
        			eng[eng.length-1] = null;
        			kor[kor.length-1] = null;
        			JOptionPane.showMessageDialog(null, "�����Ǿ����ϴ�.");
        			break;
        		}
        	}
        	if(delCheck == false) {
        		JOptionPane.showMessageDialog(null, "�ش� �ܾ �������� �ʽ��ϴ�.");
        	}
        	
        }
        
    }
    
    //5.�˻�
    void search() {
        String srcWord = JOptionPane.showInputDialog("�˻��� �ܾ �Է��ϼ���.(����� '0'�Է�");
        boolean srcCheck = false;
        
        if(srcWord.equals("0")) {
        	JOptionPane.showMessageDialog(null, "�˻��� �����մϴ�");
        }else {
        	for(int i = 0; i < eng.length; i++) {
        		if(eng[i] == null) {
        			break;
        		}
        		if(eng[i].equals(srcWord) || kor[i].equals(srcWord)) {
        			JOptionPane.showMessageDialog(null, (i+1) + ". " + eng[i] + " : " + kor[i]);
        			srcCheck = true;
        			break;
        		}
        	}
        	if(srcCheck == false) {
        		JOptionPane.showMessageDialog(null, "�ش� �ܾ �������� �ʽ��ϴ�.");
        	}
        }
    }
    
    //�ߺ�üũ�ϱ�
    boolean overlap(String word) {
        boolean overCheck = true;
        for(int i = 0; i < eng.length; i++) {
            if(eng[i] != null && eng[i].equals(word)) {
                JOptionPane.showMessageDialog(null, "�ߺ��Ǵ� �ܾ��Դϴ�.");
                overCheck = false;
                break;
            }
        }
        return overCheck;
    }
 
}
 



public class MethodTest {

	public static void main(String[] args) {
		Dictionary dic = new Dictionary();
		dic.run();
	}

}
