package com.dev;

import java.util.Scanner;

public class SwitchExample2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		// 90점 이상 A, 80점 이상 B, 70점 이상 C, 60점 이상 D, 그외 F;
		int score;

		System.out.println("성적을 입력하세요");
		score = scn.nextInt();

		switch (score / 10) {
		case 10:
			System.out.println("A+입니다");
			break;
		case 9:
			System.out.println("A입니다");
			break;
		case 8:
			System.out.println("B입니다");
			break;
		case 7:
			System.out.println("C입니다");
			break;
		case 6:
			System.out.println("D입니다");
			break;
		default:
			System.out.println("F입니다");

		}
	}
}