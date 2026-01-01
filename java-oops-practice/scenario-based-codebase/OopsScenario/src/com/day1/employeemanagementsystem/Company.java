package com.day1.employeemanagementsystem;

//Main class
public class Company {
	
	 public static void main(String[] args) {
	
	     // Create manager
	     EmployeeManager manager = new EmployeeManager();
	
	     // Create employees
	     Employee e1 = new Employee(101, "Amit", 30000);
	     Employee e2 = new Employee(102, "Neha", 35000);
	
	     // Add employees
	     manager.addEmployee(e1);
	     manager.addEmployee(e2);
	
	     // Display employees
	     manager.showAllEmployees();
	 }
}

