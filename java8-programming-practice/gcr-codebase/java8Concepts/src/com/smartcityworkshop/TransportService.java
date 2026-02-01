package com.smartcityworkshop;

public interface TransportService {
    String getServiceName();
    double getFare();
    String getRoute();
    String getDepartureTime();

    default void printServiceDetails() {
        System.out.println(getServiceName() + " | Route: " + getRoute() +
                " | Fare: " + getFare() +
                " | Departure: " + getDepartureTime());
    }
}
