// Calculate various trigonometric functions 

import java.util.Scanner;

public class TrigonometricFunctions{

	//Create method

	public double[] calculateTrigonometricFunctions(double angle){
		double[] result = new double[3];
		result[0] = Math.sin(angle);
		result[1] = Math.cos(angle);
		result[2] = Math.tan(angle);
		return result;
	}	
	
    public static void main(String[] args){
        
		//Create object of Scanner
        Scanner input = new Scanner(System.in);

        // Create variable
		System.out.println("Enter angle (in degrees): ");
        double angleDegrees = input.nextDouble();
		
		// Convert angle from degrees to radians
		double angle = Math.toRadians(angleDegrees);
		
		//Create class object to call the method
		TrigonometricFunctions trigonometricFunctions = new TrigonometricFunctions();
		
		//Call method
		double[] result = trigonometricFunctions.calculateTrigonometricFunctions(angle);

        //Display result		
		System.out.println("The value of sine is " + result[0] + "\nThe value of cosine is " + result[1] + "\nThe value of tangent is " +result[2]);
		
        //Close Scanner object
        input.close();

    }
}