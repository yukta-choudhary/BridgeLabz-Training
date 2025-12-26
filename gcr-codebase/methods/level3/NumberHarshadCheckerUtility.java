import java.util.Scanner;

public class NumberHarshadCheckerUtility {

    // Count the number of digits
    public static int countDigits(int number) {
        int count = 0;
        int temp = number;
        while (temp > 0) {
            count++;
            temp /= 10;
        }
        return count;
    }

    // Store digits in an array
    public static int[] getDigits(int number, int count) {
        int[] digits = new int[count];
        int temp = number;
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = temp % 10;
            temp /= 10;
        }
        return digits;
    }

    // Find sum of digits
    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int i = 0; i < digits.length; i++) {
            sum += digits[i];
        }
        return sum;
    }

    // Find sum of squares of digits
    public static int sumOfSquares(int[] digits) {
        int sum = 0;
        for (int i = 0; i < digits.length; i++) {
            sum += Math.pow(digits[i], 2);
        }
        return sum;
    }

    // Check if number is Harshad number
    public static boolean isHarshad(int number, int[] digits) {
        int sum = sumOfDigits(digits);
        return number % sum == 0;
    }

    // Find frequency of each digit
    public static int[][] digitFrequency(int[] digits) {
        int[][] freq = new int[10][2]; 
        for (int i = 0; i < 10; i++) {
            freq[i][0] = i;
            freq[i][1] = 0;
        }

        for (int i = 0; i < digits.length; i++) {
            freq[digits[i]][1]++;
        }
        return freq;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take number input from user
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int count = countDigits(number); 
        int[] digits = getDigits(number, count); 

        // Display number and digits
        System.out.println("Number: " + number);
        System.out.println("Digits count: " + count);
        System.out.print("Digits array: ");
        for (int i = 0; i < digits.length; i++) {
            System.out.print(digits[i] + " ");
        }
        System.out.println();

        // Sum and sum of squares
        System.out.println("Sum of digits: " + sumOfDigits(digits));
        System.out.println("Sum of squares of digits: " + sumOfSquares(digits));

        // Check Harshad number
        System.out.println("Is Harshad Number: " + isHarshad(number, digits));

        // Digit frequency
        int[][] freq = digitFrequency(digits);
        System.out.println("Digit Frequency:");
        for (int i = 0; i < freq.length; i++) {
            if (freq[i][1] > 0) {
                System.out.println("Digit " + freq[i][0] + " = " + freq[i][1]);
            }
        }
    }
}
