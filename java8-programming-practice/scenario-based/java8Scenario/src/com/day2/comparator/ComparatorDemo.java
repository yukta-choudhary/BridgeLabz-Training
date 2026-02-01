package com.day2.comparator;

import java.util.Comparator;

public class ComparatorDemo {

    public static void main(String[] args) {

        /* 1. Compare students by rank */
        Comparator<Integer> studentRank =
                (r1, r2) -> r1 - r2;
        System.out.println("Student rank comparison: " +
                studentRank.compare(2, 5));

        /* 2. Compare employees by salary */
        Comparator<Double> salaryCompare =
                (s1, s2) -> Double.compare(s1, s2);
        System.out.println("Salary comparison: " +
                salaryCompare.compare(30000.0, 45000.0));

        /* 3. Compare products by price */
        Comparator<Double> priceCompare =
                (p1, p2) -> Double.compare(p1, p2);
        System.out.println("Price comparison: " +
                priceCompare.compare(1500.0, 500.0));

        /* 4. Compare strings by length */
        Comparator<String> lengthCompare =
                (a, b) -> a.length() - b.length();
        System.out.println("String length comparison: " +
                lengthCompare.compare("Java", "Programming"));

        /* 5. Compare bank balances */
        Comparator<Double> balanceCompare =
                (b1, b2) -> Double.compare(b1, b2);
        System.out.println("Balance comparison: " +
                balanceCompare.compare(10000.0, 8000.0));
    }
}
