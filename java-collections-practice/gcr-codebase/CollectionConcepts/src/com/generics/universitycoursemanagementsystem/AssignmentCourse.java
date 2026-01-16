package com.generics.universitycoursemanagementsystem;


class AssignmentCourse extends CourseType {

 AssignmentCourse(String courseName) {
     super(courseName);
 }

 // Override method
 void evaluate() {
     System.out.println(courseName + " evaluated by assignments");
 }
}
