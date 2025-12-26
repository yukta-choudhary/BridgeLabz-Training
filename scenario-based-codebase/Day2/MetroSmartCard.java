/*
Metro Smart Card Fare Deduction
- Ask for distance
- Calculate fare using ternary operator
- Deduct from smart card balance
- Loop until balance is exhausted or user quits
*/

import java.util.Scanner;

public class MetroSmartCard {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Initial smart card balance
        System.out.print("Enter initial smart card balance: ");
        double balance = input.nextDouble();

        while (true) {

            System.out.println("\nCurrent balance: " + balance);

            // Exit option
            System.out.print("Enter travel distance in km (or -1 to quit): ");
            int distance = input.nextInt();

            if (distance == -1) {
                System.out.println("Exiting metro system.");
                break;
            }

            // Fare calculation using ternary operator
            double fare = (distance <= 5) ? 10 : (distance <= 10 ? 20 : 30);

            // Check if balance is sufficient
            if (fare > balance) {
                System.out.println("Insufficient balance! Please recharge.");
                continue;
            }

            // Deduct fare
            balance -= fare;
            System.out.println("Fare " + fare + " deducted. Remaining balance: " + balance);

            // Check if balance is exhausted
            if (balance <= 0) {
                System.out.println("Balance exhausted. Please recharge.");
                break;
            }
        }

        input.close();
    }
}
