// Create a counter for rocket launch from user input value to 1 using for loop

import java.util.Scanner;

public class ForCounter{
    public static void main(String[] args){
        
       //Create object of Scanner
        Scanner input = new Scanner(System.in);

        // Create variable counter
		int counter;
        System.out.print("Enter counter value:  ");
        counter = input.nextInt();
		
        // Run a for loop for countdown
        for(int i = counter; counter >= 1; counter --){
			System.out.println(counter + "\n");
		}
        
        //Close Scanner object
        input.close();

    }
}