package com.linearandbinarysearch.stringbuilder.problem2;

//Main class
import java.util.Scanner;

public class RemoveDuplicatesApp {

 // Question:
 // Remove duplicate characters using StringBuilder

 public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);

     // Input string
     System.out.print("Enter a string: ");
     String input = sc.nextLine();

     // Call method
     String result = RemoveDuplicates.removeDup(input);

     // Output
     System.out.println("String without duplicates: " + result);

     sc.close();
 }
}
