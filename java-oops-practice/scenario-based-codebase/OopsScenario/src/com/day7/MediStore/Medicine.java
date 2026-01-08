package com.day7.MediStore;

/*
Parent class Medicine
*/

public class Medicine implements ISellable
{
    private double price;     // sensitive data
    private int quantity;     // stock

    String name;
    String expiryDate;

    // Constructor with default quantity
    public Medicine(String name, double price, String expiryDate)
    {
        this.name = name;
        this.price = price;
        this.expiryDate = expiryDate;
        this.quantity = 10;
    }

    // Sell medicine
    public void sell(int qty)
    {
        if (qty <= quantity)
        {
            quantity = quantity - qty;
            System.out.println("Sold " + qty + " units");
            System.out.println("Total Price: " + calculatePrice(qty));
        }
        else
        {
            System.out.println("Not enough stock");
        }
    }

    // Price calculation (private logic)
    private double calculatePrice(int qty)
    {
        double total = price * qty;

        if (total > 500)
            total = total - 50;   // discount

        return total;
    }

    // Default expiry check
    public void checkExpiry()
    {
        System.out.println("Check expiry date");
    }
}
