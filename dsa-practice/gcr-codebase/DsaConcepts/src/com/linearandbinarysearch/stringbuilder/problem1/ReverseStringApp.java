package com.linearandbinarysearch.stringbuilder.problem1;

//Main class
import java.util.Scanner;

public class ReverseStringApp {

 // Question:
 // Reverse a string using StringBuilder

 public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);

     // Input string
     System.out.print("Enter a string: ");
     String input = sc.nextLine();

     // Call reverse method
     String result = StringReverse.reverseString(input);

     // Output
     System.out.println("Reversed string: " + result);

     sc.close();
 }
}

