package com.constructor;

public class CourseMain {

    public static void main(String[] args) {

        // Create course objects
        Course c1 = new Course("Java Full Stack", 6, 45000);
        Course c2 = new Course("Python Programming", 4, 30000);

        // Display course details before update
        System.out.println("Course Details Before Institute Update:");
        c1.displayCourseDetails();
        System.out.println();
        c2.displayCourseDetails();

        System.out.println();

        // Update institute name
        Course.updateInstituteName("BridgeLabz Solutions");

        // Display course details after update
        System.out.println("Course Details After Institute Update:");
        c1.displayCourseDetails();
        System.out.println();
        c2.displayCourseDetails();
    }
}
