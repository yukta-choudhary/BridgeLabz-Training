/*
Move Zeroes (Easy)

Given an integer array nums, move all 0's to the end of it while maintaining 
the relative order of the non-zero elements.

Note: Must do this in-place without making a copy of the array.

Example 1:
Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
*/

import java.util.Scanner;

public class MoveZeroes {

    // Method to move all zeros to the end
    public static void moveZeroes(int[] nums) {

        int n = nums.length;
		// index for next non-zero
        int j = 0; 

        // Move all non-zero elements forward
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                j++;
            }
        }

        // Fill remaining positions with zeros
        while (j < n) {
            nums[j] = 0;
            j++;
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

        // Call method
        moveZeroes(nums);

        // Display array
        System.out.println("Array after moving zeroes:");
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }

        input.close();
    }
}
