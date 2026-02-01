package com.day2.consumer;

import java.util.function.Consumer;

public class ConsumerDemo {

    public static void main(String[] args) {

        /* 1. Print student details */
        System.out.println("Student Details:");
        Consumer<String> printStudent = s -> System.out.println("Student: " + s);
        printStudent.accept("Rahul, Age 20");

        /* 2. Log employee login activity */
        System.out.println("\nEmployee Login Log:");
        Consumer<String> logLogin = e -> System.out.println("Employee logged in: " + e);
        logLogin.accept("Anita");

        /* 3. Print order confirmation */
        System.out.println("\nOrder Confirmation:");
        Consumer<String> orderConfirm = o ->
                System.out.println("Order " + o + " confirmed successfully");
        orderConfirm.accept("ORD123");

        /* 4. Display account balance */
        System.out.println("\nAccount Balance:");
        Consumer<Double> showBalance =
                b -> System.out.println("Current Balance: ₹" + b);
        showBalance.accept(12000.0);

        /* 5. Send notification message */
        System.out.println("\nNotification:");
        Consumer<String> notifyUser =
                m -> System.out.println("Notification sent: " + m);
        notifyUser.accept("Payment Successful");
    }
}
