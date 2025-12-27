package com.constructor;

public class CarRentalMain {


    public static void main(String[] args) {

        // Rental using default constructor
        CarRental r1 = new CarRental();
        System.out.println("Default Rental Details:");
        r1.display();

        System.out.println();

        // Rental using parameterized constructor
        CarRental r2 = new CarRental("Yukta", "Swift", 3);
        System.out.println("Parameterized Rental Details:");
        r2.display();
    }

}
