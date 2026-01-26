package com.regex;

//Question: Extract currency values from text

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractCurrency {
 public static void main(String[] args) {

     // Create Scanner
     Scanner sc = new Scanner(System.in);

     // Take input text
     System.out.println("Enter text:");
     String text = sc.nextLine();

     // Regex for currency values
     String regex = "\\$?\\d+(\\.\\d{2})?";

     // Compile regex
     Pattern pattern = Pattern.compile(regex);

     // Match regex with text
     Matcher matcher = pattern.matcher(text);

     // Print matched currency values
     while (matcher.find()) {
         System.out.println(matcher.group());
     }

     // Close scanner
     sc.close();
 }
}

