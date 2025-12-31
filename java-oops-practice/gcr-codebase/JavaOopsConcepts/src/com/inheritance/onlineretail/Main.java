package com.inheritance.onlineretail;

import java.util.Scanner;

/*
Main class to test multilevel inheritance
*/

public class Main {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Create DeliveredOrder object
        DeliveredOrder order = new DeliveredOrder();

        // Take input from user
        System.out.print("Enter Order ID: ");
        order.orderId = input.nextInt();
        input.nextLine(); // clear buffer

        System.out.print("Enter Order Date: ");
        order.orderDate = input.nextLine();

        System.out.print("Enter Tracking Number: ");
        order.trackingNumber = input.nextLine();

        System.out.print("Enter Delivery Date: ");
        order.deliveryDate = input.nextLine();

        // Display order details
        System.out.println("\nOrder Details");
        System.out.println("Order ID: " + order.orderId);
        System.out.println("Order Date: " + order.orderDate);
        System.out.println("Tracking Number: " + order.trackingNumber);
        System.out.println("Delivery Date: " + order.deliveryDate);
        System.out.println("Order Status: " + order.getOrderStatus());
    }
}
