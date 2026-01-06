package com.day5.edumentor;

//Learner class
public class Learner extends User implements ICertifiable {

 String courseType; // short or full-time

 // Constructor
 Learner(String name, String email, int userId, String courseType) {
     super(name, email, userId);
     this.courseType = courseType;
 }

 // Polymorphism
 public void generateCertificate() {
     if (courseType.equals("short")) {
         System.out.println("Short Course Certificate Generated");
     } else {
         System.out.println("Full-Time Course Certificate Generated");
     }
 }
}

