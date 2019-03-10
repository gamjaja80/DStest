package game_project;

public class Fibonacci {

	public static void main(String[] args) {
		
		long start = System.currentTimeMillis(); //시작하는 시점 계산
		 
		Fibonacci f = new Fibonacci();
		System.out.println("input : 40 >> " + f.fib(40));
		 
		long end = System.currentTimeMillis(); //프로그램이 끝나는 시점 계산
		System.out.println( "실행 시간 : " + ( end - start )/1000.0 +"초"); //실행 시간 계산 및 출력

		
	}
	
	
	int fib(int n) {
		int r = 0;
		
		if(n == 1 || n == 0) {r = 1;}
		else {
			r = fib(n-1) + fib(n-2); 
		}
		return r;
	}
}
