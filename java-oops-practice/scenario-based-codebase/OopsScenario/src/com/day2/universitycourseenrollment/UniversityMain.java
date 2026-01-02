package com.day2.universitycourseenrollment;

//UniversityMain
public class UniversityMain {
 public static void main(String[] args) {

     Undergraduate ug = new Undergraduate(1, "Ravi");
     Postgraduate pg = new Postgraduate(2, "Neha");

     Course c1 = new Course(101, "Data Structures");

     Faculty f1 = new Faculty(201, "Dr. Mehta");

     f1.assignGrade(ug, 78);   // letter grading
     f1.assignGrade(pg, 45);   // pass/fail grading

     ug.getTranscript();
     pg.getTranscript();
 }
}

