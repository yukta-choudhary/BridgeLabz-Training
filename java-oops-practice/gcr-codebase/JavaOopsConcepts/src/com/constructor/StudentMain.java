package com.constructor;

public class StudentMain {

    public static void main(String[] args) {

        // Create PostgraduateStudent object
        PostgraduateStudent pg = new PostgraduateStudent(101, "Yukta", 8.7);

        // Display details
        pg.displayPostgraduateDetails();

        System.out.println();

        // Modify CGPA using public method
        pg.setCgpa(9.1);

        // Display updated details
        System.out.println("After CGPA Update:");
        pg.displayPostgraduateDetails();
    }

}
