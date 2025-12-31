package com.inheritance.school;

/*
Subclass: Staff
*/

public class Staff extends Person {

    String department;

    @Override
    void displayRole() {
        System.out.println("Role: Staff");
        System.out.println("Department: " + department);
    }
}
