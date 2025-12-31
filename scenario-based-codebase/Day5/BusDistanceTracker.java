/*
19. Bus Route Distance Tracker 🚌
Each stop adds distance.
● Ask if the passenger wants to get off at a stop.
● Use a while-loop with a total distance tracker.
● Exit on user confirmation.
*/

import java.util.Scanner;

public class BusDistanceTracker{

	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		String[] stopNames = {"Bhopal", "Sehore", "Dewas", "Indore"};
		int[] stopDistance = {0, 30, 100, 40};

		int totalDistance = 0;
		char choice = 'N';

		System.out.println("----Journey Starts----");

		int i = 0;

		while(i < stopNames.length){

			totalDistance = totalDistance + stopDistance[i];

			System.out.print("Do you want to get off at " + stopNames[i] + " ? (y/n): ");
			choice = input.next().charAt(0);

			if(choice == 'y' || choice == 'Y'){
				System.out.println("Total distance covered till " + stopNames[i] + " is " + totalDistance + " Km.");
				break;
			}
			i++;
		}

		System.out.println("----Journey Ends----");
		input.close();
	}
}
