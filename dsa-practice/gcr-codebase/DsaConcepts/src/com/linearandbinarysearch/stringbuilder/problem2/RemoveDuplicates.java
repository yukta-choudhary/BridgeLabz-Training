package com.linearandbinarysearch.stringbuilder.problem2;

//Class to remove duplicate characters
import java.util.HashSet;

public class RemoveDuplicates {

 // Method to remove duplicates
 static String removeDup(String str) {

     StringBuilder sb = new StringBuilder();
     HashSet<Character> set = new HashSet<>();

     // Traverse each character
     for (int i = 0; i < str.length(); i++) {

         char ch = str.charAt(i);

         // If not already present
         if (!set.contains(ch)) {
             set.add(ch);
             sb.append(ch);
         }
     }

     // Return result string
     return sb.toString();
 }
}
