package com.regex;

//Question: Validate Visa and MasterCard numbers

import java.util.Scanner;

public class ValidateCard {
 public static void main(String[] args) {

     // Create Scanner
     Scanner sc = new Scanner(System.in);

     // Take card number
     System.out.println("Enter card number:");
     String card = sc.nextLine();

     // Regex for Visa or MasterCard
     String regex = "^(4[0-9]{15}|5[0-9]{15})$";

     // Check valid or not
     if (card.matches(regex)) {
         System.out.println("Valid Card Number");
     } else {
         System.out.println("Invalid Card Number");
     }

     // Close scanner
     sc.close();
 }
}
