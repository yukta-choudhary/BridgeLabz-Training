// Find the sum of n natural numbers using while loop compare the result with the formulae n*(n+1)/2 and show the result from both computations was correct. 

import java.util.Scanner;

public class CompareComputations{
    public static void main(String[] args){
        
       //Create object of Scanner
        Scanner input = new Scanner(System.in);

        // Create variable sumWhile, number, sumFormulae
		int number, sumWhile = 0, sumFormulae = 0;
        System.out.print("Enter number: ");
		number = input.nextInt();
		
        // Check if number is a natural number. Is yes then calculate sum using while and formulae.
        if(number>=0){
			sumFormulae = (number*(number+1))/2;
			int i = number;
			while(i!=0){
					sumWhile = sumWhile + i;
					i = i - 1;
			}			
			System.out.println("The sum from while loop and formulae is same? " + (sumWhile == sumFormulae) + "The sum is " + sumWhile);
			
		}else{
			System.out.println("The number is " + number + "not a Natural Number");
		}

        //Close Scanner object
        input.close();

    }
}