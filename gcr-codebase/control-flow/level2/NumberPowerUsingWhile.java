import java.util.Scanner;

public class NumberPowerUsingWhile {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Declare variable for number, power , counter and result
        int number, power, counter = 0, result = 1;
        System.out.print("Enter number: ");
        number = input.nextInt();
		System.out.print("Enter power: ");
        power = input.nextInt();

        // Calculate power of the number using while loop 
		if(number == 0){
			System.out.println("The result is 0 ");

		}
		else if(number > 0 ){
			while(counter<power){
				result = result * number;
				counter = counter + 1;
			}
			System.out.println("The result is " + result);


		}else{
			System.out.println("It's a negative number.");

		}

        // Close scanner
        input.close();
    }
}
