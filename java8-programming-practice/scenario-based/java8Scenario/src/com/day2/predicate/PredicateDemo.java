package com.day2.predicate;

import java.util.function.Predicate;

public class PredicateDemo {

    public static void main(String[] args) {

        /* 1. Student exam eligibility (attendance ≥ 75%) */
        System.out.println("Student Exam Eligibility:");
        Predicate<Integer> examEligibility = attendance -> attendance >= 75;
        System.out.println("Attendance 80% Eligible? " + examEligibility.test(80));
        System.out.println("Attendance 60% Eligible? " + examEligibility.test(60));

        /* 2. Employee salary check (salary > 30000) */
        System.out.println("\nEmployee Salary Check:");
        Predicate<Double> highSalary = salary -> salary > 30000;
        System.out.println("Salary 45000 Eligible? " + highSalary.test(45000.0));
        System.out.println("Salary 25000 Eligible? " + highSalary.test(25000.0));

        /* 3. Bank withdrawal validation */
        System.out.println("\nBank Withdrawal Validation:");
        Predicate<Double> withdrawValid = amount -> amount <= 10000;
        System.out.println("Withdraw 5000 Allowed? " + withdrawValid.test(5000.0));
        System.out.println("Withdraw 15000 Allowed? " + withdrawValid.test(15000.0));

        /* 4. E-commerce free delivery eligibility */
        System.out.println("\nFree Delivery Check:");
        Predicate<Double> freeDelivery = amount -> amount > 500;
        System.out.println("Order 800 Eligible? " + freeDelivery.test(800.0));
        System.out.println("Order 300 Eligible? " + freeDelivery.test(300.0));

        /* 5. Even or Odd check */
        System.out.println("\nEven or Odd Check:");
        Predicate<Integer> isEven = num -> num % 2 == 0;
        System.out.println("10 is Even? " + isEven.test(10));
        System.out.println("7 is Even? " + isEven.test(7));
    }
}

