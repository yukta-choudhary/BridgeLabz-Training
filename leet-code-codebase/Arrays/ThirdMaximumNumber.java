/* 
414. Third Maximum Number

Given an integer array nums, return the third distinct maximum number.
If the third maximum does not exist, return the maximum number.

Example 1:
Input: nums = [3,2,1]
Output: 1

Example 2:
Input: nums = [1,2]
Output: 2

Example 3:
Input: nums = [2,2,3,1]
Output: 1
*/

import java.util.Scanner;

public class ThirdMaximumNumber {

    // Method to find third maximum
    static int thirdMax(int[] nums) {

        Long first = null;
        Long second = null;
        Long third = null;

        for (int i = 0; i < nums.length; i++) {

            long num = nums[i];

            // Skip duplicate values
            if ((first != null && num == first) ||
                (second != null && num == second) ||
                (third != null && num == third)) {
                continue;
            }

            if (first == null || num > first) {
                third = second;
                second = first;
                first = num;
            }
            else if (second == null || num > second) {
                third = second;
                second = num;
            }
            else if (third == null || num > third) {
                third = num;
            }
        }

        // If third max exists return it, else return first max
        if (third == null) {
            return first.intValue();
        }

        return third.intValue();
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Array size
        System.out.print("Enter array size: ");
        int n = input.nextInt();

        int[] nums = new int[n];

        // Input array
        System.out.println("Enter elements:");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = input.nextInt();
        }

        // Call method
        int result = thirdMax(nums);

        // Output
        System.out.println("Third maximum number: " + result);

        input.close();
    }
}
