// Check for the natural number and write the sum of n natural numbers

import java.util.Scanner;

public class CheckNaturalNumber{
    public static void main(String[] args){
        
       //Create object of Scanner
        Scanner input = new Scanner(System.in);

        // Create variable number, sumOfNumbers;
        int number;
		double sumOfNumbers;
        System.out.print("Enter number:  ");
        number= input.nextInt();

        // Check whether number is natural number or not. If yes then calculate sum of n natural number natural
        if(number>=0){
			sumOfNumbers = (double)((number)*(number+1))/(double)2;
			System.out.println("The sum of " + number + " natural numbers is " + sumOfNumbers);
		}else{
			System.out.println("The number " + number + " is not a natural number ");
		}
        
        //Close Scanner object
        input.close();

    }
}