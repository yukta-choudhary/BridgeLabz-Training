/*
Question 88: Merge Sorted Array

You are given two integer arrays nums1 and nums2,
sorted in non-decreasing order, and two integers m and n.

- nums1 has size m + n
- First m elements of nums1 are valid
- Last n elements of nums1 are 0 (extra space)
- nums2 has n elements

Merge nums2 into nums1 so that nums1 becomes a single
sorted array in non-decreasing order.

Do NOT return the array.
Modify nums1 in-place.

Example:
Input:
nums1 = [1,2,3,0,0,0], m = 3
nums2 = [2,5,6], n = 3

Output:
[1,2,2,3,5,6]
*/

class MergeSortedArray {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int i = m - 1;          // last valid index of nums1
        int j = n - 1;          // last index of nums2
        int k = m + n - 1;      // last index of nums1 (total size)

        // Merge from the end
        while (i >= 0 && j >= 0) {

            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }

        // Copy remaining elements of nums2 
        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }
    public static void main(String[] args) {

        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;

        int[] nums2 = {2, 5, 6};
        int n = 3;
        merge(nums1, m, nums2, n);

        // Print merged array
        for (int i = 0; i < nums1.length; i++) {
            System.out.print(nums1[i] + " ");
        }
    }
}
