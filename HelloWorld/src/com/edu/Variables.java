package com.edu;

public class Variables {
	public static void main(String[] args) {
		// ����:�޸𸮰�
		int age = 20;
		System.out.println("age����: " + age);
		int num1 = 30;
		int num2 = 50;
		int result = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + result);
		System.out.println("20 + 10 = 30");

		String name = "ȫ�浿"; //
		name = "���ؽ�";
		System.out.println(name + "�� ���̴�" + age + "�Դϴ�.");

//		String myName = "�����"; // ���

		// ��ȭ��ȣ, �̸��� ���� ���� �� �ִ� ����
		String phoneNumber = "010-1234-1234";
		String email = "qwert@naver.com";
		System.out.println(name + "�� ��ȭ��ȣ " + phoneNumber + "�̰� �̸����� " + email + " �Դϴ�. ");
//		System.out.println("���ؽ��� ��ȣ: 010-1234-1234�̰� �̸����� qwert@naver.com �Դϴ�");

	}
}
