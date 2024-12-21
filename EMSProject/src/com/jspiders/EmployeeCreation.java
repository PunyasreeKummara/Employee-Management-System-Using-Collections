package com.jspiders;

public class EmployeeCreation {
	private static  int randum=1001;
	public Employee CreateEmployee(String name,double salary,double exp,String designation,String company) {
		Employee e=new Employee(randum++,name,salary,exp,designation,company);
		return e;
	}

}
