package com.edu;

import java.util.Scanner;

public class calExample {
public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	int hour, minute, second, inputVal;
//	초 입력 -> 시/분/초 변경
	System.out.println("초단위 입력:");
	inputVal =  scn.nextInt();
	hour = inputVal / 3600;
	minute = (inputVal % 3600) / 60;
	second = (inputVal % 3600) % 60;
	
	System.out.println( hour + "시간" +  minute + "분" + second + "초");
	
	scn.close();

		
	}
	
	
	
//	int  = scn.nextInt();
//	System.out.println("가로 길이:");
}

