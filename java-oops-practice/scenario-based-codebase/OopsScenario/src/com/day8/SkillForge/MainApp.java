package com.day8.SkillForge;

import java.util.Scanner;

//Main class
public class MainApp
{
 public static void main(String[] args)
 {
     Scanner sc = new Scanner(System.in);

     System.out.print("Enter student name: ");
     String sname = sc.nextLine();

     Student student = new Student(sname, "student@mail.com");

     String[] modules = {"Java Basics", "OOPS", "Mini Project"};

     Course course = new Course("Java Full Stack", "Anita", modules);

     int completedModules = 2;
     int totalModules = modules.length;

     double progress = (completedModules * 100) / totalModules; // Operator usage

     System.out.println("Progress: " + progress + "%");
     System.out.println("Course Rating: " + course.getRating());

     course.generateCertificate();
 }
}

