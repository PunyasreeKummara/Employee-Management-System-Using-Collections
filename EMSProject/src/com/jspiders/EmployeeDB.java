 package com.jspiders;

public class EmployeeDB {
	private Employee[] emparr;
	private int index=0;
	private int empcount=0;
	
	EmployeeDB(int size){//Parameterized constructor
		emparr=new Employee[size];
		
	}
	/**
	 * this method is used to add Employee details into the database
	 * @param e should be employee type
	 * @return returns true if added Successfully ,else returns false
	 */
	public boolean addEmployee(Employee e){
		if(index<emparr.length) {
			emparr[index++]=e;
			System.out.println("Employee deyails add to be DB");
			empcount++;
			return true;
		}
		else {
			System.out.println("Database is full");
			return false;
		}
	}
	/**
	 * this method prints all the details of the employees
	 */
	public void viewFullDatabase() {
		System.out.println("----------------------------------");
		System.out.println("ID\tName\tsalary\tExp\tDesignation\tcompany Name");
		System.out.println("----------------------------------");
		for(Employee emp:emparr) {
			if(emp!=null) {
				System.out.println(emp.getId()+"\t"+emp.getName()+"\t"+emp.getSalary()+"\t"+emp.getExp()+
						"\t"+emp.getDesignation()+"\t"+emp.getCompany());
			}
		}
	}
	/**
	 * this method used to get total employee in database 
	 * @return return int value representing total employees
	 */
	public int getEmployeeCount(){
		return empcount;
	}
	/**
	 * this method is used to search employee based on id,
	 * @param id of the employee to be searched
	 * @return  return reference to found employee otherwise returns null
	 */
	public Employee searchEmployee(int id) {
		Employee e=null;
		for(int i=0;i<emparr.length;i++) {
			if(emparr[i]!=null&&emparr[i].getId()==id) {
				System.out.println("Employee is  found in database");
				e=emparr[i];
			}
		}
		if(e==null) {
			System.out.println("Employee is not found in database");
		}
		return e;
	}
	/**
	 * this method is used to update the salary of the employee. if employee is found in
	 * database it will update salary of the employee by the specified amount
	 * @param id-employee id whose salary to be update
	 * @param amount-amount to be added to salary
	 * @return true-if update is success
	 *         false-if update is failed
	 */
	public boolean updateSalary(int id,double amount) {
		Employee e=searchEmployee(id);
		if(e!=null) {
			e.setSalary(e.getSalary()+amount);
			System.out.println("salary updated");
			return true;
		}
		else {
			System.out.println("unable to update,check your employee id");
			return false;
		}
	}
	/**
	 * this method is used to delete employee details from database.
	 * it deletes the complete employee details is the record is found in database
	 * @param id of the employee to be deleted
	 * @return true-if employee is success
	 *         false-if employee is failed
	 */
	public boolean deleteEmployee(int id) {
		boolean isDeleted=false;
		for(int i=0;i<emparr.length;i++) {
			if(emparr[i]!=null&&emparr[i].getId()==id) {
				System.out.println("employee found in database and deleted");
				emparr[i]=null;
				isDeleted=true;
				empcount--;
			}
		}
		if(isDeleted==false) {
			System.out.println("employee is not found in database");
		}
		return isDeleted;
	  }
 }
