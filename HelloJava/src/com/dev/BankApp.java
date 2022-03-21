package com.dev;

import java.util.Scanner;

// BankApp(main method), Account(계좌번호, 예금주, 잔액)
public class BankApp {
	static Account[] banks = new Account[100];
	static Scanner scn = new Scanner(System.in);
	// 메뉴: 1. 계좌 생성(번호, 예금주, 예금액)
	// 2. 예금(번호 입력-> 예금액 입력) -> 최고 예금액 100,000 원
	// 3. 출금(번호 입력-> 출금액 입력) -> 잔액보다 크면 출금 못함
	// 4. 잔액 조회(번호 입력 -> 잔액)
	// 5. 종료.
	// 자바4일째;;;;;;; 인데 에바

	public static void main(String[] args) {

		while (true) {
			printMenu();
			int menu = scn.nextInt();
			
			if (menu == 1) {
				createAccount();
			} else if (menu == 2) {
				deposit();
			} else if (menu == 3) {
				withdraw();
			} else if (menu == 4) {
				findAccountMoney();
			} else if (menu == 6) {
				System.out.println("시스템 종료");
				break;
			} else if (menu == 9) {
				showList();
			}
		}
		System.out.println("====end of Prog===");

	} // end of main()
		// 메뉴 출력기능

	public static void printMenu() {
		String menu = "=============================================\r\n" 
	            + "       1. 계좌 생성(번호, 예금주, 예금액) \r\n"
				+ "       2. 예금(번호 입력-> 예금액 입력) -> 최고 예금액 100,000 원. \r\n"
				+ "       3. 출금(번호 입력-> 출금액 입력) -> 잔액보다 크면 출금 못함. \r\n" 
				+ "       4. 잔액 조회(번호 입력 -> 잔액) \r\n"
				+ "       5. 송금(송금번호, 금액, 입금번호) \r\n  " // transferAmount
				+ "       6. 종료.\r\n" 
				+ "=========================================================\r\n" 
				+ " 선택 >> ";
		System.out.print(menu);
	}

	// 계좌생성 메소드
	public static void createAccount() {
		System.out.println("계좌생성기능");
		String accNo;
		while(true) {
			System.out.print("계좌번호입력>>");
			accNo = scn.next();
			if(searchAccountNo(accNo) !=null) {
		    	System.out.println("이미 있는 계좌번호 입니다.");
		    	continue;
		    }
			
			
			break;
		}
		
		System.out.print("예금주입력>>");
		String accName = scn.next();
		System.out.print("예금액력>>");
		int accMoney = scn.nextInt();
		
		// 계좌번호 있는지 체크
	    
		Account accnt = new Account(accNo, accName, accMoney);

		for (int i = 0; i < banks.length; i++) {
			if (banks[i] == null) {
				banks[i] = accnt;
				break;
			}
		}
		System.out.println("계좌가 정상적으로 개설되었습니다.");
	}

	// 예금 메소드
	public static void deposit() {
		System.out.println("예금기능");
		System.out.print("계좌번호>>");
		String ano = scn.next();
		System.out.println("예금액입력>>");
		int amt = scn.nextInt();
		int checkCnt = 0; // 조회 됐는지 체크 여부 변수
		Account findAccount = searchAccountNo(ano);
		if(findAccount != null) {
			checkCnt =1;
			int currAmt = findAccount.getMoney();
			if (currAmt + amt > 100000) {
				checkCnt =2;
			} else {
				findAccount.setMoney(currAmt+amt);
			}
			
		}
		if(checkCnt == 1 ) {
		System.out.println("정상적으로 처리되었습니다.");
	}  else if(checkCnt == 2) {
		System.out.println("한도액 초과입니다.");
	}
		else {
		System.out.println("계좌번호가 없습니다.");
	}
	}

	// 출금 메소드
	public static void withdraw() {
		System.out.println("출금기능");
		System.out.print("계좌번호>>");
		String ano = scn.next();
		System.out.println("출금액입력>>");
		int amt = scn.nextInt();
		int checkCnt = 0;
		for(int i=0; i <banks.length; i++) {
			if(banks[i] !=null && banks[i].getAccNo().equals(ano)) { // 계좌번호 있는 경우..
				// 계좌번호가 조회 됬을때
				checkCnt =1;
				int currAmt = banks[i].getMoney();
				// 출금액이 10만원을 초과하지 못하게함
				if(currAmt - amt < -1 ) {
					checkCnt = 2;
//					System.out.println("한도액 초과입니다.");
					break;
				}
				banks[i].setMoney(currAmt - amt); // 잔액 - 입금액
				break;
			} 
		}
		if(checkCnt == 1 ) {
		System.out.println("정상적으로 처리되었습니다.");
	}  else if(checkCnt == 2) {
		System.out.println("한도액 초과입니다.");
	}
		else {
		System.out.println("계좌번호가 없습니다.");
	}
		
	}

	// 잔액 조회 메소드
	public static void findAccountMoney() {
		System.out.println("잔액조회기능");
		System.out.print("계좌번호>>");
		String ano = scn.next();
		Account findAccount = searchAccountNo(ano);
		if (findAccount == null) {
			System.out.println("계좌가 존재하지 않습니다.");
			return;
		}
		System.out.println("잔액 " + findAccount.getMoney());
//System.out.println(searchAccountNo(ano));
	}
	///송금
	public static void transferAmount () {
		System.out.print("송금할 계좌번호>>");
		String ano = scn.next();
		Account checkAccount = searchAccountNo(ano);
		if(checkAccount == null) {
			System.out.println("계좌가 존재하지 않습니다.");
			return;
		}
		System.out.print("송금할 금액>>");
		int amt = scn.nextInt();
		System.out.print("입금할 계좌번호>>");
	    String ano2 = scn.next();
		int checkCnt = 0;
		for(int i=0; i <banks.length; i++) {
			if(banks[i] !=null && banks[i].getAccNo().equals(ano2)) {
				checkCnt = 1;
			int currAmt = banks[i].getMoney();
			// 송금액이 10만원을 초과하지 못하게함
			if(currAmt + amt < 100000 ) {
				checkCnt = 2;
//				System.out.println("한도액 초과입니다.");
				break;
		}
//		banks[i].setMoney(checkAccount - amt);
			banks[i].setMoney(currAmt + amt );
			
	}
			if(checkCnt == 1 ) {
				System.out.println("정상적으로 처리되었습니다.");
			}  else if(checkCnt == 2) {
				System.out.println("송금액 초과입니다.");
			}
				else {
				System.out.println("계좌번호가 없습니다.");
			}
		}
		
	}
	

//전체리스트 출력
	public static void showList() {
		for (int i = 0; i < banks.length; i++) {
			if (banks[i] != null) {
				System.out.println(banks[i].toString());
			}
		}

	}
// 계좌번호를 입력하면 배열(banks)에서 그 계좌번호를 반환하고 없으면 null
	// 100 - 35개저장 = 75개
	public static Account searchAccountNo(String accNo) {
		for(int i=0; i<banks.length; i++) {
			if (banks[i] !=null && banks[i].getAccNo().equals(accNo)) {
				return banks[i];
			}
		}
		return null; // 클라스 -> null(Student, Car, ...
	}
	
}
