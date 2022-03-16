package com.prod;

import java.util.Scanner;

public class ArrayExample8 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[] numbers = new int[2];

		System.out.println("첫 번째 값을 입력 ");
		numbers[0] = scn.nextInt();
		System.out.println("두 번째 값을 입력 ");
		numbers[1] = scn.nextInt();
		int temt;
		temt = numbers[0];
		numbers[0] = numbers[1];
		numbers[1] = temt;
		if (numbers[0] > numbers[1]) {
			System.out.println("더 큰 입력 값 " + numbers[0]);

			System.out.println("더 적은 입력 값 " + numbers[1]);

		} else {
			System.out.println("더 큰 입력 값 " + numbers[1]);

			System.out.println("더 적은 입력 값 " + numbers[0]);
		}

	}
}
