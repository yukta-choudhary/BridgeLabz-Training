// Check if a number is divisible by 5

import java.util.Scanner;

public class CheckDivisibility{
    public static void main(String[] args){
        
       //Create object of Scanner
        Scanner input = new Scanner(System.in);

        // Create variable number
        int number;
        System.out.println("Enter number to check:  ");
        number= input.nextInt();

        // Check whether number is divisible by 5 and print the result
        
        System.out.println(" Is the number " + number + " divisible by 5? " + (number%5 == 0)
);
        
        //Close Scanner object
        input.close();

    }
}