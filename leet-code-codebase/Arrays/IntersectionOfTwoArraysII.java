// Question: Find the intersection of two arrays with duplicate counts (LeetCode 350)

import java.util.Scanner;

public class IntersectionOfTwoArraysII {

    // Method to find intersection
    static int[] intersect(int[] nums1, int[] nums2) {

        // Frequency array for values 0 to 1000
        int[] freq = new int[1001];

        // Store frequency of nums1 elements
        for (int i = 0; i < nums1.length; i++) {
            freq[nums1[i]]++;
        }

        // Temporary array to store result
        int[] temp = new int[Math.min(nums1.length, nums2.length)];
        int index = 0;

        // Check nums2 elements
        for (int i = 0; i < nums2.length; i++) {
            if (freq[nums2[i]] > 0) {
                temp[index] = nums2[i];
                index++;
                freq[nums2[i]]--; // reduce count
            }
        }

        // Create result array of exact size
        int[] result = new int[index];
        for (int i = 0; i < index; i++) {
            result[i] = temp[i];
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input first array
        System.out.print("Enter size of nums1: ");
        int n1 = sc.nextInt();
        int[] nums1 = new int[n1];
        System.out.println("Enter nums1 elements:");
        for (int i = 0; i < n1; i++) {
            nums1[i] = sc.nextInt();
        }

        // Input second array
        System.out.print("Enter size of nums2: ");
        int n2 = sc.nextInt();
        int[] nums2 = new int[n2];
        System.out.println("Enter nums2 elements:");
        for (int i = 0; i < n2; i++) {
            nums2[i] = sc.nextInt();
        }

        // Call method
        int[] ans = intersect(nums1, nums2);

        // Print result
        System.out.print("Intersection: ");
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }

        sc.close();
    }
}
