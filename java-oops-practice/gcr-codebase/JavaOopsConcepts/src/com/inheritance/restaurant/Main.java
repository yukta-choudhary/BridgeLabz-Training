package com.inheritance.restaurant;

import java.util.Scanner;

/*
Main class to test hybrid inheritance
*/

public class Main {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Chef object
        Chef chef = new Chef();
        System.out.print("Enter Chef Name: ");
        chef.name = input.nextLine();
        System.out.print("Enter Chef ID: ");
        chef.id = input.nextInt();

        // Waiter object
        input.nextLine();
        Waiter waiter = new Waiter();
        System.out.print("\nEnter Waiter Name: ");
        waiter.name = input.nextLine();
        System.out.print("Enter Waiter ID: ");
        waiter.id = input.nextInt();

        // Perform duties
        System.out.println();
        chef.performDuties();
        waiter.performDuties();
    }
}
