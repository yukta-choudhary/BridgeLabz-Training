package com.day3.campusconnectprogram;

import java.util.*;

//Course class
public class Course {

 private String courseName;
 private Faculty faculty;
 private List<Student> students;

 // Constructor
 public Course(String courseName, Faculty faculty) {
     this.courseName = courseName;
     this.faculty = faculty;
     this.students = new ArrayList<>();
 }

 // Add student to course
 public void addStudent(Student s) {
     students.add(s);
 }

 // Show course details
 public void showCourseDetails() {
     System.out.println("Course Name: " + courseName);
     faculty.printDetails();
     System.out.println("Total Students: " + students.size());
 }
}

