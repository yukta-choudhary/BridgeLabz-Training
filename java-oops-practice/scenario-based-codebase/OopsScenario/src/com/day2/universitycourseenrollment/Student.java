package com.day2.universitycourseenrollment;

//Student
public class Student {
 protected int studentId;
 protected String name;
 private double gpa;   // private GPA (secure)

 // Constructor without elective
 public Student(int studentId, String name) {
     this.studentId = studentId;
     this.name = name;
     this.gpa = 0.0;
 }

 // Constructor with elective preference
 public Student(int studentId, String name, String elective) {
     this.studentId = studentId;
     this.name = name + " (Elective: " + elective + ")";
     this.gpa = 0.0;
 }

 // Setter for GPA
 public void setGpa(double gpa) {
     this.gpa = gpa;
 }

 // Public method to view transcript
 public void getTranscript() {
     System.out.println("Student: " + name + ", GPA: " + gpa);
 }
}
