package com.edu;

import java.util.Scanner;

public class RectangleExample {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
//		int xLength, yLength, area;
		
		System.out.println("���� ����:");
	    int xLength = scn.nextInt();
	    
		System.out.println("���� ����:");
		int yLength = scn.nextInt();
		
		int area = xLength * yLength ;
		
		System.out.println("���(�ʺ�) ���:" + (area) );
		
		scn.close();
	}
}
