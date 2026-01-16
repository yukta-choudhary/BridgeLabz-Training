package com.generics.universitycoursemanagementsystem;
//Generic Course class
//T must extend CourseType

class Course<T extends CourseType> {

 T course;

 // Constructor
 Course(T course) {
     this.course = course;
 }

 // Display course details
 void showCourse() {
     course.evaluate();
 }
}

