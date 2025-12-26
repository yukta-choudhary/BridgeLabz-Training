// Check number is positive negative or zero

import java.util.Scanner;

public class CheckNumber{

	//Create method getNumberType

	public int getNumberType(int number){
		if(number == 0){
			return 0;
		}else if(number>0){
			return 1;
		}else{
			return -1;
		}
	}	
	
    public static void main(String[] args){
        
		//Create object of Scanner
        Scanner input = new Scanner(System.in);

        // Create variables
        int number;
		
        System.out.print("Enter number:  ");
        number = input.nextInt();
						
		//Create object of class to call method
		CheckNumber checkNumber = new CheckNumber(); 
		
		//Call getNumberType method
		int numType = checkNumber.getNumberType(number);
				
        //Display result
		if(numType == 0){
			System.out.println("The number is zero.");
		}else if(numType == 1){
			System.out.println("The number is positive.");
		}else{			
			System.out.println("The number is negative.");
		}
		
        //Close Scanner object
        input.close();

    }
}