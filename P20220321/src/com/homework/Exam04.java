package com.homework;

public class Exam04 {
public static void main(String[] args) {
	int[] intAry = new int[5];
	
	for (int i=0; i<intAry.length; i++) {
	intAry[i]	= (int)(Math.random() * 6 ) + 1; // 0 <= x < 1 ... 6 
		
	}
	int maxValue = intAry[0];
	for (int i = 0; i < intAry.length; i++) {
		if (intAry[i] > maxValue) {
			maxValue = intAry[i];
		}
	}
	System.out.println("최대값: " + maxValue);
	
	
}
}
