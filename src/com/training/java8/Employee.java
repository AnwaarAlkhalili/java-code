package com.training.java8;

public class Employee {
	
	private int empId;
	private String empName;
	private String city;
	private char gender;
	private Department empDep;
	
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public Department getEmpDep() {
		return empDep;
	}
	public void setEmpDep(Department empDep) {
		this.empDep = empDep;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", city=" + city + ", gender=" + gender
				+ ", empDep=" + empDep + "]";
	}

}
