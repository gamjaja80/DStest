package game_project;

public class Fibonacci {

	public static void main(String[] args) {
		
		long start = System.currentTimeMillis(); //�����ϴ� ���� ���
		 
		Fibonacci f = new Fibonacci();
		System.out.println("input : 40 >> " + f.fib(40));
		 
		long end = System.currentTimeMillis(); //���α׷��� ������ ���� ���
		System.out.println( "���� �ð� : " + ( end - start )/1000.0 +"��"); //���� �ð� ��� �� ���

		
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
