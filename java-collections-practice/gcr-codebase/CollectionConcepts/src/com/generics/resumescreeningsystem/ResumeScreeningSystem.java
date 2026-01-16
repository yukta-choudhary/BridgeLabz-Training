package com.generics.resumescreeningsystem;

import java.util.ArrayList;
import java.util.Scanner;

// Question: AI-Driven Resume Screening System using Generics

public class ResumeScreeningSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<JobRole> roleList = new ArrayList<>();

        System.out.println("Choose Job Role:");
        System.out.println("1. Software Engineer");
        System.out.println("2. Data Scientist");
        System.out.println("3. Product Manager");

        int choice = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Candidate Name: ");
        String name = sc.nextLine();

        // Create role based on choice
        if (choice == 1) {
            roleList.add(new SoftwareEngineer(name));
        } else if (choice == 2) {
            roleList.add(new DataScientist(name));
        } else if (choice == 3) {
            roleList.add(new ProductManager(name));
        } else {
            System.out.println("Invalid choice");
        }

        System.out.println("\n--- Resume Screening ---");

        // Wildcard screening
        ResumeUtility.screeningPipeline(roleList);

        sc.close();
    }
}

