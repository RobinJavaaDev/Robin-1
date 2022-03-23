package com.dev;

public class GududanEx {
	public static void main(String[] args) {
		int result = sum(sum(10, 20), sum(5, 7));

		int[] newAry = { 10, 20, 30 };
		int result1 = sum(newAry);
		System.out.println("결과는 " + result);
		System.out.println("결과는 " + result1);
		System.out.println(divide(10, 4));

	}

	// 배열매개변수의 각 요소를 합을 구함
	public static int sum(int[] ary) {
		int sum = 0;
		for (int i = 0; i < ary.length; i++) {
			sum += ary[i];
		}
		return sum;
	}

	// 나누기 메소드 구현 (int, int)
	public static double divide(int n3, int n4) {
		if (n3 == 0) {
			return 0;
		}
		return n3 / (double) n4;

	}

	public static int sum(int n1, int n2) {
		return n1 + n2;
	}

	public static void gududan(int dan) {
		System.out.println();
		for (int i = 1; i <= 9; i++) {
			for (int i1 = 2; i1 <= 9; i1++)
				System.out.println(i1 + "*" + i + "=" + (i * i1));
		}
		System.out.println();
	}

	public static void printStar(int runCnt, String shape) {
		for (int i = 0; i < runCnt; i++) {
			System.out.print(shape);
		}

	}

	public static void printGugudan() {
 
		// 메소드 실행 하려면 새로운 클래스이름();
//		Student.callStatic();
	Students.callStatic();
		for (int q = 2; q <= 9; q++) {
			for (int w = 1; w <= 9; w++) {
				System.out.print(q + "*" + w + "=" + (q * w) + "\t");

			}
			System.out.println();
		}

		for (int j = 2; j <= 4; j++) {

			int cnt = j;
			System.out.println("[" + cnt + "단}");
			for (int i = 1; i <= 9; i++) {
				System.out.println(cnt + " * " + i + " = " + (i * cnt));

			}

		}

	} // end of printGugudan

} // end of class GugudanEx