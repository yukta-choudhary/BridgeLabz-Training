package com.hashandhashmap.lcs;

import java.util.Scanner;

//Main class
public class UseLongestConsecutive {

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

     int res = LongestConsecutive.findLength(arr);

     System.out.println("Longest Consecutive Sequence Length: " + res);

     sc.close();
 }
}
