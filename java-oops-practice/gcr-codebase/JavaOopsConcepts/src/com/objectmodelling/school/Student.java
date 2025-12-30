package com.objectmodelling.school;
import java.util.ArrayList;

public class Student {

    // Student name
    private String name;

    // Courses enrolled
    private ArrayList<Course> courses;

    // Constructor
    public Student(String name) {
        this.name = name;
        courses = new ArrayList<>();
    }

    // Enroll in course
    public void enrollCourse(Course c) {
        courses.add(c);
        c.addStudent(this); // association both ways
    }

    // View enrolled courses
    public void viewCourses() {
        System.out.println("Student: " + name);
        for (Course c : courses) {
            System.out.println("- " + c.getCourseName());
        }
    }

    // Getter
    public String getName() {
        return name;
    }
}
