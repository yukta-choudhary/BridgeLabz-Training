package com.objectmodelling.university;

import java.util.ArrayList;

public class University {

    // University name
    private String uniName;

    // Composition: Departments
    private ArrayList<Department> departments;

    // Aggregation: Faculties
    private ArrayList<Faculty> faculties;

    // Constructor
    public University(String uniName) {
        this.uniName = uniName;
        departments = new ArrayList<>();
        faculties = new ArrayList<>();
    }

    // Add department (composition)
    public void addDepartment(Department d) {
        departments.add(d);
    }

    // Add faculty (aggregation)
    public void addFaculty(Faculty f) {
        faculties.add(f);
    }

    // Show university details
    public void showUniversity() {
        System.out.println("University: " + uniName);

        System.out.println("\nDepartments:");
        for (Department d : departments) {
            d.showDepartment();
        }

        System.out.println("\nFaculties:");
        for (Faculty f : faculties) {
            System.out.println("- " + f.getName());
        }
    }

    // Simulate deletion of University
    public void deleteUniversity() {
        departments.clear(); // departments destroyed
        System.out.println("\nUniversity deleted. Departments removed.");
    }
}
