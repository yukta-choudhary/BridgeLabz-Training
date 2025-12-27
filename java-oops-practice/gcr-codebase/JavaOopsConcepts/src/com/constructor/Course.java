package com.constructor;

public class Course {

    // Instance Variables
    private String courseName;
    private int duration;     // in months
    private double fee;

    // Class Variable (shared by all courses)
    private static String instituteName = "BridgeLabz";

    // Parameterized Constructor
    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance Method
    public void displayCourseDetails() {
        System.out.println("Course Name    : " + courseName);
        System.out.println("Duration       : " + duration + " months");
        System.out.println("Course Fee     : " + fee);
        System.out.println("Institute Name : " + instituteName);
    }

    // Class Method
    public static void updateInstituteName(String name) {
        instituteName = name;
    }
}
