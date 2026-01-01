package com.encapsulation.employeemanagementsystem;

//Main class to test polymorphism
public class EmployeeMain {

 public static void main(String[] args) {

     // Polymorphism: Employee reference
     Employee emp1 = new FullTimeEmployee(101, "Amit", 50000);
     Employee emp2 = new PartTimeEmployee(102, "Neha", 500, 40);

     // Assign departments
     ((Department) emp1).assignDepartment("HR");
     ((Department) emp2).assignDepartment("IT");

     // Store employees in array
     Employee[] employees = { emp1, emp2 };

     // Process all employees using Employee reference
     for (Employee emp : employees) {
         emp.displayDetails();
         System.out.println("Department: " +
                 ((Department) emp).getDepartmentDetails());
         System.out.println("--------------------");
     }
 }
}
