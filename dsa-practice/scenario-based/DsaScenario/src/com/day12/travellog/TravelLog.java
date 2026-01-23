package com.day12.travellog;
import java.io.*;
import java.util.*;
import java.util.regex.*;

public class TravelLog {

    public static void main(String[] args) throws Exception {

        // Writing trips
        ObjectOutputStream out =
                new ObjectOutputStream(new FileOutputStream("trips.dat"));

        out.writeObject(new Trip("Paris", "France", 6, "Loved Paris cafes"));
        out.writeObject(new Trip("Rome", "Italy", 4, "Historic places"));
        out.writeObject(new Trip("Paris", "France", 7, "Eiffel Tower visit"));
        out.close();

        // Reading trips
        ObjectInputStream in =
                new ObjectInputStream(new FileInputStream("trips.dat"));

        List<Trip> trips = new ArrayList<>();
        try {
            while (true) {
                trips.add((Trip) in.readObject());
            }
        } catch (EOFException e) {}
        in.close();

        // Regex to extract cities
        Pattern cityPattern = Pattern.compile("[A-Z][a-z]+");

        Set<String> countries = new HashSet<>();
        Map<String, Integer> cityCount = new HashMap<>();

        for (Trip t : trips) {

            // Duration > 5 days
            if (t.days > 5)
                System.out.println("Long Trip: " + t.city);

            countries.add(t.country);
            cityCount.put(t.city, cityCount.getOrDefault(t.city, 0) + 1);

            Matcher m = cityPattern.matcher(t.notes);
            while (m.find())
                System.out.println("City Mentioned: " + m.group());
        }

        // Top 3 cities
        cityCount.entrySet().stream()
                .sorted((a, b) -> b.getValue() - a.getValue())
                .limit(3)
                .forEach(e -> System.out.println(e.getKey()));
    }
}

