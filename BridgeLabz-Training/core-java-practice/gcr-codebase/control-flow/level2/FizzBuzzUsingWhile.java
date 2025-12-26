import java.util.Scanner;

public class FizzBuzzUsingWhile {

    public static void main(String[] args) {

        // Create Scanner object to take input
        Scanner input = new Scanner(System.in);

        // Declare variable
        int number;
        System.out.print("Enter a positive integer: ");
        number = input.nextInt();

        // Check if the number is positive. If yes then for multiples of 3 print Fizz and multiples of 5 print Buzz and for multiples of both print FizzBuzz. Use while loop
        if (number > 0) {
            int i = 1; // Initialize counter
            while (i <= number) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } 
                else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } 
                else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } 
                else {
                    System.out.println(i);
                }
                i++;
            }
        } else {
            System.out.println("The number " + number + " is not a positive integer");
        }

        // Close scanner
        input.close();
    }
}
