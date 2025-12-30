package com.objectmodelling.school;

import java.util.ArrayList;

public class School {

    // School name
    private String schoolName;

    // Aggregation: School has students
    private ArrayList<Student> students;

    // Constructor
    public School(String schoolName) {
        this.schoolName = schoolName;
        students = new ArrayList<>();
    }

    // Add student to school
    public void addStudent(Student s) {
        students.add(s);
    }

    // Show all students
    public void showStudents() {
        System.out.println("School: " + schoolName);
        for (Student s : students) {
            System.out.println("- " + s.getName());
        }
    }
}
