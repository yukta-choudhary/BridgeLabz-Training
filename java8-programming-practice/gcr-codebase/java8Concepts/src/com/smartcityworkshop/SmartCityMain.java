package com.smartcityworkshop;

import java.util.*;
import java.util.stream.*;

public class SmartCityMain {

    public static void main(String[] args) {

        List<TransportService> services = Arrays.asList(
                new BusService("A1", 20, "09:00"),
                new MetroService("B2", 15, "08:30"),
                new TaxiService("C3", 30, "09:15"),
                new BusService("A1", 18, "10:00"),
                new AmbulanceService()
        );

        System.out.println("\n-----Dashboard -----");
        services.forEach(TransportService::printServiceDetails);

        System.out.println("\n----- Cheapest First -----");
        services.stream()
                .filter(s -> !(s instanceof EmergencyService))
                .sorted(Comparator.comparingDouble(TransportService::getFare))
                .forEach(TransportService::printServiceDetails);

        System.out.println("\n----- Group By Route -----");
        Map<String, List<TransportService>> byRoute =
                services.stream().collect(Collectors.groupingBy(TransportService::getRoute));
        byRoute.forEach((route, list) -> {
            System.out.println("Route: " + route);
            list.forEach(TransportService::printServiceDetails);
        });

        System.out.println("\n----- Revenue Summary -----");
        DoubleSummaryStatistics stats =
                services.stream()
                        .filter(s -> !(s instanceof EmergencyService))
                        .collect(Collectors.summarizingDouble(TransportService::getFare));
        System.out.println("Total Revenue: " + stats.getSum());
        System.out.println("Average Fare: " + stats.getAverage());

        FareCalculator calculator = (distance, rate) -> distance * rate;
        System.out.println("\nFare Calculated: " + calculator.calculateFare(12, 5));

        double distance = GeoUtils.calculateDistance(10, 20, 13, 24);
        System.out.println("Distance Calculated: " + distance);

        System.out.println("\n=== Emergency Services ===");
        services.stream()
                .filter(s -> s instanceof EmergencyService)
                .forEach(s -> System.out.println(s.getServiceName() + " gets priority!"));
    }
}
