package com.prod;

public class ArrayExample5 { // 홀수 위치에 잇는 애들 더하고 평균
	public static void main(String[] args) {
		int[] numbers = { 35, 22, 17, 40, 28, 33, 36 };
		int odd = 0;
		int cnt = 0;
		for(int i=0; i<numbers.length;i++) {
			if(i % 2 == 0) {// 짝수일 경우...
				odd +=numbers[i];
				cnt++;
				
			}
		}
		System.out.println("홀수수의 합: " + odd);
		System.out.println("홀수수의 평균: " + (odd / (double) cnt));
}
}