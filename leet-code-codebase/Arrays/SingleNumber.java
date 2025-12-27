import java.util.Scanner;

public class SingleNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input array size
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        
        // Input array elements
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        
        int single = 0;
        // XOR all elements, duplicates cancel out
        for (int num : nums) {
            single ^= num;
        }
        
        System.out.println("Single number is: " + single);
        sc.close();
    }
}
