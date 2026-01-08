package com.linearandbinarysearch.linear.problem1;

import java.util.Scanner;

class FirstNegativeSearch
{
 // Method to find first negative number
 static int findNegative(int[] arr)
 {
     // Traverse array from start
     for(int i = 0; i < arr.length; i++)
     {
         // Check for negative number
         if(arr[i] < 0)
         {
             return i;   // return index
         }
     }
     return -1; // no negative number found
 }

 public static void main(String[] args)
 {
     Scanner sc = new Scanner(System.in);

     // Take array size
     System.out.print("Enter array size: ");
     int n = sc.nextInt();

     int[] arr = new int[n];

     // Take array elements
     System.out.println("Enter array elements:");
     for(int i = 0; i < n; i++)
     {
         arr[i] = sc.nextInt();
     }

     // Call method
     int result = findNegative(arr);

     // Print result
     System.out.println("Index of first negative number: " + result);

     sc.close();
 }
}

