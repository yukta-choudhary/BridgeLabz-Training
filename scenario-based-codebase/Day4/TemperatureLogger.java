/*
11. Temperature Logger 🌡️
Record temperatures over 7 days.
● Use array and for-loop.
● Find average and max temperature.
● Use if for comparisons. Maintain readable naming and modular code blocks.
*/
import java.util.Scanner

public class TemperatureLogger{

	public static void main(String[] args){
	
		//Create scanner class object
		Scanner input = new Scanner(System.in);
		
		//Create an array to store temperature recorded over 7 days
		int[] temperatureRecords = new int[7];
		
		//Create variables to calculate sum, max and average
		double average;
		int sum = 0, maxTemperature = Integer.MIN_VALUE;
		
		System.out.println("Enter temperature record for past 7 days");
		
		//Take temperature record from the user
		for(int i = 0; i<temperatureRecords.length; i++){
			System.out.print("Day " + (i+1) + ": ");
			temperatureRecords[i] = input.nextInt();
		}
		
		//Calculate sum and maxTemperature
		for(int i = 0; i<temperatureRecords.length; i++){
		
			sum = sum + temperatureRecords[i];
			if(temperatureRecords[i] > maxTemperature){
				maxTemperature = temperatureRecords[i];
			}
			
		}
		
		//Display average and max temperature
		System.out.println("The average of the temperatures is " + ((double)sum/(double)7));
		System.out.println("The maximum of the temperatures is " + maxTemperature);


		input.close();
	
	}
}