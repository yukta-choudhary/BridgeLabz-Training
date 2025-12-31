package com.inheritance.employeemanagementsystem;

public class Developer extends Employee {

    String programmingLanguage;

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Language: " + programmingLanguage);
    }
}
