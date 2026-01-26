package com.regex;

//Question: Extract all capitalized words from a sentence

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CapitalWords {
 public static void main(String[] args) {

     // Create Scanner
     Scanner sc = new Scanner(System.in);

     // Take input sentence
     System.out.println("Enter sentence:");
     String text = sc.nextLine();

     // Regex for capitalized words
     String regex = "\\b[A-Z][a-z]*\\b";

     // Compile regex
     Pattern pattern = Pattern.compile(regex);

     // Match regex with text
     Matcher matcher = pattern.matcher(text);

     // Print matched words
     while (matcher.find()) {
         System.out.println(matcher.group());
     }

     // Close scanner
     sc.close();
 }
}

