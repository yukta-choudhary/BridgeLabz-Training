package com.inheritance.school;

/*
Subclass: Teacher
*/

public class Teacher extends Person {

    String subject;

    @Override
    void displayRole() {
        System.out.println("Role: Teacher");
        System.out.println("Subject: " + subject);
    }
}
