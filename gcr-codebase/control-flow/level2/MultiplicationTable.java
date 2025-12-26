import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {

        // Create Scanner object to take input from user
        Scanner input = new Scanner(System.in);

        // Declare variable
        int number;
        System.out.print("Enter a number: ");
        number = input.nextInt();

        // Print multiplication table from 6 to 9
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }

        // Close scanner
        input.close();
    }
}
