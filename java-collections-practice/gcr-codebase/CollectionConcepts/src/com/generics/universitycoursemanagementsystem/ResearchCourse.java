package com.generics.universitycoursemanagementsystem;
//Research based course

class ResearchCourse extends CourseType {

 ResearchCourse(String courseName) {
     super(courseName);
 }

 // Override method
 void evaluate() {
     System.out.println(courseName + " evaluated by research work");
 }
}

