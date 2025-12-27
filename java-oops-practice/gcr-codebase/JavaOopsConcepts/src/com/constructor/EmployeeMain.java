package com.constructor;

public class EmployeeMain {

    public static void main(String[] args) {

        // Create Manager object
        Manager mgr = new Manager(501, "IT", 60000);

        // Display manager details
        mgr.displayManagerDetails();

        System.out.println();

        // Modify salary using public method
        mgr.setSalary(70000);

        // Display updated details
        System.out.println("After Salary Update:");
        mgr.displayManagerDetails();
    }
}
