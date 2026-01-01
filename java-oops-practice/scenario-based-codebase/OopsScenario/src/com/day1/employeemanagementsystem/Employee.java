package com.day1.employeemanagementsystem;

//Employee class represents one employee
public class Employee {

	 private int empId;
	 private String name;
	 private double salary;
	
	 // Constructor
	 Employee(int id, String name, double salary) {
	     this.empId = id;
	     this.name = name;
	     this.salary = salary;
	 }
	
	 // Display employee details
	 public void showDetails() {
	     System.out.println("Employee ID: " + empId);
	     System.out.println("Name: " + name);
	     System.out.println("Salary: " + salary);
	     System.out.println("--------------------");
	 }
}
