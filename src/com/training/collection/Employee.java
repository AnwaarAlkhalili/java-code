package com.training.collection;

import java.util.Objects;

public class Employee {
	
	private int empId;
	private String empName;
	private String deptName;
	private double salary;
	
	public Employee(int empId, String empName, String deptName, double salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.deptName = deptName;
		this.salary = salary;

	}

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

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", deptName=" + deptName + ", salary=" + salary
				+ "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(deptName, empId, empName, salary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(deptName, other.deptName) && empId == other.empId
				&& Objects.equals(empName, other.empName)
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
	}

}
