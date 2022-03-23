package com.homework;

import java.util.Scanner;

public class Exam03 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[] intAry = new int[4];

		for (int i = 0; i < intAry.length; i++) {
			System.out.println("정수 입력>>");
			intAry[i] = scn.nextInt();
		}
		/// 반복문 통해 배열에 3개 저장 [34, 23, 56]
		int maxValue = intAry[0];
		for (int i = 0; i < intAry.length; i++) {
			if (intAry[i] > maxValue) {
				maxValue = intAry[i];
			}
		}
		System.out.println("최대값: " + maxValue);
	}
}
