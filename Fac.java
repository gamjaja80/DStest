package review;

public class Fac {

	public int fac(int n) {
		if(n <= 1) return n;
		return n * fac(n-1);
	}
	
	
	
	public static void main(String[] args) {
		Fac f = new Fac();
		System.out.println(7 + "! = " + f.fac(7));
		
	}

}
