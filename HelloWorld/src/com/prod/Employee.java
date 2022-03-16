package com.prod;

public class Employee {
	private int employeeId;
	private String employeeName;
	private String department;
	private String job;
	private int salary;

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public int setEmployeeId() {
		return this.employeeId;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String setEmployeeName() {
		return this.employeeName;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String setdepartment() {
		return this.department;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String setjob() {
		return this.job;
	}

	public String getEmpinfo() {
		String result = this.employeeName + "의 부서는 " //
				+ this.department + "이고 직무는 " + this.job + //
				" 이고 급여는 " + this.salary + " 입니다.";
		return result;
	}

	public void setSalary(int salary) {
		if (salary < 0) {
			this.salary = 1000000;

		} else {
			this.salary = salary;
		}

	}

	public int getSalary() {
		return this.salary;
	}
}
