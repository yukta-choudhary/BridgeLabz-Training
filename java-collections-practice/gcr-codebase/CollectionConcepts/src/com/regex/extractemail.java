package com.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractEmail {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Take full text as input
        System.out.println("Enter text:");
        String text = sc.nextLine();

        // Regex to extract email addresses
        String regex = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";

        // Compile the regex
        Pattern pattern = Pattern.compile(regex);

        // Match regex with input text
        Matcher matcher = pattern.matcher(text);

        // Print all matched emails
        while (matcher.find()) {
            System.out.println(matcher.group());
        }

        // Close scanner
        sc.close();
    }
}
