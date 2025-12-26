import java.util.Scanner;

public class MeanHeight
{
	public static void main(String[] args)
	{
		// Create scanner class object
		Scanner input = new Scanner(System.in);
		
		//Declare array and a variable sum
		double sum = 0;
		double[] heights = new double[11];
		
		System.out.println("Enter the heights:");
		
		//Take height inputs from the user
		for(int i = 0; i<11; i++){
			heights[i] = input.nextDouble();
		}
		
		//Calculate sum of heights
		for(int i = 0; i<11; i++){
			sum = sum + heights[i];
		}
		
		//Display Result
		System.out.println("Mean height of the football team is " + (sum/11));

		//Close Scanner class object
        input.close();
    }
}