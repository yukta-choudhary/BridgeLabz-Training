import java.util.Scanner;

public class SquareSide {

    public static void main(String[] args) {

        // Create Scanner object to take input from user
        Scanner input = new Scanner(System.in);

        // Create variable for perimeter
        float perimeter;
        System.out.print("Enter the perimeter of the square: ");
        perimeter = input.nextFloat();

        // Calculate side of the square
        // Perimeter = 4 * side
        float side = perimeter / 4;

        // Display result
        System.out.println("The length of the side is " + side +" whose perimeter is " + perimeter);

        // Close scanner
        input.close();
    }
}
