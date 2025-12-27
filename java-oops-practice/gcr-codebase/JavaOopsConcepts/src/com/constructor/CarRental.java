package com.constructor;

public class CarRental {

    // Attributes
    private String customerName;
    private String carModel;
    private int rentalDays;
    private double totalCost;

    // Default Constructor
    public CarRental() {
        customerName = "Not Assigned";
        carModel = "Standard";
        rentalDays = 1;
        calculateTotalCost();
    }

    // Parameterized Constructor
    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        calculateTotalCost();
    }

    // Method to calculate total cost
    private void calculateTotalCost() {
        double costPerDay = 1000;   // fixed rental cost per day
        totalCost = rentalDays * costPerDay;
    }

    // Method to display rental details
    public void display() {
        System.out.println("Customer Name : " + customerName);
        System.out.println("Car Model     : " + carModel);
        System.out.println("Rental Days   : " + rentalDays);
        System.out.println("Total Cost    : " + totalCost);
    }
}
