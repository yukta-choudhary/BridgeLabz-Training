package com.inheritance.vehicle;

public class Motorcycle extends Vehicle {

    boolean hasCarrier;

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Carrier: " + hasCarrier);
    }
}
