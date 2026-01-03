package com.stacksandqueues.slidingwindowmax;

import java.util.Scanner;

//Main class
public class UseSlidingWindow {

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

     System.out.print("Enter window size k: ");
     int k = sc.nextInt();

     // Get sliding window maximum
     int[] res = SlidingWindow.maxWindow(arr, k);

     System.out.println("Sliding Window Maximum:");

     // Print result
     for (int val : res) {
         System.out.println(val);
     }

     sc.close();
 }
}
