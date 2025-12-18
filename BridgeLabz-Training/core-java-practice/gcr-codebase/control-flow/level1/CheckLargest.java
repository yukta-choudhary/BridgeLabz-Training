// Check if the first, second, or third number is the largest of the three

import java.util.Scanner;

public class CheckLargest{
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

        // Check if the first, second, or third number is the largest of the three and print the result
        
        System.out.println("Is the first number the largest? " + (number1 > number2 && number1 > number3) + "\nIs the second number the largest? " + (number2 > number3 && number2 > number1) + "\nIs the third number the largest? " + (number3 > number1 && number3 > number2));
        
        //Close Scanner object
        input.close();

    }
}