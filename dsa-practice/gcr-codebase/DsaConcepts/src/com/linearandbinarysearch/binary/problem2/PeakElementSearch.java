package com.linearandbinarysearch.binary.problem2;

import java.util.Scanner;

class PeakElementSearch
{
 // Method to find peak element index
 static int findPeak(int[] arr)
 {
     int left = 0;
     int right = arr.length - 1;

     // Binary search loop
     while(left <= right)
     {
         int mid = (left + right) / 2;

         // Check left and right neighbors safely
         boolean leftOk = (mid == 0) || (arr[mid] > arr[mid - 1]);
         boolean rightOk = (mid == arr.length - 1) || (arr[mid] > arr[mid + 1]);

         // If both conditions true, mid is peak
         if(leftOk && rightOk)
         {
             return mid;
         }

         // If left neighbor is greater, move left
         if(mid > 0 && arr[mid] < arr[mid - 1])
         {
             right = mid - 1;
         }
         else
         {
             left = mid + 1; // move right
         }
     }
     return -1; // no peak (theoretically not possible)
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
     int index = findPeak(arr);

     // Print result
     System.out.println("Peak element index: " + index);
     System.out.println("Peak element value: " + arr[index]);

     sc.close();
 }
}

