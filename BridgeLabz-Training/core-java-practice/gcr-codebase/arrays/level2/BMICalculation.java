import java.util.Scanner;

public class BMICalculation
{
	public static void main(String[] args)
	{
		// Create scanner class object
		Scanner input = new Scanner(System.in);
		
		// Declare number of persons
		System.out.println("Enter number of persons:");
		int n = input.nextInt();
		
		double[] weight = new double[n];
		double[] height = new double[n];
		double[] bmi = new double[n];
		String[] status = new String[n];
		
		// Take input for weight and height
		for(int i = 0; i < n; i++){
			System.out.println("Enter weight (kg) of person " + (i + 1) + ":");
			weight[i] = input.nextDouble();
			
			System.out.println("Enter height (m) of person " + (i + 1) + ":");
			height[i] = input.nextDouble();
		}
		
		// Calculate BMI and status
		for(int i = 0; i < n; i++){
			bmi[i] = weight[i] / (height[i] * height[i]);
			
			if(bmi[i] <= 18.4){
				status[i] = "Underweight";
			}else if(bmi[i] >= 18.5 && bmi[i] <= 24.9){
				status[i] = "Normal";
			}else if(bmi[i] >= 25.0 && bmi[i] <= 39.9){
				status[i] = "Overweight";
			}else{
				status[i] = "Obese";
			}
		}
		
		// Display details
		System.out.println("Height\tWeight\tBMI\t\tStatus");
		for(int i = 0; i < n; i++){
			System.out.printf("%.2f\t%.2f\t%.2f\t%s%n",
					height[i], weight[i], bmi[i], status[i]);
		}
		
		// Close Scanner class object
		input.close();
	}
}
