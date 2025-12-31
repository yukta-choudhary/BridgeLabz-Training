/*
16. Digital Watch Simulation ⏱️
Simulate a 24-hour watch:
● Print hours and minutes in a nested for-loop.
● Use a break to stop at 13:00 manually (simulate power cut).
Core Java Scenario Based Problem Statements
*/

public class DigitalWatch{
	
	public static void main(String[] args){
		
		//Create variables for the number of hours and minutes in a 24 hour class
		int hours = 24, minutes = 60;
		
		System.out.println("----Digital Watch----");
		
		//Use nested for displaying the clock ticking
		for(int i = 0; i<hours; i++){
			for(int j = 0; j<minutes; j++){
				
				System.out.printf("%02d:%02d\n", i, j);
				
				//Break loop when time is 13:00
				if(i==13 && j == 00){
					System.out.println("Oops! Power Cut!");
					break;
				}
			}
			if(i==13){
					break;
			}
		}
	}
}