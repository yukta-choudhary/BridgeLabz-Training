package com.functionalinterfaces.vehicledashboard;

public class DashboardMain {

    public static void main(String[] args) {

        Vehicle car = new Car();
        Vehicle bike = new Bike();
        Vehicle eCar = new ElectricCar();

        car.displaySpeed();
        car.displayBattery();

        bike.displaySpeed();
        bike.displayBattery();

        eCar.displaySpeed();
        eCar.displayBattery();
    }
}
