package com.inheritance.school;

/*
Subclass: Student
*/

public class Student extends Person {

    int grade;

    @Override
    void displayRole() {
        System.out.println("Role: Student");
        System.out.println("Grade: " + grade);
    }
}
