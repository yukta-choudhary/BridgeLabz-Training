// Calculate sum of natural numbers using loop

import java.util.Scanner;

public class SumOfNNaturalNumbers{

	//Create method

	public int getSum(int number){
		int sum = 0;
		for(int i = 1; i<=number; i++){
			sum = sum + i;
		}
		return sum;
	}	
	
    public static void main(String[] args){
        
		//Create object of Scanner
        Scanner input = new Scanner(System.in);

        // Create variable
		System.out.println("Enter number: ");
        int number = input.nextInt();
						
		//Create object of class to call method
		SumOfNNaturalNumbers sumNumber = new SumOfNNaturalNumbers(); 
		
		//Call method
		int sum = sumNumber.getSum(number);
				
        //Display result		
		System.out.println("Sum of " + number + " natural numbers are " + sum);
		
        //Close Scanner object
        input.close();

    }
}