// Check whether a number is positive, negative, or zero.

import java.util.Scanner;

public class CheckPositive{
    public static void main(String[] args){
        
       //Create object of Scanner
        Scanner input = new Scanner(System.in);

        // Create variable number
        int number;
        System.out.print("Enter number:  ");
        number= input.nextInt();

        // Check whether number is positive, negative or zero 
        if(number == 0){
			System.out.println("The number " + number + " is zero");
		}else if(number>0){
			System.out.println("The number " + number + " is positive");
		}else{
			System.out.println("The number " + number + " is negative");
		}
        
        //Close Scanner object
        input.close();

    }
}