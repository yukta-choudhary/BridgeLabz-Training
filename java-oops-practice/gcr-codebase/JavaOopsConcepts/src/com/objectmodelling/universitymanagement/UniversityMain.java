package com.objectmodelling.universitymanagement;

public class UniversityMain {

    public static void main(String[] args) {

        // Create students
        Student s1 = new Student("Yukta");
        Student s2 = new Student("Rohan");

        // Create professor
        Professor p1 = new Professor("Dr. Mehta");

        // Create course
        Course course = new Course("Java Programming");

        // Assign professor
        course.assignProfessor(p1);

        // Students enroll in course
        s1.enrollCourse(course);
        s2.enrollCourse(course);

        // Display course details
        course.showCourseDetails();
    }
}
