import java.util.Scanner;

public class IntOperation {

    public static void main(String[] args) {

        // Create Scanner object to take input
        Scanner input = new Scanner(System.in);

        // Create integer variables
        int a, b, c;
        System.out.print("Enter value of a: ");
        a = input.nextInt();
        System.out.print("Enter value of b: ");
        b = input.nextInt();

        System.out.print("Enter value of c: ");
        c = input.nextInt();

        // Perform integer operations
        int result1 = a + (b * c);
        int result2 = (a * b) + c;
        int result3 = c + (a / b);
        int result4 = (a % b) + c;

        // Display results
        System.out.println("The results of Int Operations are " + result1 + ", " + result2 + ", " + result3 + ", and " + result4);

        // Close scanner
        input.close();
    }
}
