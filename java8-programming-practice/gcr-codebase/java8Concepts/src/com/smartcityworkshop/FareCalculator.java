package com.smartcityworkshop;

@FunctionalInterface
public interface FareCalculator {
    double calculateFare(double distance, double rate);
}
