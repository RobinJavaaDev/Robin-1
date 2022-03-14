package com.edu;

import java.util.Scanner;

public class CashExample {
public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	// 2개의 값을 입력. 
	int price, cash;
	System.out.println("가격을 입력하세요:");
	// 가격을 입력하세요...
    //price = ???.nextInt();  5500원, 부가세 10% 포함된 금액.
	price = scn.nextInt();
	// price2 = price * (10/100);
	
	System.out.println("지불금액을 입력하세요:");
    cash = scn.nextInt();
    
    // 하나는 상품의 부가세, 하나는 거스름돈
    // 부가세 : 500언
    // 거스름돈 : 4500원
    System.out.println("부가세는 " +  (price * 1/10) + " 원이며, 거스름돈은 " + (cash-price) + " 원입니다");
    scn.close();
}
}
