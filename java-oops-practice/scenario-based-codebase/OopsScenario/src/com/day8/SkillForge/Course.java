package com.day8.SkillForge;

//Course class
public class Course implements ICertifiable
{
 String title;
 String instructor;
 private double rating;          // Encapsulation
 String[] modules;

 // Constructor with default modules
 public Course(String title, String instructor)
 {
     this.title = title;
     this.instructor = instructor;
     modules = new String[] {"Intro", "Basics", "Advanced"};
     calculateRating();
 }

 // Constructor with custom modules
 public Course(String title, String instructor, String[] modules)
 {
     this.title = title;
     this.instructor = instructor;
     this.modules = modules;
     calculateRating();
 }

 // Protected rating logic
 protected void calculateRating()
 {
     rating = modules.length * 1.5;
 }

 // Read-only access
 public double getRating()
 {
     return rating;
 }

 // Polymorphism logic
 public void generateCertificate()
 {
     if(modules.length > 3)
     {
         System.out.println("Advanced Course Certificate Generated");
     }
     else
     {
         System.out.println("Basic Course Certificate Generated");
     }
 }
}

