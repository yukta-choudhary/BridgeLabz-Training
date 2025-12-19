import java.util.Scanner;

public class NumberGreatestFactor {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Declare variables for number and greatestFactor
        int number, greatestFactor = 1;
        System.out.print("Enter number: ");
        number = input.nextInt();

        // Find factors using for loop if number is positive
		if(number == 0){
			System.out.println("The greatest factor of " + number + " is 0 ");

		}
		else if(number > 0){
			for(int i=number-1; i>=1; i--){
				if(number%i == 0){
					greatestFactor = i;
					break;
				}
			}
			System.out.println("The greatest factor " + number + " is " + greatestFactor);

		}else{
			System.out.println("It's a negative number.");

		}

        // Close scanner
        input.close();
    }
}
