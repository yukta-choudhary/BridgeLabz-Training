package com.objectmodelling.school;

public class SchoolMain {

    public static void main(String[] args) {

        // Create school
        School school = new School("Green Valley School");

        // Create students
        Student s1 = new Student("Rohan");
        Student s2 = new Student("Neha");

        // Create courses
        Course c1 = new Course("Maths");
        Course c2 = new Course("Science");

        // Add students to school (aggregation)
        school.addStudent(s1);
        school.addStudent(s2);

        // Enroll students in courses (association)
        s1.enrollCourse(c1);
        s1.enrollCourse(c2);

        s2.enrollCourse(c1);

        // Display data
        System.out.println();
        s1.viewCourses();

        System.out.println();
        c1.showStudents();
    }
}
