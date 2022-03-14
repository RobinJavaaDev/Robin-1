package com.edu;

import java.util.Scanner;

public class ScannerExample { // com.sdu.ScannerExample
public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	
	System.out.println("첫번째 숫자를 입력하세요..");
	int val = scn.nextInt();
	System.out.println("두번째 숫자를 입력하세요..");
	int val2 = scn.nextInt();
	
	
//	int sum = val + val2;
//	System.out.println("두수의 합은 " + sum +" 입니다.");
//	   or....
	System.out.println("두수의 합은 " + (val + val2) +" 입니다람쥐.");
	

	
//	if(val % 2 == 0) {
//		System.out.println("짝수입니다람쥐");
//	}
//	if(val % 2 == 1) {
//		System.out.println("홀수입니다람쥐");
//	}
	scn.close();
}
}
