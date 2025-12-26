// Find the number of chocolates each child gets and number of chocolates remaining

import java.util.Scanner;

public class ChildrenAndChocolates{

	//Create method

	public static int[] findNumberOfChocolates(int numberOfChocolates, int numberOfChildren){
		int[] result = new int[2];
		result[0] = numberOfChocolates/numberOfChildren;
		result[1] = numberOfChocolates % numberOfChildren;
		return result;
	}	
	
    public static void main(String[] args){
        
		//Create object of Scanner
        Scanner input = new Scanner(System.in);

        // Create variable
		System.out.println("Enter number of chocolates: ");
        int numberOfChocolates = input.nextInt();
		
		System.out.println("Enter number of children: ");
        int numberOfChildren = input.nextInt();
		
		//Call method
		int[] result = findNumberOfChocolates(numberOfChocolates, numberOfChildren);

        //Display result		
		System.out.println("The number of chocolates each child gets is " + result[0] + "\nThe number of chocolates remaining are " + result[1]);
		
        //Close Scanner object
        input.close();

    }
}