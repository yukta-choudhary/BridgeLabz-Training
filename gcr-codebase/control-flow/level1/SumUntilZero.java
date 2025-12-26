// Find the sum of numbers until the user enters 0


import java.util.Scanner;

public class SumUntilZero{
    public static void main(String[] args){
        
       //Create object of Scanner
        Scanner input = new Scanner(System.in);

        // Create variable total, number
		int number;
		double total = 0.0;
        System.out.print("Enter number: ");
		number = input.nextInt();
		
        // Check if number is equal to 0 if no then add the number to the total else print total
        if(number != 0){
			while(number != 0){
				total = total + number;
				System.out.print("Enter number again: ");
				number = input.nextInt();
			}
		}
		System.out.println("The total sum is " + total);

        
        //Close Scanner object
        input.close();

    }
}