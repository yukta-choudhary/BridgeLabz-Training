package com.inheritance.employeemanagementsystem;

public class Manager extends Employee {

    int teamSize;

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Team Size: " + teamSize);
    }
}
