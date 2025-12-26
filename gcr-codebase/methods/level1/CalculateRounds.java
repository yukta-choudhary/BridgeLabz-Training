// Calculate number of rounds covered by the athlete

import java.util.Scanner;

public class CalculateRounds{
	//Create method getRounds

	public int getRounds(int distance, int perimeterInMeter){
		int numberOfRounds = distance/perimeterInMeter;
		return numberOfRounds;
	}
	
	//Create method to calculate perimeter of triangle
	public static int perimeterOfTriangle(int side1, int side2, int side3){
		int perimeterInMeter = side1 + side2 + side3;
		return perimeterInMeter;
	}
	
	
    public static void main(String[] args){
        
       //Create object of Scanner
        Scanner input = new Scanner(System.in);

        // Create variables, distance
        int side1, side2, side3, distance = 5*1000;
		
        System.out.print("Enter length of side1(in metres):  ");
        side1 = input.nextInt();
		
		System.out.print("Enter length of side2(in metres):  ");
        side2 = input.nextInt();
		
		System.out.print("Enter length of side1(in metres):  ");
        side3 = input.nextInt();

		//Call perimeterOfTriangle method to get perimeter in metre
		int perimeterInMeter = perimeterOfTriangle(side1, side2, side3);
				
		//Create object of class to call method
		CalculateRounds calculateRounds = new CalculateRounds(); 
		
		//Call getRounds method
		int numberOfRounds = calculateRounds.getRounds(distance, perimeterInMeter);
				
        //Display result
		System.out.print("The number of possible rounds is " + numberOfRounds);
		
        //Close Scanner object
        input.close();

    }
}