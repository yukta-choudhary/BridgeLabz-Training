package com.inheritance.employeemanagementsystem;

public class Intern extends Employee {

    int durationMonths;

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Internship Duration: " + durationMonths + " months");
    }
}
