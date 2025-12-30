package com.objectmodelling.ecommerce;

public class Customer {

    // Customer name
    private String name;

    // Constructor
    public Customer(String name) {
        this.name = name;
    }

    // Customer places order
    public void placeOrder(Order order) {
        System.out.println(name + " placed an order");
        order.showOrder();
    }

    // Getter
    public String getName() {
        return name;
    }
}
