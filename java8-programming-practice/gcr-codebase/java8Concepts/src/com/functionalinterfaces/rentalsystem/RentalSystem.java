package com.functionalinterfaces.rentalsystem;

public class RentalSystem {
    public static void main(String[] args) {

        IRental v1 = new Cars();
        IRental v2 = new Bikes();
        IRental v3 = new Buses();

        v1.rent();
        v2.rent();
        v3.rent();

        System.out.println("---- Returning Vehicles ----");

        v1.returnVehicle();
        v2.returnVehicle();
        v3.returnVehicle();
    }
}
