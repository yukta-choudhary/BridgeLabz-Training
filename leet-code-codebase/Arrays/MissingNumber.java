/*
Missing Number

Given an array nums containing n distinct numbers in the range [0, n],
return the only number in the range that is missing from the array.

Example:
Input: nums = [3,0,1]
Output: 2
*/

import java.util.Scanner;

public class MissingNumber {

    // Method to find the missing number
    public static int findMissingNumber(int[] nums) {

        int n = nums.length;

        // Sum of numbers from 0 to n
        int expectedSum = n * (n + 1) / 2;

        // Sum of array elements
        int actualSum = 0;
        for (int i = 0; i < n; i++) {
            actualSum = actualSum + nums[i];
        }

        // Missing number
        return expectedSum - actualSum;
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

        // Call method
        int result = findMissingNumber(nums);

        // Output
        System.out.println("Missing number is: " + result);

        input.close();
    }
}
