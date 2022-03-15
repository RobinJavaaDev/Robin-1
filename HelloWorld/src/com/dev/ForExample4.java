package com.dev;

public class ForExample4 {
	public static void main(String[] args) {
		// 1 ~ 10 까지 수중에서 짝수의 값 => evenSum, 홀수의 값=>oddSum

		int evenSum, oddSum;
		evenSum = oddSum = 0;
		for (int i = 1; i <= 10; i++) {

			if (i % 2 == 1) {
				oddSum += i;
			} else {

				evenSum += i;

			}
		}

		System.out.println("홀수의 합은 " + oddSum + ", 짝수의 합은 " + evenSum);
	}
}