package com.objectmodelling.university;
public class Department {

    // Department name
    private String deptName;

    // Constructor
    public Department(String deptName) {
        this.deptName = deptName;
    }

    // Display department
    public void showDepartment() {
        System.out.println("Department: " + deptName);
    }
}
