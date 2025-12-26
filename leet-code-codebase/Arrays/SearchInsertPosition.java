/* 35. Search Insert Position - Given a sorted array of distinct integers
and a target value, return the index if the target is found. 
If not, return the index where it would be if it were inserted in order.
You must write an algorithm with O(log n) runtime complexity.

Example 1:

Input: nums = [1,3,5,6], target = 5
Output: 2
Example 2:

Input: nums = [1,3,5,6], target = 2
Output: 1
Example 3:

Input: nums = [1,3,5,6], target = 7
Output: 4

*/

import java.util.Scanner;

public class SearchInsertPosition {

    // Method to find index or insert position
    static int searchInsert(int[] nums, int target) {

        int start = 0;
        int end = nums.length - 1;

        // Binary Search
        while (start <= end) {

            int mid = (start + end) / 2;

            if (nums[mid] == target) {
                return mid;   // target found
            }
            else if (nums[mid] < target) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }

        // target not found, return insert position
        return start;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Array size
        System.out.print("Enter array size: ");
        int n = input.nextInt();

        int[] nums = new int[n];

        // Input sorted array
        System.out.println("Enter sorted elements:");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = input.nextInt();
        }

        // Target value
        System.out.print("Enter target value: ");
        int target = input.nextInt();

        // Call method
        int result = searchInsert(nums, target);

        // Output
        System.out.println("Output index: " + result);

        input.close();
    }
}
