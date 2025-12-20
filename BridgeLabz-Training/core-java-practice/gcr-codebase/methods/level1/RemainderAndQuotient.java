// Find the remainder and quotient

import java.util.Scanner;

public class RemainderAndQuotient{

	//Create method

	public static int[] findRemainderAndQuotient(int number, int divisor){
		int[] result = new int[2];
		result[0] = number/divisor;
		result[1] = number % divisor;
		return result;
	}	
	
    public static void main(String[] args){
        
		//Create object of Scanner
        Scanner input = new Scanner(System.in);

        // Create variable
		System.out.println("Enter number: ");
        int number = input.nextInt();
		
		System.out.println("Enter divisor: ");
        int divisor = input.nextInt();
		
		//Call method
		int[] result = findRemainderAndQuotient(number, divisor);

        //Display result		
		System.out.println("The remainder is " + result[0] + "\nThe divisor is " + result[1]);
		
        //Close Scanner object
        input.close();

    }
}