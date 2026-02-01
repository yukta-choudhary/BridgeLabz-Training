package com.collectors.ordersummary;

import java.util.*;
import java.util.stream.Collectors;

public class OrderSummaryMain {

    public static void main(String[] args) {

        List<Order> orders = List.of(
                new Order("Rashi", 2500),
                new Order("Shraddha", 1800),
                new Order("Rashi", 3200),
                new Order("Yukta", 1500),
                new Order("Rashi", 2200)
        );

        Map<String, Double> revenueByCustomer = orders.stream()
                .collect(Collectors.groupingBy(
                        Order::getCustomerName,
                        Collectors.summingDouble(Order::getAmount)
                ));

        revenueByCustomer.forEach((customer, total) ->
                System.out.println(customer + " → Total Revenue: ₹" + total));
    }
}
