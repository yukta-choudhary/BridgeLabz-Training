package com.inheritance.onlineretail;

/*
Subclass: DeliveredOrder
Inherits ShippedOrder
*/

public class DeliveredOrder extends ShippedOrder {

    String deliveryDate;

    // Override order status
    @Override
    String getOrderStatus() {
        return "Order Delivered";
    }
}
