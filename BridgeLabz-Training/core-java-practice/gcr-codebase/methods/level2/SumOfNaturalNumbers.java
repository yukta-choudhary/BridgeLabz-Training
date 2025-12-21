import java.util.Scanner;

public class SumOfNaturalNumbers {

    // Recursive method to find sum
    public static int sumByRecursion(int n) {
        if (n == 0) {
            return 0;
        }
        return n + sumByRecursion(n - 1);
    }

    // Method using formula
    public static int sumByFormula(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = input.nextInt();

        // Check for natural number
        if (n <= 0) {
            System.out.println("Please enter a natural number");
        } else {

            int sumRecursion = sumByRecursion(n);
            int sumFormula = sumByFormula(n);

            System.out.println("Sum using recursion: " + sumRecursion);
            System.out.println("Sum using formula: " + sumFormula);

            // Compare results
            if (sumRecursion == sumFormula) {
                System.out.println("Both results are correct and equal");
            } else {
                System.out.println("Results are not equal");
            }
        }

        input.close();
    }
}
