package com.prod;

public class ArrayExample2 {
	public static void main(String[] args) {
		// 정수를 담을 수 잇는 배열 3개/ 정수이름 ages / 20, 23, 27
		int[] ages = new int[3];
		ages[0] = 30;
		ages[1] = 32;
		ages[2] = 35;
		int sum = 0;

		System.out.println(ages[0] + "살 입니다.");
		System.out.println(ages[1] + "살 입니다.");
		System.out.println(ages[2] + "살 입니다.");

//		System.out.println("나이의 합은"+ (ages[0] + ages[1] + ages[2])+"살 입니다.");

		for (

				int i = 0; i < 3; i++) {
			sum += ages[i];
		}
		double avg = (double)sum / 3;
		System.out.printf("평균은 " + avg + "입니다");

	}
}
