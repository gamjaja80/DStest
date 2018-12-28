package game_project;

import java.util.Scanner;

public class updown_game {

	public static void main(String[] args) {
		int num = -1;
		int count = 0;
		boolean endCheck = false;
		Scanner sc = null;
		Updown ud = new Updown();
		
		System.out.println("******  UP & DOWN GAME  ******");
		
		do {
			sc = new Scanner(System.in);
			System.out.print("Input number(1~99) >> ");
			num = Integer.parseInt(sc.nextLine());
			
			int st = ud.updownCheck(num);
			
			count++;
			
			switch(st) {
			case 0:
				System.out.println("You Win! count : " + count);
				endCheck = true;
				break;
				
			case 1:
				System.out.println("UP!");
				break;
				
			case 2:
				System.out.println("DOWN!");
				break;
			}
		}while(!endCheck);
		
		sc.close();
	}

}

class Updown{
	private static int x;
	
	public Updown() {
		x = (int)(Math.random()*99+1);
	}
	public int updownCheck(int num) {
		int st = -1;
		if(x == num) {
			st = 0; //x = num
		}else if(x > num) {
			st = 1; //up
		}else {
			st = 2; //down
		}
		
		return st;
	}
}