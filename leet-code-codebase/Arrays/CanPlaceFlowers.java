/*
Question: 605. Can Place Flowers
Task: Check if n flowers can be planted.
Rule: No two flowers can be adjacent.
Logic: Place flower only if left and right plots are empty.
*/

import java.util.Scanner;

public class CanPlaceFlowers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input size of flowerbed
        int size = sc.nextInt();

        // Input flowerbed array
        int[] flowerbed = new int[size];
        for (int i = 0; i < size; i++) {
            flowerbed[i] = sc.nextInt();
        }

        // Input number of flowers to plant
        int n = sc.nextInt();

        // Check planting possibility
        boolean result = canPlace(flowerbed, n);

        // Output result
        System.out.println(result);

        sc.close();
    }

    // Method to check planting
    static boolean canPlace(int[] bed, int n) {

        for (int i = 0; i < bed.length; i++) {

            // Check if plot is empty
            if (bed[i] == 0) {

                // Check left and right plots
                boolean left = (i == 0 || bed[i - 1] == 0);
                boolean right = (i == bed.length - 1 || bed[i + 1] == 0);

                // Place flower if safe
                if (left && right) {
                    bed[i] = 1;
                    n--;
                }
            }

            // If all flowers planted
            if (n <= 0) {
                return true;
            }
        }

        return false;
    }
}
