package com.day2.supplier;

import java.time.LocalDateTime;
import java.util.Random;
import java.util.function.Supplier;

public class SupplierDemo {

    public static void main(String[] args) {

        /* 1. Generate OTP */
        Supplier<Integer> otp =
                () -> new Random().nextInt(9000) + 1000;
        System.out.println("Generated OTP: " + otp.get());

        /* 2. Generate random student ID */
        Supplier<Integer> studentId =
                () -> new Random().nextInt(1000);
        System.out.println("Student ID: " + studentId.get());

        /* 3. Current date and time */
        Supplier<LocalDateTime> dateTime =
                () -> LocalDateTime.now();
        System.out.println("Current DateTime: " + dateTime.get());

        /* 4. Default welcome message */
        Supplier<String> welcomeMsg =
                () -> "Welcome to the System!";
        System.out.println(welcomeMsg.get());

        /* 5. Generate discount coupon */
        Supplier<String> coupon =
                () -> "DISC" + new Random().nextInt(100);
        System.out.println("Coupon Code: " + coupon.get());
    }
}
