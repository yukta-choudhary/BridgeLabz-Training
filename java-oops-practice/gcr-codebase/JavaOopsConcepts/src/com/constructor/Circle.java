package com.constructor;

public class Circle {

    // Attribute
    private double radius;

    // Default Constructor
    public Circle() {
        this(1.0);   // Constructor chaining
    }

    // Parameterized Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method to display radius
    public void display() {
        System.out.println("Circle Radius: " + radius);
    }
}
