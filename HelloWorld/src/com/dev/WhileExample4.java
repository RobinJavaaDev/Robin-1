package com.dev;

import java.util.Scanner;

public class WhileExample4 {
	public static void main(String[] args) {
		// 은행계좌, 1번: 입금, 2번: 출금, 3번: 종료
		// 입금일경우, 입금 액 입력 하세요...account 에 값 누적
		// 출금일경우, 출금 액 입력... account에 값 차감
		// 종료일경우, 프로그램 종료

		// *continue => 구문 아래를 무시하고 다음 순번으로 넘어감*
		Scanner scn = new Scanner(System.in);
		int account = 0, menu;

		while (true) {
			System.out.println(" 입금=1번,출금=2번, 종료=3번 현재 잔액은 " + account + " 원입니다");
			menu = scn.nextInt();
			if (menu == 1) {
				System.out.print("입금액을 입력 하세요 ");
				account += scn.nextInt();
				// 만약 여기잔액...=> System.out.print("잔액" + account );
			} else if (menu == 2) {
				System.out.print("출금액을 입력 하세요 ");
				int minus = scn.nextInt();
				if (minus > account) {
					System.out.print("오류 ! 메인 메뉴로 돌아갑니다 !");
				} else {
					account -= minus;
							}
			} else if (menu == 3) {
				System.out.print("사용종료");
				break;
			}

		}

	}
}
