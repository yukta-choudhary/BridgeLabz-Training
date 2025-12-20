// Find the smallest and the largest of the numbers

import java.util.Scanner;

public class CompareNumbers{

	//Create method

	public static int[] findSmallestAndLargest(int number1, int number2, int number3){
		int[] compare = new int[2];
		compare[0] = Math.min(number1, Math.min(number2, number3));
		compare[1] = Math.max(number1, Math.max(number2, number3));
		return compare;
	}	
	
    public static void main(String[] args){
        
		//Create object of Scanner
        Scanner input = new Scanner(System.in);

        // Create variable
		System.out.println("Enter number1: ");
        int number1 = input.nextInt();
		
		System.out.println("Enter number2: ");
        int number2 = input.nextInt();

		System.out.println("Enter number3: ");
        int number3 = input.nextInt();
		
		//Call method
		int[] result = findSmallestAndLargest(number1, number2, number3);

        //Display result		
		System.out.println("The smallest of the three numbers is " + result[0] + "\nThe largest of the three numbers is " + result[1]);
		
        //Close Scanner object
        input.close();

    }
}