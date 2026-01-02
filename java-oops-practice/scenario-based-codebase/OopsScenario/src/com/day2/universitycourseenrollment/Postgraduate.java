package com.day2.universitycourseenrollment;

//Postgraduate
public class Postgraduate extends Student implements Graded {

 public Postgraduate(int id, String name) {
     super(id, name);
 }

 @Override
 public void assignGrade(double marks) {
     if (marks >= 50) {
         setGpa(4.0);   // pass
     } else {
         setGpa(0.0);   // fail
     }
 }
}
