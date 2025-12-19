import java.util.Scanner;

public class MultiplicationResult
{
	public static void main(String[] args)
	{
		// Create scanner class object
		Scanner input = new Scanner(System.in);
		
		//Declare array and a variable number
		int number;
		System.out.println("Enter the number: ");
		number = input.nextInt();

		int[] multiplicationResult = new int[4];
		
		System.out.println("Enter the number: ");
		
		//Calculate multiplication result from 6 to 9
		for(int i = 0; i<4; i++){
			multiplicationResult[i] = number*(i+6);
		}
		
		//Display Result
		for(int i = 0; i<4; i++){
			System.out.println(number + " * " + (i+6) + " = " + multiplicationResult[i]);
		}

		//Close Scanner class object
        input.close();
    }
}