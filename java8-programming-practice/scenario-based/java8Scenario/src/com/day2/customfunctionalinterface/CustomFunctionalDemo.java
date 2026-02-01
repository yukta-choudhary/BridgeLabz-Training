package com.day2.customfunctionalinterface;

public class CustomFunctionalDemo {

    public static void main(String[] args) {

        /* 1. Calculate bonus */
        BonusCalculator bonus =
                salary -> salary * 0.10;
        System.out.println("Bonus: " + bonus.calculate(50000));

        /* 2. Loan eligibility */
        LoanEligibility loan =
                income -> income > 30000;
        System.out.println("Loan Eligible? " + loan.check(40000));

        /* 3. Calculate tax */
        TaxCalculator tax =
                amount -> amount * 0.18;
        System.out.println("Tax: " + tax.calculate(10000));

        /* 4. Validate login */
        LoginValidator login =
                (u, p) -> u.equals("admin") && p.equals("1234");
        System.out.println("Login Success? " +
                login.validate("admin", "1234"));
    }
}

/* Custom Functional Interfaces */

@FunctionalInterface
interface BonusCalculator {
    double calculate(double salary);
}

@FunctionalInterface
interface LoanEligibility {
    boolean check(double income);
}

@FunctionalInterface
interface TaxCalculator {
    double calculate(double amount);
}

@FunctionalInterface
interface LoginValidator {
    boolean validate(String username, String password);
}
