package com.generics.universitycoursemanagementsystem;


abstract class CourseType {
 String courseName;

 // Constructor
 CourseType(String courseName) {
     this.courseName = courseName;
 }

 // Abstract method
 abstract void evaluate();
}

