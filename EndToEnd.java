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
		System.out.println("게임에 참여하는 인원은 몇명입니까 >>> ");
		peopleNum = sc.nextInt();
		user = new String[peopleNum];
		for(int i = 0; i < peopleNum; i++) {
			System.out.println("참가자의 이릅을 입력하세요 >>> ");
			user[i] = sc.next().trim();
		}
		
		System.out.println("시작하는 단어 >>> ");
		String startWord = sc.next().trim();
		System.out.println("시작하는 단어는 " + startWord + "입니다.");
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
				System.out.println("졌습니다.");
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
