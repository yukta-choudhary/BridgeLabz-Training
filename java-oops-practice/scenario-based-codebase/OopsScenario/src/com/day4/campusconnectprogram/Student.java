package com.day4.campusconnectprogram;

//Student class
public class Student extends Person implements ICourseActions {

 private int[] grades;   // private grades
 private double gpa;

 // Constructor
 public Student(int id, String name, String email, int[] grades) {
     super(id, name, email);
     this.grades = grades;
     calculateGPA();
 }

 // Calculate GPA using operators
 private void calculateGPA() {
     int sum = 0;

     for (int g : grades) {
         sum = sum + g;   // + operator
     }

     gpa = sum / (double) grades.length;
 }

 // Interface methods
 public void enrollCourse(String courseName) {
     System.out.println(name + " enrolled in " + courseName);
 }

 public void dropCourse(String courseName) {
     System.out.println(name + " dropped " + courseName);
 }

 // Polymorphism
 @Override
 public void printDetails() {
     System.out.println("Student ID: " + id);
     System.out.println("Name: " + name);
     System.out.println("Email: " + email);
     System.out.println("GPA: " + gpa);
 }
}

