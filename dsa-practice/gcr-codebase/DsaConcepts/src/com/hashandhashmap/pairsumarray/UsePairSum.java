package com.hashandhashmap.pairsumarray;

import java.util.Scanner;

//Main class
public class UsePairSum {

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

     boolean res = PairSum.hasPair(arr, target);

     if (!res) {
         System.out.println("No pair found");
     }

     sc.close();
 }
}
