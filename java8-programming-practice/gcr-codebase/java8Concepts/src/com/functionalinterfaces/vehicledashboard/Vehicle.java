package com.functionalinterfaces.vehicledashboard;

public interface Vehicle {

    void displaySpeed();

    default void displayBattery() {
        System.out.println("Battery info not available for this vehicle.");
    }
}
