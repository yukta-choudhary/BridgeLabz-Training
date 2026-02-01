package com.streamapi.expiringmembership;

import java.time.LocalDate;
import java.util.*;

public class GymMain {

    public static void main(String[] args) {

        List<Member> members = List.of(
            new Member("Yukta", LocalDate.now().plusDays(10)),
            new Member("Riya", LocalDate.now().plusDays(40)),
            new Member("Rashi", LocalDate.now().plusDays(25)),
            new Member("Shraddha", LocalDate.now().plusDays(5)),
            new Member("Arya", LocalDate.now().plusDays(90))
        );

        LocalDate today = LocalDate.now();
        LocalDate next30Days = today.plusDays(30);

        List<Member> expiringSoon = members.stream()
                .filter(m -> !m.getExpiryDate().isBefore(today))   // not already expired
                .filter(m -> !m.getExpiryDate().isAfter(next30Days)) // within 30 days
                .toList();

        expiringSoon.forEach(System.out::println);
    }
}
