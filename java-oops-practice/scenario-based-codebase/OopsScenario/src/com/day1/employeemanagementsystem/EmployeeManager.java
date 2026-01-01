package com.day1.employeemanagementsystem;

import java.util.ArrayList;

//EmployeeManager manages employee list
public class EmployeeManager {
	
	 // ArrayList to store employees
	 ArrayList<Employee> empList = new ArrayList<Employee>();
	
	 // Add employee
	 void addEmployee(Employee e) {
	     empList.add(e);
	     System.out.println("Employee added");
	 }
	
	 // Display all employees
	 void showAllEmployees() {
	     for (Employee e : empList) {
	         e.showDetails();
	     }
	 }
}
