package com.edu;

import java.util.Scanner;

public class TemperatureExample {
public static void main(String[] args) {
	// C = 5/9 (F-32) 화씨 온도를 섭씨 온도로 변경하는 규칙
	// 30.0 보다 크면 "오늘은 더운 날씨네요" 그 외는 "살만하네요"
	Scanner scn = new Scanner(System.in);
	double fDeg, cDeg;
	System.out.println("화씨온도입력:");
	fDeg = scn.nextDouble();
	cDeg = (double)5/9 * (fDeg - 32);
	
	boolean today = cDeg > 30;
	
	if(today) {
		System.out.println("오늘은 더운 날씨네요 오늘 기온은 " + cDeg + "입니다");
		} else {
			System.out.println("살만하네요 오늘 기온은 " + cDeg + "입니다");
		}
			
	scn.close();
	
	
	
}
}
