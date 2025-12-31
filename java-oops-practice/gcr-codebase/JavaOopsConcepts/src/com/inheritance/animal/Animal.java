package com.inheritance.animal;

/*
Superclass: Animal
Contains common properties and method
*/

public class Animal {

    String name;
    int age;

    // Method to be overridden
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}
