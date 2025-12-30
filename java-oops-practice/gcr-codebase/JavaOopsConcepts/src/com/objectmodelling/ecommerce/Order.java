package com.objectmodelling.ecommerce;

import java.util.ArrayList;

public class Order {

    // Order id
    private int orderId;

    // Products in order
    private ArrayList<Product> products;

    // Constructor
    public Order(int orderId) {
        this.orderId = orderId;
        products = new ArrayList<>();
    }

    // Add product to order
    public void addProduct(Product product) {
        products.add(product);
        System.out.println(product.getName() + " added to order");
    }

    // Show order details
    public void showOrder() {
        System.out.println("\nOrder ID: " + orderId);
        double total = 0;

        for (Product p : products) {
            System.out.println("- " + p.getName() + " : ₹" + p.getPrice());
            total += p.getPrice();
        }

        System.out.println("Total Amount: ₹" + total);
    }
}
