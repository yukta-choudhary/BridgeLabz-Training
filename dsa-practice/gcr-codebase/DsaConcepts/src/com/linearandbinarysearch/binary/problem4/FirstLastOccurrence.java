package com.linearandbinarysearch.binary.problem4;

import java.util.Scanner;

class FirstLastOccurrence
{
 // Method to find first occurrence
 static int firstOcc(int[] arr, int target)
 {
     int left = 0;
     int right = arr.length - 1;
     int ans = -1;

     while(left <= right)
     {
         int mid = (left + right) / 2;

         if(arr[mid] == target)
         {
             ans = mid;       // store index
             right = mid - 1; // search left side
         }
         else if(arr[mid] < target)
         {
             left = mid + 1;
         }
         else
         {
             right = mid - 1;
         }
     }
     return ans;
 }

 // Method to find last occurrence
 static int lastOcc(int[] arr, int target)
 {
     int left = 0;
     int right = arr.length - 1;
     int ans = -1;

     while(left <= right)
     {
         int mid = (left + right) / 2;

         if(arr[mid] == target)
         {
             ans = mid;      // store index
             left = mid + 1; // search right side
         }
         else if(arr[mid] < target)
         {
             left = mid + 1;
         }
         else
         {
             right = mid - 1;
         }
     }
     return ans;
 }

 public static void main(String[] args)
 {
     Scanner sc = new Scanner(System.in);

     // Take array size
     System.out.print("Enter array size: ");
     int n = sc.nextInt();

     int[] arr = new int[n];

     // Take sorted array input
     System.out.println("Enter sorted array elements:");
     for(int i = 0; i < n; i++)
     {
         arr[i] = sc.nextInt();
     }

     // Take target element
     System.out.print("Enter target element: ");
     int target = sc.nextInt();

     // Find first and last occurrence
     int first = firstOcc(arr, target);
     int last = lastOcc(arr, target);

     // Print result
     System.out.println("First occurrence index: " + first);
     System.out.println("Last occurrence index: " + last);

     sc.close();
 }
}
