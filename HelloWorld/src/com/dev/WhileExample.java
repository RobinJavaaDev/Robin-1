package com.dev;

public class WhileExample {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			System.out.println("i으ㅢ ㄱ갓ㅄ " + i);
		}
		int i = 1; // 초기화값을 안에
		while (i <= 5) { // 조건식을 여기
			System.out.println("i의 ㄱ갑ㅄ " + i);
			i++; // 증감식을 여기
		}

		// while
		int num = 0;
		while (true) {
//			System.out.println("num :  " + num);
//			num++;
//			if (num > 5) {
//				break; // 반복문 탈출 ㄷㄷㄷㄷ
//			}
			while (true) {
				int rand = (int) (Math.random() * 10) + 1;
				System.out.println("랜덤 가ㅄ :" + rand);
				if (rand == 8) {
					break;				
				}
			
			}
			
		}

	}

}
