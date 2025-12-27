package com.constructor;

public class Student {

    // Public variable
    public int rollNumber;

    // Protected variable
    protected String name;

    // Private variable
    private double cgpa;

    // Parameterized Constructor
    public Student(int rollNumber, String name, double cgpa) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.cgpa = cgpa;
    }

    // Public method to get CGPA
    public double getCgpa() {
        return cgpa;
    }

    // Public method to set CGPA
    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }
}

// Subclass to demonstrate protected access
class PostgraduateStudent extends Student {

    // Constructor
    public PostgraduateStudent(int rollNumber, String name, double cgpa) {
        super(rollNumber, name, cgpa);
    }

    // Method to access protected member
    public void displayPostgraduateDetails() {
        System.out.println("Roll Number : " + rollNumber); // public
        System.out.println("Name        : " + name);       // protected
        System.out.println("CGPA        : " + getCgpa());  // private via getter
    }
}
