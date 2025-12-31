/*
20. Festival Lucky Draw 🎉
At Diwali mela, each visitor draws a number.
● If the number is divisible by 3 and 5, they win a gift.
● Use if, modulus, and loop for multiple visitors.
● continue if input is invalid.
*/
import java.util.Scanner;

public class FestivalLuckyDraw {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Variable to control loop
        char choice = 'y';

        // Loop for multiple visitors
        while (choice == 'y' || choice == 'Y') {

            System.out.print("Enter your lucky number: ");
            int number = input.nextInt();

            // Check for invalid input
            if (number <= 0) {
                System.out.println("Invalid number! Try again.");
                continue;   // skip rest and go to next visitor
            }

            // Check divisibility by 3 and 5
            if (number % 3 == 0 && number % 5 == 0) {
                System.out.println("Congratulations! You won a gift!");
            } else {
                System.out.println("Sorry! Better luck next time.");
            }

            // Ask for next visitor
            System.out.print("Is there another visitor? (y/n): ");
            choice = input.next().charAt(0);
        }

        System.out.println("Lucky Draw Closed. Happy Diwali!");
    }
}
