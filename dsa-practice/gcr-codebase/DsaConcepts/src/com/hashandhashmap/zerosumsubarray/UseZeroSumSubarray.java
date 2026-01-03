package com.hashandhashmap.zerosumsubarray;

import java.util.Scanner;

//Main class
public class UseZeroSumSubarray {

 public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);

     System.out.print("Enter array size: ");
     int n = sc.nextInt();

     int[] arr = new int[n];

     // Take array input
     for (int i = 0; i < n; i++) {
         System.out.print("Enter value: ");
         arr[i] = sc.nextInt();
     }

     System.out.println("Zero Sum Subarrays:");
     ZeroSumSubarray.findSubarrays(arr);

     sc.close();
 }
}

