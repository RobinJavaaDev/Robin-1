package com.edu;

import java.util.Scanner;

public class calExample {
public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	int hour, minute, second, inputVal;
//	�� �Է� -> ��/��/�� ����
	System.out.println("�ʴ��� �Է�:");
	inputVal =  scn.nextInt();
	hour = inputVal / 3600;
	minute = (inputVal % 3600) / 60;
	second = (inputVal % 3600) % 60;
	
	System.out.println( hour + "�ð�" +  minute + "��" + second + "��");
	
	scn.close();

		
	}
	
	
	
//	int  = scn.nextInt();
//	System.out.println("���� ����:");
}

