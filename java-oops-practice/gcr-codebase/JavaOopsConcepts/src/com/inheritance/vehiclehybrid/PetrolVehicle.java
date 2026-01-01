package com.inheritance.vehiclehybrid;

/*
PetrolVehicle class
Extends Vehicle and implements Refuelable
*/

public class PetrolVehicle extends Vehicle implements Refuelable {

    // Implement refuel method
    public void refuel() {
        System.out.println("Petrol vehicle is refueling");
    }
}
