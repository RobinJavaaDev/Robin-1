package com.edu;

public class ArraySort {
	public static void sorting(int[] ary) {

		int loopCnt = ary.length - 1;
		int temp = ary[0]; // 첫번째 값을 temp로 지정
		for (int cnt = 0; cnt < loopCnt; cnt++) {
			for (int i = 0; i < loopCnt; i++) {
				if (ary[i] > ary[i + 1]) {
					// 34 25 => 25 34 로 변경
					temp = ary[i];
					ary[i] = ary[i + 1];
					ary[i + 1] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] intAry = { 34, 25, 48, 12 };
		int[] inAry2 = { 22, 56, 99, 12 };
		int[] inAry3 = { 22, 56, 99, 12 };

//		sorting(intAry2);

		int loopCnt = intAry.length - 1; // 마지막값이 제일 처음 위치로 이동
		for (int cnt = 0; cnt < loopCnt; cnt++) {

			int temp = intAry[0]; // 첫번째 값을 temp로 지정
			for (int cnt1 = 0; cnt1 < loopCnt; cnt1++)
				for (int i = 0; i < loopCnt; i++) {
					if (intAry[i] > intAry[i + 1]) {
						// 34 25 => 25 34 로 변경
						temp = intAry[i];
						intAry[i] = intAry[i + 1];
						intAry[i + 1] = temp;
					}

//		 inAry[i] -> intAry[i+1]; 

				}

		}
		for (int i = 0; i < intAry.length; i++) {
			System.out.print(intAry[i] + " ");
		}
		System.out.println("\nend");
	}
}