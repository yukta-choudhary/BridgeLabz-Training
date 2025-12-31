package com.inheritance.course;

/*
Subclass: OnlineCourse
Extends Course
*/

public class OnlineCourse extends Course {

    String platform;
    boolean isRecorded;

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Platform: " + platform);
        System.out.println("Recorded: " + isRecorded);
    }
}
