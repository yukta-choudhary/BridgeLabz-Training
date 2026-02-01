package com.day1.banking;

import java.util.function.*;

public class BankingLambdaDemo {

    public static void main(String[] args) {

        BankAccount acc1 = new BankAccount("Ramesh", 10000);
        BankAccount acc2 = new BankAccount("Suresh", 15000);

        /* 1. Check minimum balance rule */
        System.out.println("Minimum Balance Check:");
        Predicate<Double> minBalanceCheck = balance -> balance >= 5000;
        System.out.println("Acc1 maintains min balance? " +
                minBalanceCheck.test(acc1.balance));

        /* 2. Calculate simple interest */
        System.out.println("\nSimple Interest Calculation:");
        TriFunction<Double, Double, Double, Double> simpleInterest =
                (p, r, t) -> (p * r * t) / 100;
        System.out.println("Simple Interest: " +
                simpleInterest.apply(10000.0, 5.0, 2.0));

        /* 3. Validate withdrawal amount */
        System.out.println("\nWithdrawal Validation:");
        BiPredicate<Double, Double> withdrawCheck =
                (balance, amount) -> amount <= balance;
        System.out.println("Withdrawal allowed? " +
                withdrawCheck.test(acc1.balance, 4000.0));

        /* 4. Print account details */
        System.out.println("\nAccount Details:");
        Consumer<BankAccount> printAccount = acc -> System.out.println(acc);
        printAccount.accept(acc1);

        /* 5. Compare two account balances */
        System.out.println("\nAccount with Higher Balance:");
        BiFunction<BankAccount, BankAccount, BankAccount> higherBalance =
                (a1, a2) -> a1.balance > a2.balance ? a1 : a2;
        System.out.println(higherBalance.apply(acc1, acc2));
    }

    /* Custom functional interface for 3 inputs */
    @FunctionalInterface
    interface TriFunction<A, B, C, R> {
        R apply(A a, B b, C c);
    }
}

