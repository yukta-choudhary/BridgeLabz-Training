package com.regex;

//Question: Find repeating words in a sentence

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RepeatingWords {
 public static void main(String[] args) {

     // Create Scanner
     Scanner sc = new Scanner(System.in);

     // Take input sentence
     System.out.println("Enter sentence:");
     String text = sc.nextLine();

     // Regex for repeating words
     String regex = "\\b(\\w+)\\s+\\1\\b";

     // Compile regex
     Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

     // Match regex with text
     Matcher matcher = pattern.matcher(text);

     // Print repeating words
     while (matcher.find()) {
         System.out.println(matcher.group(1));
     }

     // Close scanner
     sc.close();
 }
}

