/* 
3024. Type of Triangle

You are given a 0-indexed integer array nums of size 3 which can form the sides of a triangle.

A triangle is called:
- equilateral if all sides are equal
- isosceles if exactly two sides are equal
- scalene if all sides are different

Return the type of triangle or "none" if it cannot form a triangle.

Example 1:
Input: nums = [3,3,3]
Output: "equilateral"

Example 2:
Input: nums = [3,4,5]
Output: "scalene"
*/

import java.util.Scanner;

public class TypeOfTriangle {

    // Method to check triangle type
    static String triangleType(int[] nums) {

        int a = nums[0];
        int b = nums[1];
        int c = nums[2];

        // Check triangle validity
        if (a + b <= c || a + c <= b || b + c <= a) {
            return "none";
        }

        // Check triangle type
        if (a == b && b == c) {
            return "equilateral";
        }
        else if (a == b || b == c || a == c) {
            return "isosceles";
        }
        else {
            return "scalene";
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] nums = new int[3];

        // Input sides
        System.out.println("Enter three sides:");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = input.nextInt();
        }

        // Call method
        String result = triangleType(nums);

        // Output
        System.out.println("Triangle type: " + result);

        input.close();
    }
}
