package com.dev;

import com.edu.Calcurator;

public class AccExample {
	public static void main(String[] args) {
		Account[] accounts;

		accounts = new Account[] { new Account("1-111", "hong") //
				, new Account("1-112", "hwang") //
				, new Account("1-113", "kim")

		};

		System.out.println(Account.bankName);
		Account.showBankname();
//	Account a1 = new Account();
// 쉐어하우스........ 주방, 거실 <static> vs 개인 방,방... <instance>
		Calcurator.sum(10, 20);
		Calcurator c1 = new Calcurator();
		c1.sum(10, 20);
		
		Calcurator.getArea(10);
		
		//static 활용
		// 
	}
}
