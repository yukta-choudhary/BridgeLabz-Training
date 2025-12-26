import java.util.Scanner;

public class FizzBuzzArray
{
	public static void main(String[] args)
	{
		// Create scanner class object
		Scanner input = new Scanner(System.in);
		
		// Declare variable number
		System.out.println("Enter a positive number:");
		int number = input.nextInt();
		
		// Check for positive number
		if(number <= 0){
			System.err.println("Invalid number");
			System.exit(0);
		}
		
		// Declare String array
		String[] result = new String[number + 1];
		
		// Store FizzBuzz values
		for(int i = 1; i <= number; i++){
			if(i % 3 == 0 && i % 5 == 0){
				result[i] = "FizzBuzz";
			}else if(i % 3 == 0){
				result[i] = "Fizz";
			}else if(i % 5 == 0){
				result[i] = "Buzz";
			}else{
				result[i] = String.valueOf(i);
			}
		}
		
		// Display array elements
		for(int i = 1; i <= number; i++){
			System.out.println("Position " + i + " = " + result[i]);
		}
		
		// Close Scanner class object
		input.close();
	}
}
