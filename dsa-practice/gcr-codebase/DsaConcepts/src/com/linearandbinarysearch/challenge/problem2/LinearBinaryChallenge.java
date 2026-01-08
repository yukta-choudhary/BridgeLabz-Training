package com.linearandbinarysearch.challenge.problem2;


import java.util.Scanner;
import java.util.Arrays;

class LinearBinaryChallenge
{
 // Method to find first missing positive integer (Linear Search)
 static int firstMissingPositive(int[] arr)
 {
     int n = arr.length;
     boolean[] seen = new boolean[n + 1];

     // Mark visited positive numbers
     for(int i = 0; i < n; i++)
     {
         if(arr[i] > 0 && arr[i] <= n)
         {
             seen[arr[i]] = true;
         }
     }

     // Find first number not marked
     for(int i = 1; i <= n; i++)
     {
         if(seen[i] == false)
         {
             return i;
         }
     }
     return n + 1;
 }

 // Method to find target index using Binary Search
 static int binarySearch(int[] arr, int target)
 {
     int left = 0;
     int right = arr.length - 1;

     while(left <= right)
     {
         int mid = (left + right) / 2;

         if(arr[mid] == target)
         {
             return mid;
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
     return -1;
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

     // Linear Search result
     int missing = firstMissingPositive(arr);
     System.out.println("First missing positive integer: " + missing);

     // Take target for Binary Search
     System.out.print("Enter target element: ");
     int target = sc.nextInt();

     // Sort array for Binary Search
     Arrays.sort(arr);

     // Binary Search result
     int index = binarySearch(arr, target);
     System.out.println("Target index after sorting: " + index);

     sc.close();
 }
}
