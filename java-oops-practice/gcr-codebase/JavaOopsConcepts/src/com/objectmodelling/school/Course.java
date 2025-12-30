package com.objectmodelling.school;

import java.util.ArrayList;

public class Course {

    // Course name
    private String courseName;

    // List of students enrolled
    private ArrayList<Student> students;

    // Constructor
    public Course(String courseName) {
        this.courseName = courseName;
        students = new ArrayList<>();
    }

    // Add student to course
    public void addStudent(Student s) {
        students.add(s);
    }

    // Show students in course
    public void showStudents() {
        System.out.println("Course: " + courseName);
        for (Student s : students) {
            System.out.println("- " + s.getName());
        }
    }

    // Getter
    public String getCourseName() {
        return courseName;
    }
}
