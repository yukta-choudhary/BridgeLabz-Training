/*
Question 976: Largest Perimeter Triangle
Given an integer array nums, return the largest perimeter of a triangle 
with non-zero area, formed from three of these lengths.
If impossible, return 0.
*/

import java.util.Arrays;
import java.util.Scanner;

public class LargestPerimeterTriangle {

    // Method to find largest perimeter
    public static int largestPerimeter(int[] nums) {
        Arrays.sort(nums); // sort in ascending order

        // Check from largest sides
        for (int i = nums.length - 1; i >= 2; i--) {
            int a = nums[i];
            int b = nums[i - 1];
            int c = nums[i - 2];

            // Triangle condition: sum of smaller two > largest
            if (b + c > a) {
                return a + b + c;
            }
        }

        return 0; // no triangle possible
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of sides: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter side lengths:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int result = largestPerimeter(nums);
        System.out.println("Largest Perimeter: " + result);
    }
}
