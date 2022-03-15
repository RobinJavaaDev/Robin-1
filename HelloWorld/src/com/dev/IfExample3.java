package com.dev;

import java.util.Scanner;

public class IfExample3 {
public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	int num, ranVal ;
	
	System.out.println("수를 예측해 보세요");
	num = scn.nextInt();
	
	ranVal = (int) (Math.random() * 3) + 1; // 0~1
	System.out.println("정답은... " + ranVal + "!");
	
	if(num == ranVal) {
		System.out.println("정답입니다!");
	} else  {
		System.out.println("틀렸습니다.");
	}
	scn.close();
}
}
