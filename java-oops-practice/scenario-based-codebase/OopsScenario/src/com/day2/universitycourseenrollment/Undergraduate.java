package com.day2.universitycourseenrollment;

//Undergraduate
public class Undergraduate extends Student implements Graded {

 public Undergraduate(int id, String name) {
     super(id, name);
 }

 @Override
 public void assignGrade(double marks) {
     double gradePoint = marks / 10;   // letter grading logic
     setGpa(gradePoint);
 }
}
