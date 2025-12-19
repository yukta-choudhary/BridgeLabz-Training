import java.util.Scanner;

public class ReverseNumberArray
{
	public static void main(String[] args)
	{
		// Create scanner class object
		Scanner input = new Scanner(System.in);
		
		// Declare number variable
		System.out.println("Enter a number:");
		int number = input.nextInt();
		
		int temp = number;
		int count = 0;
		
		// Find count of digits
		while(temp != 0){
			count++;
			temp = temp / 10;
		}
		
		// Declare array to store digits
		int[] digits = new int[count];
		
		for(int i = 0; i < count; i++){
			digits[i] = number % 10;
			number = number / 10;
		}
		
		int[] reverseArray = new int[count];
		
		for(int i = 0; i < count; i++){
			reverseArray[i] = digits[count - 1 - i];
		}
		
		// Display reversed number
		System.out.println("Reversed number is:");
		for(int i = 0; i < count; i++){
			System.out.print(reverseArray[i]);
		}
		
		// Close Scanner class object
		input.close();
	}
}
