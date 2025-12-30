/*
13. Sandeep’s Fitness Challenge Tracker 🏋️
♂Each day Sandeep completes a number of push-ups.
● Store counts for a week.
● Use for-each to calculate total and average.
● Use continue to skip rest days.
*/
import java.util.Scanner;

public class SandeepFitnessTracker{

	public static void main(String[] args){
	
		//Create scanner class object
		Scanner input = new Scanner(System.in);
		
		//Create an array to store number of pushUp recorded over 7 days
		int[] pushUpRecords = new int[7];
		
		//Create variables to calculate total and average
		double average;
		int total = 0;
		
		System.out.println("Enter number of push-ups record for past 7 days");
		
		//Take input of the push-up from the user
		for(int i = 0; i<pushUpRecords.length; i++){
			System.out.print("Day " + (i+1) + ": ");
			pushUpRecords[i] = input.nextInt();
		}
		
		//Calculate total
		for(int i : pushUpRecords){
		
			total = total + pushUpRecords[i];
			
		}
		
		//Display total and average pushUp count
		System.out.println("The total of the temperatures is " + total);
		System.out.println("The average of the temperatures is " + ((double)total/(double)7));


		input.close();
	
	}
}