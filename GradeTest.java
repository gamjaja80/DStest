package game_project;

import java.util.Scanner;

public class GradeTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("math score >> ");
		int math = Integer.parseInt(sc.nextLine());
		System.out.print("science score >> ");
		int science = Integer.parseInt(sc.nextLine());
		System.out.print("korean score >> ");
		int korean = Integer.parseInt(sc.nextLine());
		
		
		Grade g = new Grade(math, science, korean);
		System.out.println("average : " + g.average());
	}

	
}


class Grade{
	int math;
	int science;
	int korean;
	
	public Grade(int math, int science, int korean) {
		this.math = math;
		this.science = science;
		this.korean = korean;
		
	}
	
	String average() {
		double avg = (math + science + korean)/3.0;
		String avgScore = String.format("%.1f", avg);
		
		return avgScore;
	}

	
}