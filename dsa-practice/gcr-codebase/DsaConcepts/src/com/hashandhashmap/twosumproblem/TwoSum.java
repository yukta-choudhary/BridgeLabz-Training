package com.hashandhashmap.twosumproblem;

import java.util.HashMap;

//Class to solve Two Sum
public class TwoSum {

 // Method to find two indices
 public static int[] findIndices(int[] arr, int target) {

     HashMap<Integer, Integer> map = new HashMap<>();

     // Traverse array
     for (int i = 0; i < arr.length; i++) {

         int need = target - arr[i];

         // If complement exists
         if (map.containsKey(need)) {
             return new int[]{map.get(need), i};
         }

         // Store value with index
         map.put(arr[i], i);
     }

     return new int[]{-1, -1};
 }
}
