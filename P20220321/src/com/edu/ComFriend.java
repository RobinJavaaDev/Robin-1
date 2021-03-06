package com.edu;

public class ComFriend extends Friend {
// 회사: 회사이름, 회사업무
	
	public ComFriend (String name, int age, double height, double weight, String phone, String company, String job) {
		super(name, age, height, weight, phone);
		this.company = company;
		this.job = job;
	}
	private String company;
	private String job;
	
	public ComFriend() {
		
	}
	// public ComFriend() {}  // super();
	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}
	@Override
	public String toString() {
		String str = "친구의 이름은 "  + super.getName() + " 이고\n";
		str += "나이는" + super.getAge() + " 이고 \n" ;
		str += "연락처는 "	+ this.getPhone()+ " 입니다\n";
		str += "=====================================\n";
		str += "전공은 "	+ this.job+ " 입니다\n";
		str += "회사는 "	+ this.getCompany()+ " 입니다\n";
		
		
		return str;
	}
	

	
	
}
