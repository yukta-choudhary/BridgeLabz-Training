package com.hashandhashmap.pairsumarray;

import java.util.HashMap;

//Class to check pair with given sum
public class PairSum {

 // Method to check pair
 public static boolean hasPair(int[] arr, int target) {

     HashMap<Integer, Integer> map = new HashMap<>();

     // Traverse array
     for (int i = 0; i < arr.length; i++) {

         int need = target - arr[i];

         // If required number exists
         if (map.containsKey(need)) {
             System.out.println("Pair found: " + need + " + " + arr[i]);
             return true;
         }

         // Store current number
         map.put(arr[i], i);
     }

     return false;
 }
}
