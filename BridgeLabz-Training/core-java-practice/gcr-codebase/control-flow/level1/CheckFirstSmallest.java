// Check if the first is the smallest of the 3 numbers

import java.util.Scanner;

public class CheckFirstSmallest{
    public static void main(String[] args){
        
       //Create object of Scanner
        Scanner input = new Scanner(System.in);

        // Create variable number1, number2, number3
        int number1, number2, number3;
        System.out.println("Enter number1:  ");
        number1= input.nextInt();
		System.out.println("Enter number2:  ");
        number2= input.nextInt();
		System.out.println("Enter number3:  ");
        number3= input.nextInt();

        // Check if the first is the smallest of the 3 numbers
        
        System.out.println("Is the first number the smallest? " + (number1 < number2 && number1 < number3));
        
        //Close Scanner object
        input.close();

    }
}