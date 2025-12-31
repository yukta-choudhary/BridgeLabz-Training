package com.inheritance.school;

/*
Superclass: Person
Stores common details
*/

public class Person {

    String name;
    int age;

    // Method to be overridden
    void displayRole() {
        System.out.println("Person in school");
    }
}
