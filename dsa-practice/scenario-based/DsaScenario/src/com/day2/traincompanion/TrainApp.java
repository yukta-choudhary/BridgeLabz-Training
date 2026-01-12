package com.day2.traincompanion;

/*
TrainCompanion – Compartment Navigation System
Main class
*/

import java.util.Scanner;

class TrainApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        TrainRoute route = new TrainRoute();

        System.out.print("Enter number of compartments: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter compartment name: ");
            route.addCompartment(sc.nextLine());
        }

        System.out.println("\nForward Traversal:");
        route.forward();

        System.out.println("\nBackward Traversal:");
        route.backward();

        System.out.print("\nEnter compartment to remove: ");
        route.removeCompartment(sc.nextLine());

        System.out.println("\nUpdated Forward Traversal:");
        route.forward();

        System.out.print("\nEnter compartment to check adjacent: ");
        route.showAdjacent(sc.nextLine());

        sc.close();
    }
}

