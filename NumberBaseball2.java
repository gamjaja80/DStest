package game_project;

import java.util.Scanner;

public class NumberBaseball2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		
		do {
			System.out.print("Write 3 numbers(0~9 / Separate with space) : ");
			int tmp1 = Integer.parseInt(sc.next());
			int tmp2 = Integer.parseInt(sc.next());
			int tmp3 = Integer.parseInt(sc.next());
			
			r.match(tmp1, tmp2, tmp3);
			
		}while(!r.isWin());
		
		System.out.println("- The End -");
	}

}

class Random{
	private static int[] num = new int[3];
	private static int n1 = 0;
	private static int n2 = 0;
	private static int n3 = 0;
	private static int count = 0;
	private static boolean win = false;
	
	
	public Random() {
		n1 = (int)(Math.random()*9);
		n2 = (int)(Math.random()*9);
		while(n1 == n2) {
			n2 = (int)(Math.random()*9);
		}
		
		n3 = (int)(Math.random()*9);
		while(n1 == n3 || n2 == n3) {
			n3 = (int)(Math.random()*9);
		}
		num[0] = n1;
		num[1] = n2;
		num[2] = n3;
	}
	
	public void match(int tmp1, int tmp2, int tmp3) {
		int[] tmp = new int[3];
		int s = 0;
		int b = 0;
		
		if(tmp1 == tmp2 || tmp1 == tmp3 || tmp2 == tmp3) {
			System.out.println(">> Write three 'different' numbers.");
			return;
		}
		
		tmp[0] = tmp1;
		tmp[1] = tmp2;
		tmp[2] = tmp3;
		
		for(int i = 0; i<tmp.length; i++) {
			
			if(tmp[i] == num[0] || tmp[i] == num[1] || tmp[i] == num[2]) {
				
				if(tmp[i] == num[i]) {
					s++;
				}else {
					b++;
				}
			}	
		}
		
		count++;
		System.out.println("count : " + count + " >> input : "+ tmp[0] + tmp[1] + tmp[2] +  " >> S : " + s + ", B : " + b );
		
		
		if(s == 3) {
			System.out.println("home run!");
			System.out.println("You succeeded in just '" + count + "' times.");
			win = true;
			count = 0;
			correctAnswer();
		}
		
		s = 0;
		b = 0;
	}

	public boolean isWin() {
		return win;
	}
	
	public void correctAnswer() {
		System.out.println(num[0] + " " + num[1] + " " + num[2]);
	}
}