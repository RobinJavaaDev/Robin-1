package com.edu;

public class VariableExample {
	public static void main(String[] args) {
	
	  int num1 = 100; 
	  double num2 = 100.5;
	  double result = (double) num1 * num2;
//	  �ڵ�����ȯ:(promotion) �������� -> ū ����
	  System.out.println("���:" + result);
//	  ��������ȯ:(casting) ū���� -> ��������
	  int val1 = 100;
	  double val2 = 20.5; // 20
	  int sum = val1 + (int) val2;
	  System.out.println("���:" + sum);
	  
	  int n1 = 11;
	  int n2 = 4;
	  
	  double n3 = (double) n1 / n2; // 10/4 => 2.5 
	  System.out.println("���� ����:" + n3);
	  
//	  ������ 10�� 3���� ���� ������ => 1 
	  int n4 = n1 % n2; 
	  System.out.println ("������: " + n4);
	  
//	  ¦��, Ȧ�� ���ϱ�
	  if(n1 % 2 == 1) {
		  System.out.println(n1 +  "�� ���� Ȧ�� �Դϴ�.");
	  }
	  
}

}
