// Find the sum of numbers until the user enters 0

import java.util.Scanner;

public class SumUntilZeroNegative{
    public static void main(String[] args){
        
       //Create object of Scanner
        Scanner input = new Scanner(System.in);

        // Create variable total, number
		int number;
		double total = 0.0;
        System.out.print("Enter number: ");
		number = input.nextInt();
		
        // Find the sum until the user enters 0 or a negative number using while loop and break statement
        while(true){
				total = total + number;
				System.out.print("Enter number again: ");
				number = input.nextInt();
				if(number == 0 || number < 0){
					break;
				}
		}
		System.out.println("The total sum is " + total);

        //Close Scanner object
        input.close();

    }
}