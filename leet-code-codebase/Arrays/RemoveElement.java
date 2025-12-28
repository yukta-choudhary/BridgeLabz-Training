/*
Question 27: Remove Element

Given an integer array nums and an integer val,
remove all occurrences of val in nums in-place.
The order of the elements may be changed.

Return the number of elements in nums which are not equal to val.

After removal:
- The first k elements of nums should contain elements not equal to val
- The remaining elements do not matter

*/

class RemoveElement {
    public static int removeElement(int[] nums, int val) {

        int index = 0; 

        // Traverse the array
        for (int i = 0; i < nums.length; i++) {

            // If current element is not equal to val
            if (nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }

        // index represents count of elements not equal to val
        return index;
    }

    public static void main(String[] args) {

        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;

        int k = removeElement(nums, val);

        System.out.println("k = " + k);

        // Print first k elements
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
