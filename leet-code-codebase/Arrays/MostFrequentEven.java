/*
Given an integer array nums, return the most frequent even element.
If tie → return the smallest one. If no even element → return -1.
*/

import java.util.HashMap;
import java.util.Scanner;

public class MostFrequentEven {

    // Method to find most frequent even element
    static int mostFrequentEven(int[] nums) {

        HashMap<Integer, Integer> freqMap = new HashMap<>();
        int maxCount = 0;
        int result = -1;

        for (int num : nums) {
            if (num % 2 == 0) { // Only even numbers
                freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);

                int count = freqMap.get(num);

                // Update result if higher frequency or tie with smaller number
                if (count > maxCount || (count == maxCount && num < result)) {
                    maxCount = count;
                    result = num;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Array size
        System.out.print("Enter array size: ");
        int n = input.nextInt();

        int[] nums = new int[n];

        // Input array
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = input.nextInt();
        }

        // Call method
        int result = mostFrequentEven(nums);

        // Output
        System.out.println("Most frequent even element: " + result);

        input.close();
    }
}
