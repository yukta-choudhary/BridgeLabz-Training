package com.regex;
//Question: Extract all links from a text

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractLinks {
 public static void main(String[] args) {

     // Create Scanner
     Scanner sc = new Scanner(System.in);

     // Take input text
     System.out.println("Enter text:");
     String text = sc.nextLine();

     // Regex for http and https links
     String regex = "https?://[a-zA-Z0-9./_-]+";

     // Compile regex
     Pattern pattern = Pattern.compile(regex);

     // Match regex with text
     Matcher matcher = pattern.matcher(text);

     // Print matched links
     while (matcher.find()) {
         System.out.println(matcher.group());
     }

     // Close scanner
     sc.close();
 }
}
