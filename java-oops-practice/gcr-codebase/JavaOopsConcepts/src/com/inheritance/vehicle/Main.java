package com.inheritance.vehicle;

public class Main {

    public static void main(String[] args) {

        Vehicle[] vehicles = {
            new Car(),
            new Truck(),
            new Motorcycle()
        };

        vehicles[0].displayInfo();
        vehicles[1].displayInfo();
        vehicles[2].displayInfo();
    }
}
