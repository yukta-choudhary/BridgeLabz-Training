package com.encapsulation.employeemanagementsystem;

//Part-time employee class
public class PartTimeEmployee extends Employee implements Department {

 private int workHours;
 private String department;

 // Constructor
 public PartTimeEmployee(int id, String name, double hourlyRate, int workHours) {
     super(id, name, hourlyRate);
     this.workHours = workHours;
 }

 // Salary based on work hours
 @Override
 public double calculateSalary() {
     return getBaseSalary() * workHours;
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
