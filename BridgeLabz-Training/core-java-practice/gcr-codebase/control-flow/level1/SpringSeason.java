// The program takes two int values month and day from the command line and prints whether its a spring season or not
import java.util.Scanner;

public class SpringSeason{
    public static void main(String[] args){
        
       //Create object of Scanner
        Scanner input = new Scanner(System.in);

        // Create variable day and month
		int month = Integer.parseInt(args[0]);
		int day = Integer.parseInt(args[1]);
		
        // Check if day and month is spring season or not
		// Spring is from March 20 to June 20
        if((day>=20 && month ==3) || (month ==4) || (month ==5)|| (day<=20 && month ==6)){
				
			System.out.println("Its a Spring Season" );
			
		}else{
			System.out.println("Not a Spring Season”");
		}

        //Close Scanner object
        input.close();

    }
}