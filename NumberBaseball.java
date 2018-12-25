package game_project;

public class NumberBaseball {

	public static void main(String[] args) {
		RandomNum r = new RandomNum();
		r.match(2, 3, 4);
		r.match(4, 5, 6);
		r.match(7, 8, 9);
		
		r.correctAnswer();
	}

}

class RandomNum{
	private static int[] num = new int[3];
	private static int n1;
	private static int n2;
	private static int n3;
	
	public RandomNum() {
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
		
		System.out.println("input : "+ tmp[0] + tmp[1] + tmp[2] +  " >> S : " + s + ", B : " + b );
		
		s = 0;
		b = 0;
	}
	
	public void correctAnswer() {
		System.out.println(num[0] + " " + num[1] + " " + num[2]);
	}
}