import java.util.Scanner;

public class NumberUtilityAbundant {

    // Find sum of proper divisors
    public static int sumOfDivisors(int number) {
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    // Check if number is perfect
    public static boolean isPerfect(int number) {
        return sumOfDivisors(number) == number;
    }

    // Check if number is abundant
    public static boolean isAbundant(int number) {
        return sumOfDivisors(number) > number;
    }

    // Check if number is deficient
    public static boolean isDeficient(int number) {
        return sumOfDivisors(number) < number;
    }

    // Factorial of a digit
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    // Check if number is strong
    public static boolean isStrong(int number) {
        int sum = 0;
        int temp = number;
        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        return sum == number;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take number input from user
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        System.out.println("Number: " + number);
        System.out.println("Is Perfect: " + isPerfect(number));
        System.out.println("Is Abundant: " + isAbundant(number));
        System.out.println("Is Deficient: " + isDeficient(number));
        System.out.println("Is Strong: " + isStrong(number));
    }
}
