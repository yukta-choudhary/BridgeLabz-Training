package com.day2.function;

import java.util.function.Function;

public class FunctionDemo {

    public static void main(String[] args) {

        /* 1. Convert student marks into grade */
        System.out.println("Student Marks to Grade:");
        Function<Integer, String> marksToGrade = marks -> {
            if (marks >= 75)
                return "A";
            else if (marks >= 50)
                return "B";
            else
                return "C";
        };
        System.out.println("Marks 80 -> Grade " + marksToGrade.apply(80));
        System.out.println("Marks 55 -> Grade " + marksToGrade.apply(55));

        /* 2. Calculate annual salary from monthly salary */
        System.out.println("\nAnnual Salary Calculation:");
        Function<Double, Double> annualSalary = monthly -> monthly * 12;
        System.out.println("Monthly 30000 -> Annual " + annualSalary.apply(30000.0));

        /* 3. Convert product price into discounted price */
        System.out.println("\nDiscounted Product Price:");
        Function<Double, Double> discountPrice = price -> price * 0.90;
        System.out.println("Original 1000 -> Discounted " + discountPrice.apply(1000.0));

        /* 4. Convert employee name into uppercase */
        System.out.println("\nEmployee Name to Uppercase:");
        Function<String, String> toUpperCase = name -> name.toUpperCase();
        System.out.println("rahul -> " + toUpperCase.apply("rahul"));

        /* 5. Convert Celsius to Fahrenheit */
        System.out.println("\nCelsius to Fahrenheit:");
        Function<Double, Double> celsiusToFahrenheit =
                c -> (c * 9 / 5) + 32;
        System.out.println("30°C -> " + celsiusToFahrenheit.apply(30.0) + "°F");
    }
}
