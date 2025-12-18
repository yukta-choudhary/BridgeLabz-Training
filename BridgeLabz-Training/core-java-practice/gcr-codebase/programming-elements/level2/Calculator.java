import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        // Create Scanner object to take input from user
        Scanner input = new Scanner(System.in);

        // Declare floating point variables
        float number1, number2;
        System.out.print("Enter first number: ");
        number1 = input.nextFloat();
        System.out.print("Enter second number: ");
        number2 = input.nextFloat();

        // Perform arithmetic operations
        float addition = number1 + number2;
        float subtraction = number1 - number2;
        float multiplication = number1 * number2;
        float division = number1 / number2;

        // Display results
        System.out.println(
            "The addition, subtraction, multiplication and division value of 2 numbers " + number1 + " and " + number2 + " is "+ addition + ", " + subtraction + ", " + multiplication + ", and " + division);

        // Close scanner
        input.close();
    }
}
