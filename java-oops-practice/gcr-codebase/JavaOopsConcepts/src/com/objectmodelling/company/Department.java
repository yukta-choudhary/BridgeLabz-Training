package com.objectmodelling.company;

import java.util.ArrayList;

//Department class
public class Department {

	 // Department name
	 private String deptName;
	
	 // Composition: Department has Employees
	 private ArrayList<Employee> employees;
	
	 // Constructor
	 public Department(String deptName) {
	     this.deptName = deptName;
	     employees = new ArrayList<>();
	 }
	
	 // Add employee
	 public void addEmployee(String empName) {
	     Employee emp = new Employee(empName);
	     employees.add(emp);
	 }
	
	 // Show employees
	 public void showEmployees() {
	     System.out.println("Department: " + deptName);
	     for (Employee e : employees) {
	         e.showEmployee();
	     }
	 }
	
	 // Delete all employees
	 public void removeAllEmployees() {
	     employees.clear();
	 }
}
