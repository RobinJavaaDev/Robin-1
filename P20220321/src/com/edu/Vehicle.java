package com.edu;

public class Vehicle {

	private int maxSpeed;

	public Vehicle() {
		this.maxSpeed = 100;

	}

	public int getMaxSpeed() {
		return maxSpeed;
		
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public void run() {
		System.out.println("탈것이 달림");
	}

	public void stop() {
		System.out.println("탈것이 멈춤");
	}

	@Override
	public String toString() {
		
		
		return "탈것의 최고속도는 " + getMaxSpeed() + " 입니다";
	}
	
}

