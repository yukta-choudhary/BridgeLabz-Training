import java.util.Scanner;

public class CheckArmstrongNumber
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int number = input.nextInt();
		int sum = 0;
		int originalNumber = number;
		
		//Check condition
		while (originalNumber !=0)
		{
			int digit = originalNumber % 10;

            sum = sum + (digit * digit * digit);
            originalNumber = originalNumber / 10;
        }

        if (sum == number) 
		{
            System.out.println(number + " is an Armstrong Number");
        } 
		else 
		{
            System.out.println(number + " is NOT an Armstrong Number");
        }

        input.close();
    }
}