import java.util.Scanner;

public class MultiplicationTable
{
	public static void main(String[] args)
	{
		// Create scanner class object
		Scanner input = new Scanner(System.in);
		
		//Declare array and a variable number
		System.out.println("Enter the number: ");
		int number = input.nextInt();
		int[] table = new int[10];
		for (int i = 0; i < 10 ; i++) {
            table[i] = number * (i+1);
		}
		
		//Print multiplication table
		for (int i = 0; i < 10 ; i++) {
            System.out.println( number + " * " + (i+1) + " = " + table[i]);
		}

		//Close Scanner class object
        input.close();
    }
}