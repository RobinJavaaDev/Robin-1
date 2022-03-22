package com.edu.nested;

public class Outer {
	//
	private String field1;
	private int field2;

	class Inner { // 멤버클래스.
		String field3;
		int field4;

		void method2() {
			System.out.println("Inner.method2()");
		}

	}
   /// 함수적 인터페이스: 구현해야 할 메소드가 하나인것.것
	interface Runnable {
		void run();
	}

	class Bus implements Runnable {

		@Override
		public void run() {
			System.out.println("Bus가 달립니다.");

		}

	}

	public String getField1() {
		return field1;
	}

	public void method1() {
		System.out.println("Outer.method1()");
		Inner inner = new Inner();
		inner.method2();
	}

	public void method3() {
		System.out.println("Outer.method3()");
		class Local { // 로컬클래스
			void method4() {
				System.out.println("Local.method4()");
			}

		}
		Local local = new Local();
		local.method4();
	}

	public void method4() {
		Runnable runnable = new Bus(); // 인터페이스의 구현객체
		runnable.run();

		// 익명구현객체.
		// Lambda 표현식.
		runnable = () ->  System.out.println("임의의 객체 실행."); // function,람다 람쥐썬다,인터ㅍ페이스 안에 ㅁ하나만잇어야함

			// Runnable 을 바로 지정함 ,, 일회용임 기억해놓자...

		
		runnable.run();
	}
}
