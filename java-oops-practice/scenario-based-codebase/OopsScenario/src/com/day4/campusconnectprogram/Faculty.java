package com.day4.campusconnectprogram;

//Faculty class
public class Faculty extends Person {

 private String department;

 // Constructor
 public Faculty(int id, String name, String email, String department) {
     super(id, name, email);
     this.department = department;
 }

 // Polymorphism
 @Override
 public void printDetails() {
     System.out.println("Faculty ID: " + id);
     System.out.println("Name: " + name);
     System.out.println("Email: " + email);
     System.out.println("Department: " + department);
 }
}
