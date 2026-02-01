package com.streamapi.insuranceanalysis;

import java.util.*;
import java.util.stream.Collectors;

public class ClaimAnalysisMain {

    public static void main(String[] args) {

        List<Claim> claims = List.of(
            new Claim("Health", 5000),
            new Claim("Vehicle", 12000),
            new Claim("Health", 8000),
            new Claim("Property", 25000),
            new Claim("Vehicle", 10000),
            new Claim("Health", 7000)
        );

        Map<String, Double> averageByType = claims.stream()
                .collect(Collectors.groupingBy(
                        Claim::getClaimType,
                        Collectors.averagingDouble(Claim::getAmount)
                ));

        averageByType.forEach((type, avg) ->
                System.out.println(type + " Avg Claim: " + avg));
    }
}
