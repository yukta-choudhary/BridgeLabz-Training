package com.encapsulation.employeemanagementsystem;

//Full-time employee class
public class FullTimeEmployee extends Employee implements Department {
	
	 private String department;
	
	 // Constructor
	 public FullTimeEmployee(int id, String name, double baseSalary) {
	     super(id, name, baseSalary);
	 }
	
	 // Salary is fixed for full-time employee
	 @Override
	 public double calculateSalary() {
	     return getBaseSalary();
	 }
	
	 // Department methods
	 @Override
	 public void assignDepartment(String deptName) {
	     this.department = deptName;
	 }
	
	 @Override
	 public String getDepartmentDetails() {
	     return department;
	 }
}

