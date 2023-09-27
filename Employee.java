package com.java8.basic;

public class Employee {
	int eNo;
	String eName;
	int marks;
	double salary;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int eNo, String eName, int marks, double salary) {
		super();
		this.eNo = eNo;
		this.eName = eName;
		this.marks = marks;
		this.salary = salary;
	}
	public int geteNo() {
		return eNo;
	}
	public void seteNo(int eNo) {
		this.eNo = eNo;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [eNo=" + eNo + ", eName=" + eName + ", marks=" + marks + ", salary=" + salary + "]";
	}
}
