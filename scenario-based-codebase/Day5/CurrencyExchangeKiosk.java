/*
18. Currency Exchange Kiosk 💱
Design a currency converter:
● Take INR amount and target currency.
● Use a switch to apply the correct rate.
● Ask if the user wants another conversion (do-while).
*/

import java.util.Scanner;

public class CurrencyExchangeKiosk{
	
	public static void main(String[] args){
		//Create scanner class
		Scanner input = new Scanner(System.in);
		
		//Create variable to take input in rs and target currency
		double currencyInr;
		int targetCurrency;
		
		//Create variable to ask user to convert again
		char convertAgain = 'Y';
		
		//Create variable to store convertedValue
		double convertedValue;
		
		System.out.println("Welcome to Currency Exchange Kiosk!");
		
		//Display currencies and calculate the amount after conversion
		do{
		
			//Take input from user to convert 
			System.out.print("Enter amount in Indian Rupees(INR): " ); 
			currencyInr = input.nextDouble();
			
			//Take target currency from user to convert 
			System.out.println("Which currency do want to convert in?\n"
				+ "\n1. US Dollar(USD)"
				+ "\n2. Euro(EUR)"
				+ "\n3. British Pound(GBP)" + "\n4. Exit");
			System.out.println("Enter currency(1/2/3/4): ");
			targetCurrency = input.nextInt();
			
			//Calculate and display the converted amount
			switch(targetCurrency){
			
				case 1:
					convertedValue = currencyInr * 0.011;
					System.out.println(currencyInr + " INR = " + convertedValue + " USD");
					break;
				case 2:
					convertedValue = currencyInr * 0.008;
					System.out.println(currencyInr + " INR = " + convertedValue + " EUR");
					break;
				case 3:
					convertedValue = currencyInr * 0.009;
					System.out.println(currencyInr + " INR = " + convertedValue + " GBP");
					break;
				case 4:
					System.out.println("Thank you!");
					break;
				default:
					System.out.println("Invalid choice!");
					break;
			}
			if(targetCurrency == 4){
				break;
			}
			//Ask user if they want to convert again or breaak
			System.out.println("Do you want to convert again?");
			convertAgain = input.next().charAt(0);
			if(convertAgain == 'n' || convertAgain == 'N'){
				System.out.println("Thank you!");
				break;
			}
			
		}
		while(convertAgain == 'y' || convertAgain == 'Y');
		
		input.close();
	}
	
}