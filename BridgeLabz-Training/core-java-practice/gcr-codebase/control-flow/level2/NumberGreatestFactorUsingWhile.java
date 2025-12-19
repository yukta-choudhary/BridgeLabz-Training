import java.util.Scanner;

public class NumberGreatestFactorUsingWhile {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Declare variables for number and greatestFactor
        int number, greatestFactor = 1;
        System.out.print("Enter number: ");
        number = input.nextInt();

        // Find factors using for loop if number is positive
		if(number == 0){
			System.out.println("0 has no greatest factor.");

		}
		else if(number > 0){
			int counter = number - 1;
			while(counter>=1){
				if(number%counter == 0){
					greatestFactor = counter;
					break;
				}
				counter = counter -1;
			}
			System.out.println("The greatest factor " + number + " is " + greatestFactor);

		}else{
			System.out.println("It's a negative number.");

		}

        // Close scanner
        input.close();
    }
}
