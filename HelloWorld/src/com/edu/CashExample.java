package com.edu;

import java.util.Scanner;

public class CashExample {
public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	// 2���� ���� �Է�. 
	int price, cash;
	System.out.println("������ �Է��ϼ���:");
	// ������ �Է��ϼ���...
    //price = ???.nextInt();  5500��, �ΰ��� 10% ���Ե� �ݾ�.
	price = scn.nextInt();
	// price2 = price * (10/100);
	
	System.out.println("���ұݾ��� �Է��ϼ���:");
    cash = scn.nextInt();
    
    // �ϳ��� ��ǰ�� �ΰ���, �ϳ��� �Ž�����
    // �ΰ��� : 500��
    // �Ž����� : 4500��
    System.out.println("�ΰ����� " +  (price * 1/10) + " ���̸�, �Ž������� " + (cash-price) + " ���Դϴ�");
    scn.close();
}
}
