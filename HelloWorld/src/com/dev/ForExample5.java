package com.dev;

public class ForExample5 {
	public static void main(String[] args) {

		int num = 48;

		for (int i = 1; i <= num; i++) {

			if (num % i == 0) {
				System.out.println(i);
			}

		}

	}
}