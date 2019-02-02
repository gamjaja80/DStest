package review;

import java.math.BigInteger;

public class Homework {

	public static void main(String[] args) {
		/*
		 * 1. 1부터 100까지의 합
		 * 2. 1부터 100까지의 곱
		 */
		System.out.println("1부터 100까지의 합을 구하시오.");
		int sum = 0;
		for(int i = 1; i <= 100 ; i ++){sum += i;}
		System.out.println("답 : " + sum);
		
		System.out.println("1부터 100까지 곱을 구하시오.");
		BigInteger mult = new BigInteger("1");
		for(int i = 1; i <= 100; i ++) {
			mult = mult.multiply(BigInteger.valueOf(i));
		}
		System.out.println("답 : " + mult);
		
		
	}

}
