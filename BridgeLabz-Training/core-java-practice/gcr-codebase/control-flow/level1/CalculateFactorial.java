// Find the factorial of an integer entered by the user
import java.util.Scanner;

public class CalculateFactorial{
    public static void main(String[] args){
        
       //Create object of Scanner
        Scanner input = new Scanner(System.in);

        // Create variable number
		int number, factorial = 1;
        System.out.print("Enter number: ");
		number = input.nextInt();
		
        // Check if number is positive. If yes then calculate its factorial
        if(number>=0){
			for(int i = number; i>=1; i--){
					factorial = factorial * i;
			}			
			System.out.println("The factorial of the number " + number + " is " + factorial);
			
		}else{
			System.out.println("The number is " + number + " not a positive number");
		}

        //Close Scanner object
        input.close();

    }
}