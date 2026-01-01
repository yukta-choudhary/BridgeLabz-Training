/*
Question 728: Self Dividing Numbers
A self-dividing number is divisible by every digit it contains and cannot contain 0.
Given two integers left and right, print all self-dividing numbers in the range [left, right].
*/

import java.util.Scanner;

public class SelfDividingNumbers {


    // Check if a number is self-dividing
    public static boolean isSelfDividing(int num) {
        int temp = num;

        while (temp > 0) {
            int digit = temp % 10;
            if (digit == 0 || num % digit != 0) {
                return false; // not self-dividing
            }
            temp /= 10;
        }
        return true;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter left: ");
        int left = sc.nextInt();

        System.out.print("Enter right: ");
        int right = sc.nextInt();

        System.out.println("Self-Dividing Numbers:");
        // Loop through range
        for (int i = left; i <= right; i++) {
            if (isSelfDividing(i)) {
                System.out.print(i + " "); // print directly
            }
        }
    }
}
