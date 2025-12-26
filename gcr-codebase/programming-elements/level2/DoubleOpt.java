import java.util.Scanner;

public class DoubleOpt {

    public static void main(String[] args) {

        // Create Scanner object to take input
        Scanner input = new Scanner(System.in);

        // Declare double variables
        double a, b, c;
        System.out.print("Enter value of a: ");
        a = input.nextDouble();
        System.out.print("Enter value of b: ");
        b = input.nextDouble();
        System.out.print("Enter value of c: ");
        c = input.nextDouble();

        // Perform double operations
        double result1 = a + b * c;
        double result2 = a * b + c;
        double result3 = c + a / b;
        double result4 = a % b + c;

        // Display results
        System.out.println("The results of Double Operations are " + result1 + ", " + result2 + ", " + result3 + ", and " + result4);

        // Close scanner
        input.close();
    }
}
