package com.inheritance.onlineretail;

/*
Base class: Order
Contains common order details
*/

public class Order {

    int orderId;
    String orderDate;

    // Method to return order status
    String getOrderStatus() {
        return "Order Placed";
    }
}
