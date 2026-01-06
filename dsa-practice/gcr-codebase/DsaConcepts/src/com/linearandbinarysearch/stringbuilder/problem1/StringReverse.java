package com.linearandbinarysearch.stringbuilder.problem1;

//Class to reverse string using StringBuilder
public class StringReverse {

 // Method to reverse string
 static String reverseString(String str) {

     // Create StringBuilder
     StringBuilder sb = new StringBuilder();

     // Append string
     sb.append(str);

     // Reverse string
     sb.reverse();

     // Convert to String and return
     return sb.toString();
 }
}
