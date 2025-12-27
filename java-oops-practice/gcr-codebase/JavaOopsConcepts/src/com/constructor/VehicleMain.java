package com.constructor;

public class VehicleMain {

    public static void main(String[] args) {

        // Create vehicle objects
        Vehicle v1 = new Vehicle("Yukta", "Car");
        Vehicle v2 = new Vehicle("Amit", "Bike");

        // Display details before fee update
        System.out.println("Vehicle Details Before Fee Update:");
        v1.displayVehicleDetails();
        System.out.println();
        v2.displayVehicleDetails();

        System.out.println();

        // Update registration fee
        Vehicle.updateRegistrationFee(2000);

        // Display details after fee update
        System.out.println("Vehicle Details After Fee Update:");
        v1.displayVehicleDetails();
        System.out.println();
        v2.displayVehicleDetails();
    }
}
