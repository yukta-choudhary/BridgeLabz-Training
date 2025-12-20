// Calculate Simple Interest

import java.util.Scanner;

public class SimpleInterest{
	//Create method simpleInterest

	public double getSimpleInterest(double principal, double rate, double time){
		double interest = (principal*rate*time)/100;
		return interest;
	}
    public static void main(String[] args){
        
       //Create object of Scanner
        Scanner input = new Scanner(System.in);

        // Create variables
        double principal, rate, time;
		
        System.out.print("Enter principal:  ");
        principal = input.nextDouble();
		
        System.out.print("Enter rate:  ");
        rate = input.nextDouble();
		
		System.out.print("Enter time:  ");
        time = input.nextDouble();

		//Create object of class to call method
		SimpleInterest simpleInterest = new SimpleInterest(); 
		
		//Call the method 
		double interest = simpleInterest.getSimpleInterest(principal, rate, time);
		
        //Display result
		System.out.print("The Simple Interest is " + interest + " for Principal " + principal + ", Rate of Interest " + rate + " and Time " + time);

		
        //Close Scanner object
        input.close();

    }
}