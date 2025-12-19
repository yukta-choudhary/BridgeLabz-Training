import java.util.Scanner;

public class BMIMultiDimArray
{
	public static void main(String[] args)
	{
		// Create scanner class object
		Scanner input = new Scanner(System.in);
		
		// Declare number of persons
		System.out.println("Enter number of persons:");
		int number = input.nextInt();
		
		// Declare 2D array and status array
		double[][] personData = new double[number][3];
		String[] weightStatus = new String[number];
		
		// Take input for weight and height
		for(int i = 0; i < number; i++){
			
			System.out.println("Enter weight (kg) of person " + (i + 1) + ":");
			personData[i][0] = input.nextDouble();
			
			if(personData[i][0] <= 0){
				System.out.println("Invalid weight, enter again");
				i--;
				continue;
			}
			
			System.out.println("Enter height (m) of person " + (i + 1) + ":");
			personData[i][1] = input.nextDouble();
			
			if(personData[i][1] <= 0){
				System.out.println("Invalid height, enter again");
				i--;
			}
		}
		
		// Calculate BMI and status
		for(int i = 0; i < number; i++){
			personData[i][2] = personData[i][0] / (personData[i][1] * personData[i][1]);
			
			if(personData[i][2] <= 18.4){
				weightStatus[i] = "Underweight";
			}else if(personData[i][2] <= 24.9){
				weightStatus[i] = "Normal";
			}else if(personData[i][2] <= 39.9){
				weightStatus[i] = "Overweight";
			}else{
				weightStatus[i] = "Obese";
			}
		}
		
		// Display details
		System.out.println("Height\tWeight\tBMI\t\tStatus");
		for(int i = 0; i < number; i++){
			System.out.printf("%.2f\t%.2f\t%.2f\t%s%n",
					personData[i][1], personData[i][0], personData[i][2], weightStatus[i]);
		}
		
		// Close Scanner class object
		input.close();
	}
}
