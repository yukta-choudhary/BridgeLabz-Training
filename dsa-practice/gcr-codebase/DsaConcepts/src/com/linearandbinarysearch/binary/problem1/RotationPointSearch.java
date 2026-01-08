package com.linearandbinarysearch.binary.problem1;

import java.util.Scanner;

class RotationPointSearch
{
 // Method to find rotation point index
 static int findRotationPoint(int[] arr)
 {
     int left = 0;
     int right = arr.length - 1;

     // Binary search loop
     while(left < right)
     {
         int mid = (left + right) / 2;

         // If middle element is greater than right element
         if(arr[mid] > arr[right])
         {
             left = mid + 1; // move to right half
         }
         else
         {
             right = mid; // move to left half
         }
     }

     // left will point to smallest element
     return left;
 }

 public static void main(String[] args)
 {
     Scanner sc = new Scanner(System.in);

     // Take array size
     System.out.print("Enter array size: ");
     int n = sc.nextInt();

     int[] arr = new int[n];

     // Take array elements
     System.out.println("Enter rotated sorted array elements:");
     for(int i = 0; i < n; i++)
     {
         arr[i] = sc.nextInt();
     }

     // Call method
     int index = findRotationPoint(arr);

     // Print result
     System.out.println("Rotation point index: " + index);
     System.out.println("Smallest element: " + arr[index]);

     sc.close();
 }
}

