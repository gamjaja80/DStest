package game_project;

import javax.swing.JOptionPane;

/*
 * Dictionary 클래스를 만들어
 * 한글을 입력하면 해당 영어단어를 리턴해주는
 * 프로그램을 작성해보자.
 * 
 * *** 한영사전 ***
 * 1. 입력
 * 2. 보기
 * 3. 수정
 * 4. 삭제
 * 5. 검색
 * 6. 종료
 */
class Dictionary{
    //각 배열 만들어주기
    String[] eng = new String[10];
    String[] kor = new String[10];
    
    //실행
    void run() {
        while(true) {
        	int num = choiceMenu();
            //6. 종료
            if(num == 6) {
                JOptionPane.showMessageDialog(null, "프로그램을 종료합니다.");
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
    
    
    //메뉴 선택
    int choiceMenu() {
        String menu = "*** 한영사전 ***\r\n" + 
                "1. 입력\n" + 
                "2. 보기\n" + 
                "3. 수정\n" + 
                "4. 삭제\n" + 
                "5. 검색\n" + 
                "6. 종료\n" +
                "번호를 선택해주세요.";
        int choice = 0;
        while(true) {
            choice = Integer.parseInt(JOptionPane.showInputDialog(menu));
            if(1<=choice && choice <=6) {
                return choice;
            }else {
                JOptionPane.showMessageDialog(null, "없는 메뉴입니다.");
            }
        }
    }
    
    
    //1.입력
    void input() {
        String word = JOptionPane.showInputDialog("영어단어 입력 : \n취소는 '0'입력").trim();
        
        if(word.equals("0")) {
        	JOptionPane.showMessageDialog(null, "입력을 취소합니다.");
        }else {    
	        for(int i = 0; i<eng.length; i++) {
	            if(eng[i] == null && overlap(word)) {
	                //중복제거
	                eng[i] = word;
	                kor[i] = JOptionPane.showInputDialog(eng[i]+"의 뜻 입력 : ").trim();
	                JOptionPane.showMessageDialog(null, (i+1) + ". " + eng[i] + " : "+ kor[i]);
	                break;
	            }
	            if(overlap(word) == false) {
	                break;
	            }
	        }
        }
    }
    
    //2.보기
    void showInfo() {
        String msg = "********** Word List **********";
        
        if(eng[0]==null) {
        	msg += "\n리스트가 없습니다.";
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
    
    //3.수정
    void edit() {
        //바꿀 인덱스 번호 입력 후 영어 : 한글 입력
        int num = Integer.parseInt(JOptionPane.showInputDialog("수정할 단어의 인덱스 번호를 입력해주세요.(종료는 '-1'입력)"));
        if(0 <= num && num <= 9 && eng[num] != null) {
            String word = JOptionPane.showInputDialog("영어단어 입력 : ");
            //중복 제거하기
            if(overlap(word)) {
                eng[num] = word;
                kor[num] = JOptionPane.showInputDialog(eng[num] + "의 뜻 입력 : ");
            }
        }else if(num == -1){
        	JOptionPane.showMessageDialog(null, "수정을 종료합니다");
        }else {
            JOptionPane.showMessageDialog(null, "해당 인덱스가 없습니다.(0 ~ 9)");
        }
        
    }
    //4.삭제
    void delete() {
        //해당 영어 또는 한글 단어를 입력하면 두 배열에서 모두 삭제/배열 순서 당기기
        String delWord = JOptionPane.showInputDialog("삭제할 단어를 입력하세요.(종료는 '0'입력)");
        boolean delCheck = false;
        
        if(delWord.equals("0")) {
        	JOptionPane.showMessageDialog(null, "삭제를 종료합니다");
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
        			JOptionPane.showMessageDialog(null, "삭제되었습니다.");
        			break;
        		}
        	}
        	if(delCheck == false) {
        		JOptionPane.showMessageDialog(null, "해당 단어가 존재하지 않습니다.");
        	}
        	
        }
        
    }
    
    //5.검색
    void search() {
        String srcWord = JOptionPane.showInputDialog("검색할 단어를 입력하세요.(종료는 '0'입력");
        boolean srcCheck = false;
        
        if(srcWord.equals("0")) {
        	JOptionPane.showMessageDialog(null, "검색을 종료합니다");
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
        		JOptionPane.showMessageDialog(null, "해당 단어가 존재하지 않습니다.");
        	}
        }
    }
    
    //중복체크하기
    boolean overlap(String word) {
        boolean overCheck = true;
        for(int i = 0; i < eng.length; i++) {
            if(eng[i] != null && eng[i].equals(word)) {
                JOptionPane.showMessageDialog(null, "중복되는 단어입니다.");
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
