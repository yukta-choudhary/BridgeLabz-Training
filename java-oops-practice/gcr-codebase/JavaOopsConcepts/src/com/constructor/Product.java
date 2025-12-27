package com.constructor;

public class Product {

    // Instance Variables
    private String productName;
    private double price;

    // Class Variable (shared)
    private static int totalProducts = 0;

    // Parameterized Constructor
    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;   // increase count when object is created
    }

    // Instance Method
    public void displayProductDetails() {
        System.out.println("Product Name : " + productName);
        System.out.println("Product Price: " + price);
    }

    // Class Method
    public static void displayTotalProducts() {
        System.out.println("Total Products Created: " + totalProducts);
    }
}
