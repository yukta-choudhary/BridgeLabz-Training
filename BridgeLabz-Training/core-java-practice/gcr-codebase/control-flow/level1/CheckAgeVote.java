// Check whether a person can vote, depending on whether his/her age is greater than or equal to 18

import java.util.Scanner;

public class CheckAgeVote{
    public static void main(String[] args){
        
       //Create object of Scanner
        Scanner input = new Scanner(System.in);

        // Create variable age
        int age;
        System.out.print("Enter age:  ");
        age= input.nextInt();

        // Check whether age is greater than or equal to 18 or not. 
        if(age>=18){
			System.out.println("The person's age is " + age + " and can vote.");
		}else{
			System.out.println("The person's age is " + age + " and cannot vote.");
		}
        
        //Close Scanner object
        input.close();

    }
}