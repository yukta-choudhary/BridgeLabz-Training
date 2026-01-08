package com.day7.TourMate;

/*
Main class – TourMate
*/

import java.util.Scanner;

public class TourMate
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter trip type (domestic/international):");
        String type = sc.next();

        System.out.println("Enter destination:");
        String destination = sc.next();

        System.out.println("Enter duration (days):");
        int duration = sc.nextInt();

        System.out.println("Enter transport cost:");
        double tCost = sc.nextDouble();

        System.out.println("Enter hotel cost:");
        double hCost = sc.nextDouble();

        System.out.println("Enter activity cost:");
        double aCost = sc.nextDouble();

        Transport t = new Transport(tCost);
        Hotel h = new Hotel(hCost);
        Activity a = new Activity(aCost);

        Trip trip;

        // Polymorphism
        if (type.equalsIgnoreCase("domestic"))
            trip = new DomesticTrip(destination, duration, t, h, a);
        else
            trip = new InternationalTrip(destination, duration, t, h, a);

        trip.book();
        System.out.println("Total Budget: " + trip.calculateBudget());

        sc.close();
    }
}

