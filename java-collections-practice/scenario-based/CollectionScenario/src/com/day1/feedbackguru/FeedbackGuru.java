package com.day1.feedbackguru;

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class FeedbackGuru<T> {

    public static void main(String[] args) {

        Map<String, List<String>> map = new HashMap<>();
        map.put("Positive", new ArrayList<>());
        map.put("Neutral", new ArrayList<>());
        map.put("Negative", new ArrayList<>());

        Pattern ratingPattern = Pattern.compile("(\\d)/10");

        try (BufferedReader br = new BufferedReader(
                new FileReader("feedback.txt"))) {

            String line;
            while ((line = br.readLine()) != null) {

                Matcher m = ratingPattern.matcher(line);
                if (m.find()) {
                    int rating = Integer.parseInt(m.group(1));

                    if (rating >= 8)
                        map.get("Positive").add(line);
                    else if (rating >= 5)
                        map.get("Neutral").add(line);
                    else
                        map.get("Negative").add(line);
                }
            }

        } catch (Exception e) {
            System.out.println("Invalid feedback skipped");
        }

        System.out.println(map);
    }
}
