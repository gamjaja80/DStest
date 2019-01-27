package review;

import java.util.Scanner;

public class EndToEnd {
	Scanner sc;
	String[] user;
	int peopleNum;
	public EndToEnd() {
		sc = new Scanner(System.in);
		user = null;
	}
	
	void run() {
		System.out.println("���ӿ� �����ϴ� �ο��� ����Դϱ� >>> ");
		peopleNum = sc.nextInt();
		user = new String[peopleNum];
		for(int i = 0; i < peopleNum; i++) {
			System.out.println("�������� �̸��� �Է��ϼ��� >>> ");
			user[i] = sc.next().trim();
		}
		
		System.out.println("�����ϴ� �ܾ� >>> ");
		String startWord = sc.next().trim();
		System.out.println("�����ϴ� �ܾ�� " + startWord + "�Դϴ�.");
		gameStart(startWord);
	}
	
	
	void gameStart(String startWord) {
		String preWord = startWord;
		int idx = 0;
		while(true) {
			System.out.println(user[idx] + " >>> ");
			String tmp = sc.next().trim();
			if(endCheck(preWord, tmp)) {
				preWord = tmp;
				idx ++;
				idx = idx%peopleNum;
			}else {
				System.out.println("�����ϴ�.");
				break;
			}
		}
	}
	
	boolean endCheck(String preWord, String tmp) {
		boolean result = false;
		
		char preCh = preWord.charAt(preWord.length()-1);
		char postCh = tmp.charAt(0);
		
		if(preCh == postCh) {result = true;}
		
		return result;
	}
	
	public static void main(String[] args) {
		EndToEnd end = new EndToEnd();
		end.run();
	}

}
