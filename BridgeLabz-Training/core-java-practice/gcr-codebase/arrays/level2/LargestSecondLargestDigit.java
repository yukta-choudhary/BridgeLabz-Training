import java.util.Scanner;

public class LargestSecondLargestDigit
{
	public static void main(String[] args)
	{
		// Create scanner class object
		Scanner input = new Scanner(System.in);
		
		// Declare number variable
		System.out.println("Enter a number:");
		int number = input.nextInt();
		
		// Declare array to store digits
		int maxDigit = 10;
		int[] digits = new int[maxDigit];
		int index = 0;
		
		while(number != 0){
			digits[index] = number % 10;
			number = number / 10;
			index++;
			
			if(index == maxDigit){
				break;
			}
		}
		
		// Find largest and second largest
		// Declare largest and second largest
		int largest = 0;
		int secondLargest = 0;
				for(int i = 0; i < index; i++){
			if(digits[i] > largest){
				secondLargest = largest;
				largest = digits[i];
			}else if(digits[i] > secondLargest && digits[i] != largest){
				secondLargest = digits[i];
			}
		}
		
		// Display result
		System.out.println("Largest digit: " + largest);
		System.out.println("Second largest digit: " + secondLargest);
		
		// Close Scanner class object
		input.close();
	}
}
