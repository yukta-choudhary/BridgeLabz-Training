// Print even and odd from 1 to number
import java.util.Scanner;

public class PrintEvenOdd{
    public static void main(String[] args){
        
       //Create object of Scanner
        Scanner input = new Scanner(System.in);

        // Declare variable number
		int number;
        System.out.print("Enter number: ");
		number = input.nextInt();
		
        // Check if number is natural number. If yes then print even and odd number from 1 to number.
        if(number>=0){
			for(int i = 1; i<=number; i++)
				if(i%2 == 0){
					System.out.println("The number " + i + " is even");
				}
				else{
					System.out.println("The number " + i + " is odd");
				}			
			
		}else{
			System.out.println("The number is " + number + " not a natural number");
		}

        //Close Scanner object
        input.close();

    }
}