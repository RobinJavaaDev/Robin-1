package com.edu;

import java.util.Scanner;

public class ScannerExample { // com.sdu.ScannerExample
public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	
	System.out.println("ù��° ���ڸ� �Է��ϼ���..");
	int val = scn.nextInt();
	System.out.println("�ι�° ���ڸ� �Է��ϼ���..");
	int val2 = scn.nextInt();
	
	
//	int sum = val + val2;
//	System.out.println("�μ��� ���� " + sum +" �Դϴ�.");
//	   or....
	System.out.println("�μ��� ���� " + (val + val2) +" �Դϴٶ���.");
	

	
//	if(val % 2 == 0) {
//		System.out.println("¦���Դϴٶ���");
//	}
//	if(val % 2 == 1) {
//		System.out.println("Ȧ���Դϴٶ���");
//	}
	scn.close();
}
}
