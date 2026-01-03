package com.hashandhashmap.twosumproblem;

import java.util.Scanner;

//Main class
public class UseTwoSum {

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

     System.out.print("Enter target sum: ");
     int target = sc.nextInt();

     int[] res = TwoSum.findIndices(arr, target);

     if (res[0] == -1) {
         System.out.println("No pair found");
     } else {
         System.out.println("Indices: " + res[0] + " and " + res[1]);
     }

     sc.close();
 }
}
