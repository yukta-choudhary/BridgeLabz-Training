import java.util.Scanner;

public class CalculatorUsingSwitch{

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Declare variable for first, second and Op
        double first, second;
		char Op;
        System.out.print("Enter first number: ");
        first = input.nextDouble();
		System.out.print("Enter second number: ");
        second = input.nextDouble();
		System.out.print("Enter operator(+,-,*,/): ");
        Op = input.next().charAt(0);

        // Perform operations using switch case
		switch(Op){
			case '+':
				System.out.println("Answer is " + (first+second));
				break;
			case '-':
				System.out.println("Answer is " + (first-second));
				break;
			case '*':
				System.out.println("Answer is " + (first*second));
				break;
			case '/':
				System.out.println("Answer is " + (first/second));
				break;
			default:
				System.out.println("Invalid Operator");

		}

        // Close scanner
        input.close();
    }
}
