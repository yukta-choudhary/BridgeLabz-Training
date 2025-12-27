package com.constructor;

public class Person {

    // Attributes
    private String name;
    private int age;

    // Parameterized Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy Constructor
    public Person(Person p) {
        this.name = p.name;
        this.age = p.age;
    }

    // Method to display person details
    public void display() {
        System.out.println("Person Name: " + name);
        System.out.println("Person Age : " + age);
    }
}
