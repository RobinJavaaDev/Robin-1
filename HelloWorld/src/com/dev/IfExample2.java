package com.dev;

import java.util.Scanner;

public class IfExample2 {
public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	// 물건가격이 50000 이상, 배송비 0
	// 그외에는 배송비 3000원
	
	// 결제 가격 보여주는 코드
	int price, fee = 3000;
	System.out.println("결제 비용 입력.");
	price = scn.nextInt();
	
	if (price >= 50000) {
		System.out.println("결제 가격은 " + price + " 이며 배송비는 0원 입니다. ");
		
	} else {
		System.out.println("결제 가격은 " + (price + fee) + "이며 배송비는 " + fee + " 원 입니다.");
	}
	// price = (price >= 50000) ? price: price + fee;
	scn.close();	
}
}
