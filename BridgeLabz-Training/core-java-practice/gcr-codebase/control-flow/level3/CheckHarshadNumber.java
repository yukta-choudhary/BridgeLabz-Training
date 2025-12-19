import java.util.Scanner;

public class CheckHarshadNumber
{
	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);
		
		//Create Variable number, originalNumber and sum
		System.out.print("Enter a number to check: ");
		int number = input.nextInt();
		int sum = 0;
		int originalNumber = number;

        //Find sum of digits using while loop and check harshad condition
        while (originalNumber != 0) {
            int digit = originalNumber % 10;                
            sum = sum + digit;                             
            originalNumber = originalNumber / 10;         
        }
        if (number % sum == 0) {
            System.out.println(number + " is a Harshad Number");
        } else {
            System.out.println(number + " is NOT a Harshad Number");
        }

        input.close();
    }
}