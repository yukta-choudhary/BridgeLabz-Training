/*
	509. Fibonacci Number

	The Fibonacci numbers form a sequence such that:
	F(0) = 0
	F(1) = 1
	F(n) = F(n - 1) + F(n - 2), for n > 1

	Given n, calculate F(n).

	Example 1:
	Input: n = 2
	Output: 1
*/

import java.util.Scanner;

public class FibonacciNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter n: ");
        int n = input.nextInt();

        int a = 0;   // F(0)
        int b = 1;   // F(1)
        int fib = 0;

        // If n is 0
        if (n == 0) {
            fib = 0;
        }
        // If n is 1
        else if (n == 1) {
            fib = 1;
        }
        // Calculate Fibonacci for n > 1
        else {
            for (int i = 2; i <= n; i++) {
                fib = a + b;
                a = b;
                b = fib;
            }
        }

        // Output
        System.out.println("Fibonacci Number = " + fib);

        input.close();
    }
}
