package com.objectmodelling.universitymanagement;

public class Student {

    // Student name
    private String name;

    // Constructor
    public Student(String name) {
        this.name = name;
    }

    // Student enrolls in a course
    public void enrollCourse(Course course) {
        course.addStudent(this);
        System.out.println(name + " enrolled in " + course.getCourseName());
    }

    // Getter
    public String getName() {
        return name;
    }
}
