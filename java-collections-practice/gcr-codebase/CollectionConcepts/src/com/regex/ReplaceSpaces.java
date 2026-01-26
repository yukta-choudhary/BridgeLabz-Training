package com.regex;
//Question: Replace multiple spaces with a single space

import java.util.Scanner;

public class ReplaceSpaces {
 public static void main(String[] args) {

     // Create Scanner
     Scanner sc = new Scanner(System.in);

     // Take input string
     System.out.println("Enter text:");
     String text = sc.nextLine();

     // Replace multiple spaces with one space
     String result = text.replaceAll("\\s+", " ");

     // Print result
     System.out.println(result);

     // Close scanner
     sc.close();
 }
}
