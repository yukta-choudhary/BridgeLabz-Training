import java.util.Scanner;

public class EmployeeBonus {

    public static void main(String[] args) {

        // Create Scanner object to take input from user
        Scanner input = new Scanner(System.in);

        // Declare variables
        double salary;
        int yearsOfService;
        System.out.print("Enter employee salary: ");
        salary = input.nextDouble();
        System.out.print("Enter years of service: ");
        yearsOfService = input.nextInt();

        // Check eligibility for bonus and calculate 5% bonus
        if (yearsOfService > 5) {
            double bonus = salary * 0.05;
            System.out.println("The bonus amount is " + bonus);
        } else {
            System.out.println("No bonus is applicable");
        }

        // Close scanner
        input.close();
    }
}
