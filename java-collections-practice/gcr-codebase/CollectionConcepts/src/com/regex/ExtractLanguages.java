package com.regex;

//Question: Extract programming language names from text

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractLanguages {
 public static void main(String[] args) {

     // Create Scanner
     Scanner sc = new Scanner(System.in);

     // Take input text
     System.out.println("Enter text:");
     String text = sc.nextLine();

     // Regex for language names
     String regex = "\\b(Java|Python|JavaScript|Go)\\b";

     // Compile regex
     Pattern pattern = Pattern.compile(regex);

     // Match regex with text
     Matcher matcher = pattern.matcher(text);

     // Print matched languages
     while (matcher.find()) {
         System.out.println(matcher.group());
     }

     // Close scanner
     sc.close();
 }
}
