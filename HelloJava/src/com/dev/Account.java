package com.dev;

public class Account {
	// 계좌정보, 예금주, 예금액
	// field.
	private String accNo;
	private String accName;
	private int money;

	public static String bankName;
	static {
		bankName = "한일은행";
	}
	// constructor, 생성자: 목적은 필드의 초기값을 지정함
	public static void showBankname() {
		System.out.println("한일은행입니다");
	}
	
	

	public Account(String accNo, String accName, int money) {
		super();
		this.accNo = accNo;
		this.accName = accName;
		this.money = money;
	}



	public Account(String accNo, String accName) {
		super();
		this.accNo = accNo;
		this.accName = accName;
	}



	// method.
	public String getAccNo() {
		return accNo;
	}

	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}

	public String getAccName() {
		return accName;
	}

	public void setAccName(String accName) {
		this.accName = accName;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", accName=" + accName + ", money=" + money + "]";
	}
	
}
