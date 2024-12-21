package com.jspiders;
//Entity Class-java bean class Structure
public class Employee {
	private final int id;
	private String name;
	private double salary;
	private  double exp;
	private String designation;
	private  String company;
	public Employee(int id, String name, double salary, 
			double exp, String designation, String company) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.exp = exp;
		this.designation = designation;
		this.company = company;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getExp() {
		return exp;
	}
	public void setExp(double exp) {
		this.exp = exp;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public int getId() {
		return id;
	}
	 
	

}
