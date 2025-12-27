//Remove duplicates from sorte array

import java.util.Scanner;
import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input array size
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        
        // Input array elements
        System.out.println("Enter sorted elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        
        int k = removeDuplicates(nums);
        
        System.out.println("Number of unique elements: " + k);
        System.out.println("Array after removing duplicates: " + Arrays.toString(Arrays.copyOf(nums, k)));
        sc.close();
    }
    
    // Function to remove duplicates in-place
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        
        int i = 0; // slow pointer
        
        for (int j = 1; j < nums.length; j++) { 
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j]; 
            }
        }
        
        return i + 1; 
    }
}
