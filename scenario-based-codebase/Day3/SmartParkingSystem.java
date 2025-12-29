import java.util.Scanner;

public class SmartParkingSystem{
	public static void main(String[] args){
		
		//Create an object for scanner class
		Scanner input = new Scanner(System.in);
		
		//Set the maximum occupancy limit for the parking lot
		int parkingLot = 5;
		
		//Start the currentParkingOccupancy counter to count the vehicles currently in the parking lot
		int currentParkingOccupancy = 0;
		
		//Use while loop to keep on asking the user their choice
		while(true){
			System.out.println("Enter your choice (Park, Exit Car, Show Occupancy, End): ");
			String choice = input.nextLine().toLowerCase();	
			if(choice.equals("end")){
				System.out.println("Thank you for trying our service. Please visit again.");
				break;
			}
			switch(choice){
				case "park":
					if(currentParkingOccupancy == parkingLot){
						System.out.println("We are sorry! Parking lot is full. No space left.");
					}
					currentParkingOccupancy++;
					break;
				case "exit car":
					if(currentParkingOccupancy == 0){
						System.out.println("Oops! Parking lot is empty. No car left to exit.");
					}else{
						currentParkingOccupancy--;
					}
					break;
				case "show occupancy":
					System.out.println("Current Occupancy is " + currentParkingOccupancy);
					break;
				default:
					System.out.println("Invalid choice. Please try again.");
					continue;
			}

		}
		input.close();
	}
}