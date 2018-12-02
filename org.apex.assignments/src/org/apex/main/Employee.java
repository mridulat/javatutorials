package org.apex.main;

public class Employee {
	
	private int empNo;

	private String empName,designation,emailAdress,phoneNo;
	private String address, state, zipcode;
	
	private int experienceInYears;
	private double basic,hra,bonus;
	
	
	public Employee(int empNo, String empName, String designation,
			String emailAdress, String phoneNo, int experienceInYears,
			String address, String state, String zipcode,
			double basic, double hra, double bonus) {
		
		this.empNo = empNo;
		this.empName = empName;
		this.designation = designation;
		
		this.emailAdress = emailAdress;
		this.phoneNo = phoneNo;
		this.experienceInYears = experienceInYears;
		
		this.address = address;
		this.state = state;
		this.zipcode = zipcode;

		this.basic = basic;
		this.hra = hra;
		this.bonus = bonus;
	}	
	
	
	public void salary() {
		System.out.println("Salary is    :" + (basic+hra+(basic*bonus/100)));
	}
	
	public void display() {
		System.out.println("Employee No  :" + getEmpNo());
		System.out.println("Employee Name:" + getEmpName());
		System.out.println("Designation  :" + getDesignation());

		System.out.println("Email Address:" + getEmailAdress());
		System.out.println("Phone No     :" + getPhoneNo());
		System.out.println("Exp In Yrs   :" + getExperienceInYears());

		System.out.println("Address      :" + getAddress());
		System.out.println("State        :" + getState());
		System.out.println("Zipcode      :" + getZipcode());

		System.out.println("Basic Pay    :" + getBasic());
		System.out.println("HRA          :" + getHra());
		System.out.println("Bonus        :" + getBonus());
	}
	
	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public int getExperienceInYears() {
		return experienceInYears;
	}

	public void setExperienceInYears(int experienceInYears) {
		this.experienceInYears = experienceInYears;
	}

	public double getBasic() {
		return basic;
	}

	public void setBasic(double basic) {
		this.basic = basic;
	}

	public double getHra() {
		return hra;
	}

	public void setHra(double hra) {
		this.hra = hra;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getEmailAdress() {
		return emailAdress;
	}

	public void setEmailAdress(String emailAdress) {
		this.emailAdress = emailAdress;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
}
