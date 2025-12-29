/*
Rotate Array
Hint
Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.

Example 1:

Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]
*/

import java.util.Scanner;

public class RotateArray {

    // Method to rotate array to the right by k steps
    public static void rotate(int[] nums, int k) {

        int n = nums.length;

        // Handle case when k is greater than array length
        k = k % n;

        int[] result = new int[n];

        // Place elements at rotated positions
        for (int i = 0; i < n; i++) {
            int newIndex = (i + k) % n;
            result[newIndex] = nums[i];
        }

        // Copy result back to original array
        for (int i = 0; i < n; i++) {
            nums[i] = result[i];
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Input array size
        System.out.print("Enter array size: ");
        int n = input.nextInt();

        int[] nums = new int[n];

        // Input array elements
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = input.nextInt();
        }

        // Input k value
        System.out.print("Enter value of k: ");
        int k = input.nextInt();

        // Call rotate method
        rotate(nums, k);

        // Output rotated array
        System.out.println("Rotated Array:");
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }

        input.close();
    }
}
