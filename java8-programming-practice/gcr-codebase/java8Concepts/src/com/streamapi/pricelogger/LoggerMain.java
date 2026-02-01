package com.streamapi.pricelogger;

import java.util.List;

public class LoggerMain {

    public static void main(String[] args) {

        List<Double> stockPrices = List.of(
                245.50,
                247.30,
                246.10,
                249.00,
                248.75
        );

        stockPrices.stream()
                .forEach(price -> System.out.println("Live Price: " + price + " INR!"));
    }
}
