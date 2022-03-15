package com.dev;

import java.util.Scanner;

public class WhileExample3 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		// 입력을 계속 가능.....
		// -1 값을 입력하면 멈춤.
		// sum 값에 입력
		int sum = 0, inputVal;
		while (true) {
			System.out.println("수를 입력해 보세요 현재 입력수는 " + sum + " 입니다");
			inputVal = scn.nextInt();
			if (inputVal == -1) {
				break;
			}
			sum += inputVal;

		}
		sum++;
		System.out.println("총 입력수는 " + (sum + inputVal) + " 입니다");
	}
}
