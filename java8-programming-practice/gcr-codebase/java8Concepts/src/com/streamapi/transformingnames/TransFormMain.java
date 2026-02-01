package com.streamapi.transformingnames;

import java.util.List;

public class TransFormMain {

    public static void main(String[] args) {

        List<String> customers = List.of(
                "John",
                "William",
                "Maximus",
                "Eleven",
                "Nancy"
        );

        customers.stream()
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);
    }
}
