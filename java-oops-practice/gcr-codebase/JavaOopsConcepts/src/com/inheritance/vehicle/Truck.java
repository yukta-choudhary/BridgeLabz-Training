package com.inheritance.vehicle;

public class Truck extends Vehicle {

    int loadCapacity;

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Load Capacity: " + loadCapacity);
    }
}
