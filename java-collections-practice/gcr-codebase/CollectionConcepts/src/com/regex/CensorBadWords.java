package com.regex;
//Question: Censor bad words in a sentence

import java.util.Scanner;

public class CensorBadWords {
 public static void main(String[] args) {

     // Create Scanner
     Scanner sc = new Scanner(System.in);

     // Take input sentence
     System.out.println("Enter sentence:");
     String text = sc.nextLine();

     // Regex for bad words
     String regex = "\\b(damn|stupid)\\b";

     // Replace bad words with ****
     String result = text.replaceAll(regex, "****");

     // Print result
     System.out.println(result);

     // Close scanner
     sc.close();
 }
}
