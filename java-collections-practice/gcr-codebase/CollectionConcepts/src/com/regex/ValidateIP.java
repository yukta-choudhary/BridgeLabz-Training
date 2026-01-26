package com.regex;

//Question: Validate an IPv4 address

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateIP {
 public static void main(String[] args) {

     // Create Scanner
     Scanner sc = new Scanner(System.in);

     // Take IP address input
     System.out.println("Enter IP address:");
     String ip = sc.nextLine();

     // Regex for IPv4 (0–255)
     String regex =
         "\\b((25[0-5]|2[0-4][0-9]|1?[0-9]{1,2})\\.){3}"
       + "(25[0-5]|2[0-4][0-9]|1?[0-9]{1,2})\\b";

     // Compile regex
     Pattern pattern = Pattern.compile(regex);

     // Match regex with input
     Matcher matcher = pattern.matcher(ip);

     // Check valid or not
     if (matcher.matches()) {
         System.out.println("Valid IP Address");
     } else {
         System.out.println("Invalid IP Address");
     }

     // Close scanner
     sc.close();
 }
}
