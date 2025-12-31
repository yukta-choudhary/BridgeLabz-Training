package com.inheritance.vehicle;

public class Car extends Vehicle {

    int seatCapacity;

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Seats: " + seatCapacity);
    }
}
