// Check day and month is in the spring season or not

import java.util.Scanner;

public class SpringSeason{

	//Create method getSpringSeason

	public boolean getSpringSeason(int month, int day){
		if((day>=20 && month == 3) || (month == 4) || (month == 5) || (day<=20 && month == 6)){
			return true;
		}else{
			return false;
		}
	}	
	
    public static void main(String[] args){
        
        // Create variables
        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);
						
		//Create object of class to call method
		SpringSeason springSeason = new SpringSeason(); 
		
		//Call getSpringSeason method
		boolean result = springSeason.getSpringSeason(month, day);
				
        //Display result
		if(result){
			System.out.println("Its a Spring Season." );
		}else{			
			System.out.println("Not a Spring Season.");
		}
		
    }
}