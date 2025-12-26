import java.util.Scanner;

public class CalculateHandshake {

    public static void main(String[] args) {

        // Create Scanner object to take input from user
        Scanner input = new Scanner(System.in);

        // Create variable for number of students
        int numberOfStudents;
        System.out.print("Enter number of students: ");
        numberOfStudents = input.nextInt();

        // Calculate maximum number of handshakes
        // Formula: n * (n - 1) / 2
        int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        // Display result
        System.out.println(
            "The maximum number of possible handshakes is " + handshakes
        );

        // Close scanner
        input.close();
    }
}
