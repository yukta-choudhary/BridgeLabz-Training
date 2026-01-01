package com.inheritance.vehiclehybrid;

import java.util.Scanner;

/*
Question:
Vehicle Management System using Hybrid Inheritance
*/

public class Main {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Electric Vehicle input
        ElectricVehicle ev = new ElectricVehicle();
        System.out.print("Enter Electric Vehicle Model: ");
        ev.model = input.nextLine();
        System.out.print("Enter Max Speed: ");
        ev.maxSpeed = input.nextInt();

        // Petrol Vehicle input
        input.nextLine(); // clear buffer
        PetrolVehicle pv = new PetrolVehicle();
        System.out.print("\nEnter Petrol Vehicle Model: ");
        pv.model = input.nextLine();
        System.out.print("Enter Max Speed: ");
        pv.maxSpeed = input.nextInt();

        // Display actions
        System.out.println();
        ev.charge();
        pv.refuel();
    }
}
