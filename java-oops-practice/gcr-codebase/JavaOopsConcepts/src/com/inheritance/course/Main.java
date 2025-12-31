package com.inheritance.course;

import java.util.Scanner;

/*
Main class to test multilevel inheritance
*/

public class Main {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Create PaidOnlineCourse object
        PaidOnlineCourse course = new PaidOnlineCourse();

        // Take input from user
        System.out.print("Enter Course Name: ");
        course.courseName = input.nextLine();

        System.out.print("Enter Duration (hours): ");
        course.duration = input.nextInt();
        input.nextLine(); // clear buffer

        System.out.print("Enter Platform: ");
        course.platform = input.nextLine();

        System.out.print("Is course recorded (true/false): ");
        course.isRecorded = input.nextBoolean();

        System.out.print("Enter Course Fee: ");
        course.fee = input.nextDouble();

        System.out.print("Enter Discount (%): ");
        course.discount = input.nextDouble();

        // Display course details
        System.out.println("\nCourse Details");
        course.displayInfo();
    }
}
