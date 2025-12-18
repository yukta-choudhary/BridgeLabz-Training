// Create a counter for rocket launch from user input value to 1.

import java.util.Scanner;

public class RocketLaunchCounter{
    public static void main(String[] args){
        
       //Create object of Scanner
        Scanner input = new Scanner(System.in);

        // Create variable counter
		int counter;
        System.out.print("Enter counter value:  ");
        counter = input.nextInt();
		
        // Run a loop for countdown
        while(counter >= 1){
			System.out.println(counter + "\n");
			counter = counter - 1;
		}
        
        //Close Scanner object
        input.close();

    }
}