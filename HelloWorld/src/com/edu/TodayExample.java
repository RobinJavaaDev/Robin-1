package com.edu;
// �̸� �Է� �ޱ� (���ڿ�,String) -> scn.nextLine();
// ����ó �Է� �ޱ� (���ڿ�,String) -> scn.nextLine();
// ���� �Է� �ޱ� (int) -> scn.nextInt();
// Ű �Է� �ޱ� (double) -> scn.nextdouble();

import java.util.Scanner;

// �̸��� : ???
// ����ó�� : 000-1234-5678
// ���� : 26
// Ű : 168.1
// ������ : 51541541
// ����������: (Ű-100) * 0.9 => 60.3 ���� ũ�� ��ü�� ������ ��ü��

// ���� 67.5, �̸� +-5ų�ζ� // 72.5 ~ 62.5
// ���� 67.5, ������ 69.3
// if(������+5>���� && ������-5<����) {
//      System.out.println(����);    
//   } else { 
//      System.out.println(������);
//   }
//
// }
public class TodayExample {
public static void main(String[] args) {
	String name, num;
	int age;
	double height, weight, proper;
	Scanner scn = new Scanner(System.in);
	System.out.println("�̸��� �Է��ϼ���:");
	name = scn.nextLine();
	System.out.println("����ó�� �Է��ϼ���:");
	num = scn.nextLine();
	System.out.println("���̸� �Է��ϼ���:");
	age = scn.nextInt();
	System.out.println("Ű�� �Է��ϼ���:");
	height = scn.nextDouble();
	System.out.println("�����Ը� �Է��ϼ���:");
	weight = scn.nextDouble();
	proper = (height - 100) * 0.9;
			
	
	
	System.out.println("�̸��� "+ name + " �Դϴ�");
	System.out.println("����ó�� "+ num + " �Դϴ�");
	System.out.println("���̴� "+ age + " ���Դϴ�");
	System.out.println("Ű�� "+ height + "cm�Դϴ�");
	System.out.println("�����Դ� "+ weight + "kg�Դϴ�");
	
	if(weight+5>proper && weight-5<proper) {
      System.out.println("����");    
   } else { 
      System.out.println("������");
   }
	
	
	
	
	
	
//	if(weight>proper) {
//		System.out.println("����� �����Դ� " + weight + " �̸�, ������������ " + proper + "���� ���׿�.. ���̾�Ʈ... ");
//	} else {
//		System.out.println("����� �����Դ� " + weight + "�̸�, ������������ " + proper + "�� ����մϴ�! ");
//	}
	
	
}
}
