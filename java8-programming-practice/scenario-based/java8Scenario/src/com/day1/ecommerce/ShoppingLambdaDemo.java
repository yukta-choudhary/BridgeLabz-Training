package com.day1.ecommerce;

import java.util.*;
import java.util.function.*;

public class ShoppingLambdaDemo {

    public static void main(String[] args) {

        List<Product> products = Arrays.asList(
                new Product("Laptop", 60000),
                new Product("Mouse", 500),
                new Product("Keyboard", 1500),
                new Product("Headphones", 2500)
        );

        /* 1. Apply 10% discount */
        System.out.println("Applying 10% Discount:");
        Function<Double, Double> discount = price -> price * 0.90;
        products.forEach(p ->
                System.out.println(p.name + " Discounted Price: " + discount.apply(p.price))
        );

        /* 2. Sort products by price */
        System.out.println("\nProducts sorted by price:");
        products.sort((p1, p2) -> Double.compare(p1.price, p2.price));
        products.forEach(System.out::println);

        /* 3. Free delivery eligibility (amount > 500) */
        System.out.println("\nFree Delivery Check:");
        Predicate<Double> freeDelivery = amount -> amount > 500;
        products.forEach(p ->
                System.out.println(p.name + " Free Delivery? " + freeDelivery.test(p.price))
        );

        /* 4. Calculate final bill amount */
        System.out.println("\nFinal Bill Amount:");
        BinaryOperator<Double> billAmount = (a, b) -> a + b;
        double total = billAmount.apply(products.get(0).price, products.get(1).price);
        System.out.println("Final Bill: " + total);

        /* 5. Print product names */
        System.out.println("\nProduct Names:");
        Consumer<Product> printName = p -> System.out.println(p.name);
        products.forEach(printName);
    }
}

