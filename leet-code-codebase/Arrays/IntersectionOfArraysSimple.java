/*
Intersection of Two Arrays

Given two integer arrays nums1 and nums2, return an array of their intersection. 
Each element in the result must be unique and you may return the result in any order.

Example 1:
Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]

*/

import java.util.Scanner;

public class IntersectionOfArraysSimple {

    // Method to find intersection of two arrays
    static int[] intersection(int[] nums1, int[] nums2) {

        int[] temp = new int[nums1.length]; // temporary storage
        int count = 0;

        for (int i = 0; i < nums1.length; i++) {
            boolean unique = true;
            // Check if already added
            for (int k = 0; k < count; k++) {
                if (temp[k] == nums1[i]) {
                    unique = false;
                    break;
                }
            }
            if (!unique) continue;

            // Check if element is in nums2
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    temp[count] = nums1[i];
                    count++;
                    break;
                }
            }
        }

        // Copy to result array of proper size
        int[] result = new int[count];
        for (int i = 0; i < count; i++) {
            result[i] = temp[i];
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Input first array
        System.out.print("Enter size of first array: ");
        int n1 = input.nextInt();
        int[] nums1 = new int[n1];
        System.out.println("Enter elements of first array:");
        for (int i = 0; i < n1; i++) {
            nums1[i] = input.nextInt();
        }

        // Input second array
        System.out.print("Enter size of second array: ");
        int n2 = input.nextInt();
        int[] nums2 = new int[n2];
        System.out.println("Enter elements of second array:");
        for (int i = 0; i < n2; i++) {
            nums2[i] = input.nextInt();
        }

        // Call method
        int[] result = intersection(nums1, nums2);

        // Output
        System.out.println("Intersection array:");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }

        input.close();
    }
}
