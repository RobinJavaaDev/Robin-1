package com.edu;

import java.util.Scanner;

public class TemperatureExample {
public static void main(String[] args) {
	// C = 5/9 (F-32) ȭ�� �µ��� ���� �µ��� �����ϴ� ��Ģ
	// 30.0 ���� ũ�� "������ ���� �����׿�" �� �ܴ� "�츸�ϳ׿�"
	Scanner scn = new Scanner(System.in);
	double fDeg, cDeg;
	System.out.println("ȭ���µ��Է�:");
	fDeg = scn.nextDouble();
	cDeg = (double)5/9 * (fDeg - 32);
	
	boolean today = cDeg > 30;
	
	if(today) {
		System.out.println("������ ���� �����׿� ���� ����� " + cDeg + "�Դϴ�");
		} else {
			System.out.println("�츸�ϳ׿� ���� ����� " + cDeg + "�Դϴ�");
		}
			
	scn.close();
	
	
	
}
}
