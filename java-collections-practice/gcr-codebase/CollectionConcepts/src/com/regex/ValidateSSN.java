package com.regex;
//Question: Validate a Social Security Number (SSN)

import java.util.Scanner;

public class ValidateSSN {
 public static void main(String[] args) {

     // Create Scanner
     Scanner sc = new Scanner(System.in);

     // Take input text
     System.out.println("Enter SSN:");
     String ssn = sc.nextLine();

     // Regex for SSN format
     String regex = "\\d{3}-\\d{2}-\\d{4}";

     // Check valid or not
     if (ssn.matches(regex)) {
         System.out.println("Valid SSN");
     } else {
         System.out.println("Invalid SSN");
     }

     // Close scanner
     sc.close();
 }
}
