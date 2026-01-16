package com.generics.universitycoursemanagementsystem;
//Exam based course

class ExamCourse extends CourseType {

 ExamCourse(String courseName) {
     super(courseName);
 }

 // Override method
 void evaluate() {
     System.out.println(courseName + " evaluated by exams");
 }
}
