/*
2239. Find Closest Number to Zero

Given an integer array nums, return the number closest to 0.
If multiple numbers are equally close, return the largest one.
*/

import java.util.Scanner;

public class ClosestNumberToZero {

    // Method to find the closest number to zero
    static int findClosestToZero(int[] nums) {

        int closest = nums[0];

        for (int i = 1; i < nums.length; i++) {
            // If current number is closer to 0
            if (Math.abs(nums[i]) < Math.abs(closest)) {
                closest = nums[i];
            }
            // If tie, choose the larger number
            else if (Math.abs(nums[i]) == Math.abs(closest) && nums[i] > closest) {
                closest = nums[i];
            }
        }

        return closest;
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
        int result = findClosestToZero(nums);

        // Output
        System.out.println("Closest number to zero: " + result);

        input.close();
    }
}
