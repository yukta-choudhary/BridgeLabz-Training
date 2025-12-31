package com.inheritance.school;

import java.util.Scanner;

/*
Main class to test hierarchical inheritance
*/

public class Main {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Teacher object
        Teacher teacher = new Teacher();
        System.out.print("Enter Teacher Name: ");
        teacher.name = input.nextLine();
        System.out.print("Enter Teacher Age: ");
        teacher.age = input.nextInt();
        input.nextLine();
        System.out.print("Enter Subject: ");
        teacher.subject = input.nextLine();

        teacher.displayRole();

        // Student object
        Student student = new Student();
        System.out.print("\nEnter Student Grade: ");
        student.grade = input.nextInt();

        student.displayRole();

        // Staff object
        Staff staff = new Staff();
        input.nextLine();
        System.out.print("\nEnter Staff Department: ");
        staff.department = input.nextLine();

        staff.displayRole();
    }
}
