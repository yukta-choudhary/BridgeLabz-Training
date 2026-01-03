package com.hashandhashmap.zerosumsubarray;

import java.util.ArrayList;
import java.util.HashMap;

// Class to find zero sum subarrays
public class ZeroSumSubarray {

    // Method to find and print zero sum subarrays
    public static void findSubarrays(int[] arr) {

        // Map to store sum and list of indices
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();

        int sum = 0;

        // Sum 0 at index -1 (for subarrays starting at 0)
        map.put(0, new ArrayList<>());
        map.get(0).add(-1);

        // Traverse array
        for (int i = 0; i < arr.length; i++) {

            sum = sum + arr[i];

            // If sum already exists, zero sum subarray found
            if (map.containsKey(sum)) {
                for (int start : map.get(sum)) {
                    System.out.println("Subarray from index " + (start + 1) + " to " + i);
                }
            }

            // Add index to map
            map.putIfAbsent(sum, new ArrayList<>());
            map.get(sum).add(i);
        }
    }
}
