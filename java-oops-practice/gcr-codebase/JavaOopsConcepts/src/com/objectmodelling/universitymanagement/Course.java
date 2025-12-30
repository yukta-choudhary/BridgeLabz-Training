package com.objectmodelling.universitymanagement;

import java.util.ArrayList;

public class Course {

    // Course name
    private String courseName;

    // Professor teaching the course
    private Professor professor;

    // Students enrolled in course
    private ArrayList<Student> students;

    // Constructor
    public Course(String courseName) {
        this.courseName = courseName;
        students = new ArrayList<>();
    }

    // Assign professor to course
    public void assignProfessor(Professor professor) {
        this.professor = professor;
        System.out.println(professor.getName() + " assigned to " + courseName);
    }

    // Add student to course
    public void addStudent(Student student) {
        students.add(student);
    }

    // Show course details
    public void showCourseDetails() {
        System.out.println("\nCourse: " + courseName);
        System.out.println("Professor: " + professor.getName());

        System.out.println("Students Enrolled:");
        for (Student s : students) {
            System.out.println("- " + s.getName());
        }
    }

    // Getter
    public String getCourseName() {
        return courseName;
    }
}
