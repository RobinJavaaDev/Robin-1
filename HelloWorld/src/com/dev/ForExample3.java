package com.dev;

import java.util.Scanner;

public class ForExample3 {
public static void main(String[] args) {
	// 입력 받는 두 수를 num1, num2 
	// 
	Scanner scn = new Scanner(System.in);
	int num1, num2, sum = 0;
	System.out.println("첫번째 수를 입력 하시오");
	num1 = scn.nextInt();
	
	System.out.println("두번째 수를 입력 하시오");
	num2 = scn.nextInt();
	
	for (int i = num1; i <= num2; i++) {
     sum += i;
	}

	
			
	System.out.println(num1 + "부터 " + num2 + "사이의 합은: " + sum );
	
}
}
