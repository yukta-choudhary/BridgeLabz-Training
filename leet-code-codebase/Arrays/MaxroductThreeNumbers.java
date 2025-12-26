/*
628. Maximum Product of Three Numbers

Given an integer array nums, find three numbers whose product is maximum 
and return the maximum product.
*/

import java.util.Arrays;
import java.util.Scanner;

public class MaxroductThreeNumbers {

    // Method to find maximum product of three numbers
    static int maximumProduct(int[] nums) {

        Arrays.sort(nums); // Sort the array

        int n = nums.length;

        // Maximum product can be:
        // 1. Product of three largest numbers
        int prod1 = nums[n - 1] * nums[n - 2] * nums[n - 3];

        // 2. Product of two smallest (possibly negative) and the largest
        int prod2 = nums[0] * nums[1] * nums[n - 1];

        return Math.max(prod1, prod2);
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
        int result = maximumProduct(nums);

        // Output
        System.out.println("Maximum product of three numbers: " + result);

        input.close();
    }
}
