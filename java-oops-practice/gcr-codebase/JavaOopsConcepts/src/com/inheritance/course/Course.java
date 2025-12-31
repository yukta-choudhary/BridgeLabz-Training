package com.inheritance.course;

/*
Base class: Course
Stores basic course details
*/

public class Course {

    String courseName;
    int duration; // in hours

    void displayInfo() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " hours");
    }
}
