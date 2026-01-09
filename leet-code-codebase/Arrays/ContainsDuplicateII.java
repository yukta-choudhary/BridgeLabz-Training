// Question: Check if array contains duplicate elements within distance k (LeetCode 219)

import java.util.Scanner;

public class ContainsDuplicateII {

    // Method to check duplicates within k distance
    static boolean containsNearbyDuplicate(int[] nums, int k) {

        // Compare each element with next elements within k range
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length && j <= i + k; j++) {
                // If same value found
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false; // No such pair found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take array size
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        // Take array elements
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Take k value
        System.out.print("Enter k: ");
        int k = sc.nextInt();

        // Call method and print result
        boolean result = containsNearbyDuplicate(nums, k);
        System.out.println("Result: " + result);

        sc.close();
    }
}
