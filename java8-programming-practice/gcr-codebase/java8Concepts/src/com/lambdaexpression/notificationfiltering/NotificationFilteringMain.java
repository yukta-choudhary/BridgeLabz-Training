package com.lambdaexpression.notificationfiltering;

import java.util.*;
import java.util.function.Predicate;

public class NotificationFilteringMain {

    public static void main(String[] args) {

        List<Alert> alerts = Arrays.asList(
                new Alert("Heart rate critical!", "CRITICAL", 9),
                new Alert("Low battery on device", "WARNING", 4),
                new Alert("Routine check reminder", "INFO", 2),
                new Alert("Blood pressure high", "CRITICAL", 8)
        );

        // 🔹 User preference: Only CRITICAL alerts
        Predicate<Alert> criticalOnly = a -> a.type.equals("CRITICAL");

        // 🔹 User preference: Severity above 5
        Predicate<Alert> highSeverity = a -> a.severity > 5;

        // Combine preferences
        Predicate<Alert> userFilter = criticalOnly.and(highSeverity);

        System.out.println("Filtered Alerts:\n");

        alerts.stream()
              .filter(userFilter)   // Predicate lambda used here
              .forEach(System.out::println);
    }
}
