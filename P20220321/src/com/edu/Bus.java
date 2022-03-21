package com.edu;

public class Bus extends Vehicle {

	public Bus() {
		super.setMaxSpeed(110);
	}

	@Override
	public void run() {

		System.out.println("버스가 달림");
	}

	@Override
	public void stop() {

		System.out.println("버스가 멈춤");
	}

	@Override
	public String toString() {

		return "버스의 최고속도는 " + getMaxSpeed() + " 입니다";

	}
}
