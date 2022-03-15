package com.dev;

public class ForExample2 {
public static void main(String[] args) {
//	int sum =0;
//	for (int i = 1; i <= 5; i++) {
//		
//		sum=sum+i;
	
	
	System.out.println("1입니다");
	System.out.println("2입니다");
	System.out.println("3입니다");
	
	int sum = 0;
	int start = 11;
	int lastCnt = 20;
	for (int i = start; i <= lastCnt; i++) {
		if(i % 2 == 0 ) {
			System.out.println(i);
			sum += i;
		}
			
			

		
		
		
		
		
		
}
	System.out.println("짝수의 합: " + sum);
}
}