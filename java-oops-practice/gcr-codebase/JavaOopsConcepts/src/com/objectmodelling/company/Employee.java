package com.objectmodelling.company;

public class Employee {

	 // Attributes
	 private String name;
	
	 // Constructor
	 public Employee(String name) {
	     this.name = name;
	 }
	
	 // Display employee name
	 public void showEmployee() {
	     System.out.println("Employee: " + name);
	 }
}
