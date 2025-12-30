/*
14. Movie Ticket Booking App 🎬
Ask users for movie type, seat type (gold/silver), and snacks.
● Use switch and if together.
● Loop through multiple customers.
● Clean structure and helpful variable names.
*/
import java.util.Scanner;

public class MovieTicketBooking{

	public static void main(String[] args){
	
		//Create a scanner class object 
		Scanner input = new Scanner(System.in);
		
		//Create a variable to ask for choice
		int choice;
		
		//Create an array for movie names
		String[] movieNames = {"Stranger Things", "Zootopia", "Avatar"};
		
		//Create a variable to store response for booking for next customers
		char ch = 'Y';
		
		//Create a variable to calculate total ticketprice
		int ticketPrice = 0;
		
		//Create Variable to store movie name and seat type and snacks 
		String movieType, seatType, snacks;
		
		while(ch == 'y' || ch == 'Y'){
			System.out.println("Movie Ticket Booking");
			System.out.println("1. Book Ticket\n2. Exit");
			System.out.println("Enter choice(1/2): ");
			choice = input.nextInt();
			input.nextLine(); // consume leftover newline
			
			if(choice == 2){
				System.out.println("Thank you!");
				break;
			}
			if(choice == 1){
				System.out.println("----Available Movies-----");
				for(int i = 0; i<movieNames.length; i++){
					System.out.println((i+1) + ". " + movieNames[i]);
				}

				System.out.println("Which movie do you want to watch? ");
				movieType = input.nextLine().toLowerCase();
				System.out.println("What seat do you want? (Gold/Silver/Regular) ");
				seatType = input.nextLine().toLowerCase();
				System.out.println("Do you want snacks? (yes/no) ");
				snacks = input.nextLine().toLowerCase();
				
				switch(movieType){
					case "stranger things": 
						ticketPrice = 250;
						break;
					case "zootopia":
						ticketPrice = 200;
						break;
					case "avatar":
						ticketPrice = 350;
						break;
					default:
						System.out.println("Movie not available");
				}
				
				switch(seatType){
					case "gold": 
						ticketPrice += 150;
						break;
					case "silver":
						ticketPrice += 100;
						break;
					case "regular":
						ticketPrice += 0;
						break;
					default:
						System.out.println("Invalid seat type");
				}
				
				switch(snacks){
					case "yes": 
						ticketPrice += 50;
						break;
					case "no":
						ticketPrice += 0;
						break;
					default:
						System.out.println("Invalid choice");
				}
				
				System.out.println("Ticket booked Successfully");
				System.out.println("Ticket Price = " + ticketPrice);

				System.out.print("Do you want to book another ticket?(Y/N): ");
				ch =  input.next().charAt(0);
				
				if(ch == 'n' || ch == 'N'){
					System.out.println("Thank you!");
					break;
				}

			}else{
				System.out.println("Invalid choice");
			}
		}
		
		input.close();
		
	}

}