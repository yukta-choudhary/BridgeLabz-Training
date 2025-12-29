/*
10. Phone Recharge Simulator 📱
Take the user's mobile operator and amount.
● Use a switch to display offers.
● Loop to allow repeated recharges.
● Show balance after each recharge.
*/

import java.util.Scanner;

public class PhoneRechargeSimulator{
	public static void main(String[] args){
	
		//Create object of scanner class
		Scanner input = new Scanner(System.in);
		
		//Take user's mobile operator
		System.out.println("Enter your mobile operator (BSNL/JIO/AIRTEL): ");
		String mobileOperator = input.nextLine().toLowerCase();
		
		//Take user's phone number
		System.out.println("Enter your mobile number (10 digit mobile number): ");
		long mobileNumber = input.nextLong();
		
		//Create variable to take amount of recharge entered by the user
		//Create a variable for balance storage 
		int amount, balance = 0;
		
		//Create a variable that stores the reply for asking if they want to recharge again
		char ch = 'Y';
		
		//According to the operator show offers and ask if they want to recharge again
		while(ch == 'Y' || ch=='y'){
				
			if(mobileOperator.equals("bsnl")){
				System.out.println("BSNL offers");
				System.out.println("Rs. 399 Plan: Unlimited data/calls, 30-day validity");
				System.out.println("Rs. 999 Plan: 1GB data per day, Unlimited calls, 150-day validity");
				System.out.println("Enter amount for recharge (399/999): ");
				amount = input.nextInt();
				switch(amount){
					case 399:
					case 999:
						balance = balance + amount;
						System.out.println(mobileNumber + " Recharge done successfully!");
						System.out.println("Current balance = " + balance);
						break;
					default:
						System.out.println("Invalid plan.");
				}
			}else if(mobileOperator.equals("airtel")){
				System.out.println("Airtel offers");
				System.out.println("Rs. 599 Plan: Unlimited data/calls, 30-day validity");
				System.out.println("Rs. 1399 Plan: Unlimited 5G data, Unlimited calls, 150-day validity");
				System.out.println("Enter amount for recharge (599/1399): ");
				amount = input.nextInt();
				switch(amount){
					case 599:
					case 1399:
						balance = balance + amount;
						System.out.println(mobileNumber + " Recharge done successfully!");
						System.out.println("Current balance = " + balance);
						break;
					default:
						System.out.println("Invalid plan.");
				}		
			}else if(mobileOperator.equals("jio")){
				System.out.println("JIO offers");
				System.out.println("Rs. 599 Plan: 1.5 GB per day, Unlimited calls, 29-day validity");
				System.out.println("Rs. 1199 Plan: Unlimited 5G data, Unlimited calls, 100-day validity");
				System.out.println("Enter amount for recharge (599/1199): ");
				amount = input.nextInt();
				switch(amount){
					case 599:
					case 1199:
						balance = balance + amount;
						System.out.println(mobileNumber + " Recharge done successfully!");
						System.out.println("Current balance = " + balance);
						break;
					default:
						System.out.println("Invalid plan.");
				}		
			}else{
				System.out.println("Sorry! We dont support this mobile operator.");
			}
			System.out.println("Do you want to recharge again (Y/N)? ");
			ch = input.next().charAt(0);
			
			 // If yes, ask operator & number again
            if (ch == 'Y' || ch == 'y') {
                System.out.println("Enter your mobile operator (BSNL/JIO/AIRTEL): ");
                input.nextLine(); // move to next line
                mobileOperator = input.nextLine().toLowerCase();

                System.out.println("Enter your mobile number (10 digit mobile number): ");
                mobileNumber = input.nextLong();
            }
		}
		System.out.println("Thank you!");
		input.close();
	
	}
}