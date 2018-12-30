package game_project;

import java.util.Scanner;


public class test {

	public static void main(String[] args) {
		MaxMin mm = new MaxMin();
		mm.run();

	}

}


class MaxMin {
	int num1;
	int num2;
	
	void input() {
		System.out.println("*** max & min ***");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("input num1 >> ");
		num1 = sc.nextInt();
		System.out.print("input num2 >> ");
		num2 = sc.nextInt();
		
		sc.close();
		
	}
	
	int max() {
		return num1>=num2 ? num1 : num2;
	}
	
	int min() {
		return num1<=num2 ? num1 : num2;
	}
	
	void run() {
		input();
		System.out.println("Max >> " + max());
		System.out.println("Min >> " + min());
	}
}


