package com.streamapi.sensorreadings;

import java.util.List;

public class ReadingMain {

    public static void main(String[] args) {

        List<Double> sensorReadings = List.of(
                28.5,
                31.2,
                29.8,
                35.0,
                33.6,
                27.9
        );

        double threshold = 30.0;

        sensorReadings.stream()
                .filter(reading -> reading > threshold)
                .forEach(reading -> 
                        System.out.println("High Reading Detected: " + reading));
    }
}
