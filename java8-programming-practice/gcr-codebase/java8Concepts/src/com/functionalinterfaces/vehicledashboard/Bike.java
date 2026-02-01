package com.functionalinterfaces.vehicledashboard;

public class Bike implements Vehicle {

    @Override
    public void displaySpeed() {
        System.out.println("Bike speed: 60 km/h");
    }
}
