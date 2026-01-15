package com.day3.parceltracker;

import java.util.Scanner;

public class ParcelTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Parcel ID: ");
        String id = sc.nextLine();
        Parcel parcel = new Parcel(id);

        // Add default stages
        parcel.addStage("Packed");
        parcel.addStage("Shipped");
        parcel.addStage("In Transit");
        parcel.addStage("Delivered");

        while (true) {
            System.out.println("\n1. Track Parcel");
            System.out.println("2. Add Custom Checkpoint");
            System.out.println("3. Exit");
            System.out.print("Choose option: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            if (choice == 1) {
                parcel.trackParcel();
            } else if (choice == 2) {
                System.out.print("Enter previous stage after which to add checkpoint: ");
                String prev = sc.nextLine();
                System.out.print("Enter new checkpoint name: ");
                String newStage = sc.nextLine();
                parcel.addStageAfter(prev, newStage);
            } else if (choice == 3) {
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Invalid choice!");
            }
        }

        sc.close();
    }
}
