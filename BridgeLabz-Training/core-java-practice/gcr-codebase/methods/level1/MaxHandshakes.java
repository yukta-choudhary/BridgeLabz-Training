// Calculate maximum number of handshakes

import java.util.Scanner;

public class MaxHandshakes{
	//Create method simpleInterest

	public int getMaxHandshakes(int numberOfStudents){
		int totalHandshakes = (numberOfStudents * (numberOfStudents -1))/2;
		return totalHandshakes;
	}
    public static void main(String[] args){
        
       //Create object of Scanner
        Scanner input = new Scanner(System.in);

        // Create variables
        int numberOfStudents;
		
        System.out.print("Enter number of students:  ");
        numberOfStudents = input.nextInt();

		//Create object of class to call method
		MaxHandshakes maxHandshakes = new MaxHandshakes(); 
		
		//Call the method 
		int totalHandshakes = maxHandshakes.getMaxHandshakes(numberOfStudents);
		
        //Display result
		System.out.print("The number of possible handshakes is " + totalHandshakes);
		
        //Close Scanner object
        input.close();

    }
}