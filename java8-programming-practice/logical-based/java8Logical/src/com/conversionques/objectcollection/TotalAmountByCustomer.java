package com.conversionques.objectcollection;
import java.util.*;
import java.util.stream.*;

class Order {
    String customer;
    double amount;

    Order(String customer, double amount) {
        this.customer = customer;
        this.amount = amount;
    }
}

public class TotalAmountByCustomer {
    public static void main(String[] args) {

        List<Order> orders = Arrays.asList(
                new Order("Amit", 1000),
                new Order("Amit", 2000),
                new Order("Neha", 1500)
        );

        Map<String, Double> map =
                orders.stream()
                      .collect(Collectors.groupingBy(
                          o -> o.customer,
                          Collectors.summingDouble(o -> o.amount)
                      ));

        System.out.println(map);
    }
}
