package com.jspiders;

public class EMSAPP {
	public static void main(String[] args) {
		System.out.println("---------------------------------");
		EmployeeCreation ec=new EmployeeCreation();
		Employee e1=ec.CreateEmployee("ramesh",50000.00, 3, "SSE","jspiders");
		Employee e2=ec.CreateEmployee("suresh",25000.00, 2, "SE","jspiders");
		Employee e3=ec.CreateEmployee("jaggesh",30000.00, 2.5, "SE","jspiders");
		Employee e4=ec.CreateEmployee("umesh",40000.00, 3, "SSE","jspiders");
		Employee e5=ec.CreateEmployee("ramesh",20000.00, 3, "ASE","jspiders");

		//creating employee database of capacity 10
		EmployeeDB eDB=new EmployeeDB(10);
		
		//storing employee in database
		eDB.addEmployee(e1);
		eDB.addEmployee(e2);
		eDB.addEmployee(e3);
		eDB.addEmployee(e4);
		eDB.addEmployee(e5);
		
		System.out.println("Total Employee:"+eDB.getEmployeeCount());
		
		eDB.viewFullDatabase();
		
		System.out.println();
		Employee e=eDB.searchEmployee(1005);
		System.out.println(e.getId()+""+e.getName());
		eDB.updateSalary(1003,5000.00);
		eDB.viewFullDatabase();
		eDB.deleteEmployee(1003);
		eDB.viewFullDatabase();
		System.out.println("Total Employee: "+eDB.getEmployeeCount());
		
		
		System.out.println("----------------------------------");
	}

}
