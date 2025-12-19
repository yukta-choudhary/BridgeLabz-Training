import java.util.Scanner;

public class FriendsAgeHeight
{
	public static void main(String[] args)
	{
		// Create scanner class object
		Scanner input = new Scanner(System.in);
		
		// Declare arrays for age and height
		int[] age = new int[3];
		double[] height = new double[3];
		String[] names = {"Amar", "Akbar", "Anthony"};
		
		// Take input for age and height
		for(int i = 0; i < 3; i++){
			System.out.println("Enter age of " + names[i] + ":");
			age[i] = input.nextInt();
			
			System.out.println("Enter height of " + names[i] + ":");
			height[i] = input.nextDouble();
		}
		
		// Find youngest and tallest
		int youngestIndex = 0;
		int tallestIndex = 0;
		
		for(int i = 1; i < 3; i++){
			if(age[i] < age[youngestIndex]){
				youngestIndex = i;
			}
			if(height[i] > height[tallestIndex]){
				tallestIndex = i;
			}
		}
		
		// Display results
		System.out.println("Youngest friend is " + names[youngestIndex]);
		System.out.println("Tallest friend is " + names[tallestIndex]);
		
		// Close Scanner class object
		input.close();
	}
}
