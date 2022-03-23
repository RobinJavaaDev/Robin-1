package com.edu.api;

import java.util.Calendar;

public class CalendarExample {
	public static void main(String[] args) {
		int year = 2022;
		int month = 5;

//		creatCalendar(year, month);
		creatCalendar(2021, 5);
		Calendar today = Calendar.getInstance();
//		today.set(year, month, 1);
	}

	public static void creatCalendar(int year, int month) {
		Calendar today = Calendar.getInstance();
		today.set(year, month - 1, 1);

		System.out.println("올해는 : " + today.get(Calendar.YEAR));
		System.out.println("이번달은 : " + today.get(Calendar.MONTH)) ; // 1월:0 2월:1 3월:2
		System.out.println("오늘은 : " + today.get(Calendar.DATE));
		System.out.println("요일정보 : " + today.get(Calendar.DAY_OF_WEEK)); // 일:1 월:2 화:3 수:4
		System.out.println("마지막날 정보 : " + today.getActualMaximum(Calendar.DATE));
		int gapDay = today.get(Calendar.DAY_OF_WEEK);
		int lastDate = today.getActualMaximum(Calendar.DATE);

		// 요일 정보 출력
		String[] days = { "Sun ", "Mon ", "Tus ", "Wends ", "Thr ", "Fri ", "Sat ", "\r\n" };
		for (int i = 0; i < days.length; i++) {
			System.out.printf("%4s", days[i]);
		}
		System.out.println();
		// 1일의 위치 지정
		for (int i = 1; i < gapDay; i++) {
			System.out.printf("%4s", "");
		}
		// 날짜 출력
		for (int i = 1; i <= lastDate; i++) {
			System.out.printf("%4d", i);
			if ((i + gapDay - 1) % 7 == 0) {
				System.out.println();
			}

		}
		// 프로그램끝
		System.out.println("\nend of prog");
	}

}
