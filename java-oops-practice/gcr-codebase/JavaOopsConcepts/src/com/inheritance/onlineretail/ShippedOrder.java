package com.inheritance.onlineretail;

/*
Subclass: ShippedOrder
Inherits Order
*/

public class ShippedOrder extends Order {

    String trackingNumber;

    // Override order status
    @Override
    String getOrderStatus() {
        return "Order Shipped";
    }
}
