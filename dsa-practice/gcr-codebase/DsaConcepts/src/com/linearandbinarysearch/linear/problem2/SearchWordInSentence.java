package com.linearandbinarysearch.linear.problem2;

import java.util.Scanner;

class SearchWordInSentence
{
 // Method to search word in sentences
 static String searchWord(String[] arr, String word)
 {
     // Traverse sentences one by one
     for(int i = 0; i < arr.length; i++)
     {
         // Check if sentence contains the word
         if(arr[i].contains(word))
         {
             return arr[i]; // return sentence
         }
     }
     return "Not Found"; // word not present
 }

 public static void main(String[] args)
 {
     Scanner sc = new Scanner(System.in);

     // Take number of sentences
     System.out.print("Enter number of sentences: ");
     int n = sc.nextInt();
     sc.nextLine(); // clear buffer

     String[] arr = new String[n];

     // Take sentences as input
     System.out.println("Enter sentences:");
     for(int i = 0; i < n; i++)
     {
         arr[i] = sc.nextLine();
     }

     // Take word to search
     System.out.print("Enter word to search: ");
     String word = sc.nextLine();

     // Call method
     String result = searchWord(arr, word);

     // Print result
     System.out.println("Result: " + result);

     sc.close();
 }
}
