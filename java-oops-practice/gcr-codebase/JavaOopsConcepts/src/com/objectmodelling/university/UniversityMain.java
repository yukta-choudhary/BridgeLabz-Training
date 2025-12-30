package com.objectmodelling.university;

public class UniversityMain {

    public static void main(String[] args) {

        // Faculty exists independently
        Faculty f1 = new Faculty("Dr. Sharma");
        Faculty f2 = new Faculty("Dr. Mehta");

        // Create University
        University uni = new University("ABC University");

        // Create Departments (composition)
        Department d1 = new Department("Computer Science");
        Department d2 = new Department("Electronics");

        // Add departments to university
        uni.addDepartment(d1);
        uni.addDepartment(d2);

        // Add faculty to university
        uni.addFaculty(f1);
        uni.addFaculty(f2);

        // Show university data
        uni.showUniversity();

        // Delete university
        uni.deleteUniversity();

        // Faculty still exists
        System.out.println("\nFaculty still exists:");
        f1.showFaculty();
    }
}
