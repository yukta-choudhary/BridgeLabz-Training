import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take input for the number
        System.out.print("Enter a number: ");
        long number = input.nextLong();

        // Convert number to string to count digits easily
        String numStr = Long.toString(number);
        int length = numStr.length();

        // Create an array to store digits
        int[] digits = new int[length];
        for (int i = 0; i < length; i++) {
            digits[i] = numStr.charAt(i) - '0'; // Convert char to int
        }


        // Count frequency of each digit
        int[] frequency = new int[10];
        // Count frequency of each digit
        for (int i = 0; i < length; i++) {
            frequency[digits[i]]++;
        }

        // Display the frequency of each digit
        System.out.println("Digit frequencies:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println(i + " occurs " + frequency[i] + " time(s)");
            }
        }

        input.close();
    }
}
