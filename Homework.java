package review;

import java.math.BigInteger;

public class Homework {

	public static void main(String[] args) {
		/*
		 * 1. 1���� 100������ ��
		 * 2. 1���� 100������ ��
		 */
		System.out.println("1���� 100������ ���� ���Ͻÿ�.");
		int sum = 0;
		for(int i = 1; i <= 100 ; i ++){sum += i;}
		System.out.println("�� : " + sum);
		
		System.out.println("1���� 100���� ���� ���Ͻÿ�.");
		BigInteger mult = new BigInteger("1");
		for(int i = 1; i <= 100; i ++) {
			mult = mult.multiply(BigInteger.valueOf(i));
		}
		System.out.println("�� : " + mult);
		
		
	}

}
