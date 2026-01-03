package com.hashandhashmap.lcs;

import java.util.HashMap;

//Class to find longest consecutive sequence
public class LongestConsecutive {

 // Method to find longest length
 public static int findLength(int[] arr) {

     HashMap<Integer, Boolean> map = new HashMap<>();

     // Store all elements
     for (int num : arr) {
         map.put(num, true);
     }

     // Mark sequence starts
     for (int num : arr) {
         if (map.containsKey(num - 1)) {
             map.put(num, false);
         }
     }

     int maxLen = 0;

     // Check sequences
     for (int num : arr) {

         // If it is start of sequence
         if (map.get(num)) {

             int currNum = num;
             int len = 1;

             // Count consecutive numbers
             while (map.containsKey(currNum + 1)) {
                 currNum++;
                 len++;
             }

             // Update max
             if (len > maxLen) {
                 maxLen = len;
             }
         }
     }

     return maxLen;
 }
}
