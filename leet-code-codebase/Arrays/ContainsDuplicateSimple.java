/*
Question 217: Contains Duplicate (Without HashSet)

Given an integer array nums,
return true if any value appears at least twice in the array.
Return false if every element is distinct.

Example:
Input: nums = [1,2,3,1]
Output: true
*/

class ContainsDuplicateSimple {

    public static boolean containsDuplicate(int[] nums) {

        // Compare every element with all next elements
        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {

                // If same elements found
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }

        // No duplicate found
        return false;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4};
        boolean result = containsDuplicate(nums);
        System.out.println(result);
    }
}
