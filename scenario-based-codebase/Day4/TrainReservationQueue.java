/*
12. Train Reservation Queue 🚆
Simulate a basic ticket booking system.
● Show menu with switch
● Allow multiple bookings using while-loop.
● Stop booking once seats reach zero (break).

*/
import java.util.Scanner;

public class TrainReservationQueue {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Create an array for available trains
        String[] trains = {
            "Malwa Superfast Express",
            "BJU Express",
            "DADN Intercity"
        };

        String[] coaches = {"Sleeper", "General", "AC"};
        int[] prices = {350, 150, 550};

		//Create a variable to save the number of seats available
        int availableSeats = 3;

        // My ticket data
        String[] myTrain = new String[10];
        String[] myCoach = new String[10];
        int[] mySeats = new int[10];
        int[] myBill = new int[10];
		
		//Create a variable to track the number of tickets booked by the user
        int myTicketCount = 0;

        char rebooking = 'Y';

        while (rebooking == 'Y' || rebooking == 'y') {

            System.out.println("\n--- Train Reservation Menu ---");
            System.out.println("1. Book Ticket");
            System.out.println("2. Cancel Ticket");
            System.out.println("3. Show My Ticket");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = input.nextInt();

            switch (choice) {

                // Booking ticket
                case 1:
                    if (availableSeats == 0) {
                        System.out.println("Oops! No tickets available.");
                        break;
                    }

                    System.out.println("\nAvailable Trains:");
                    for (int i = 0; i < trains.length; i++) {
                        System.out.println((i + 1) + ". " + trains[i]);
                    }

                    System.out.print("Choose train(1/2/3): ");
                    int trainChoice = input.nextInt() - 1;

                    System.out.println("\nAvailable Coaches:");
                    for (int i = 0; i < coaches.length; i++) {
                        System.out.println((i + 1) + ". " + coaches[i] + " - Rs." + prices[i]);
                    }

                    System.out.print("Choose coach: ");
                    int coachChoice = input.nextInt() - 1;

                    System.out.print("Enter number of seats: ");
                    int seats = input.nextInt();

                    if (seats <= availableSeats) {
                        int bill = seats * prices[coachChoice];

                        myTrain[myTicketCount] = trains[trainChoice];
                        myCoach[myTicketCount] = coaches[coachChoice];
                        mySeats[myTicketCount] = seats;
                        myBill[myTicketCount] = bill;

                        myTicketCount++;
                        availableSeats -= seats;

                        System.out.println("Ticket booked successfully!");
                        System.out.println("Train: " + trains[trainChoice]);
                        System.out.println("Coach: " + coaches[coachChoice]);
                        System.out.println("Seats: " + seats);
                        System.out.println("Total Bill: Rs." + bill);
                    } else {
                        System.out.println("Only " + availableSeats + " seats available.");
                    }
                    break;
 
                // CANCEL TICKET
				case 2:
					if (myTicketCount == 0) {
						System.out.println("No tickets booked.");
					} else {

						int lastIndex = myTicketCount - 1;
						int bookedSeats = mySeats[lastIndex];

						System.out.println("You have booked " + bookedSeats + " seats.");
						System.out.print("Enter number of seats to cancel: ");
						int cancelSeats = input.nextInt();

						if (cancelSeats > bookedSeats) {
							System.out.println("You cannot cancel more than booked seats.");
						} else {

							mySeats[lastIndex] -= cancelSeats;
							availableSeats += cancelSeats;

							// If all seats of that ticket are cancelled
							if (mySeats[lastIndex] == 0) {
								myTicketCount--;
							}

							System.out.println("Ticket cancelled successfully.");
						}
					}
					break;

                // SHOW TICKET
                case 3:
                    if (myTicketCount == 0) {
                        System.out.println("No tickets to show.");
                    } else {
                        System.out.println("\n--- My Tickets ---");
                        for (int i = 0; i < myTicketCount; i++) {
                            System.out.println("Train: " + myTrain[i]);
                            System.out.println("Coach: " + myCoach[i]);
                            System.out.println("Seats: " + mySeats[i]);
                            System.out.println("Bill: Rs." + myBill[i]);
                            System.out.println("-------------------");
                        }
                    }
                    break;

                // EXIT
                case 4:
                    System.out.println("Thank you for using Train Reservation System!");
                    rebooking = 'N';
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

            if (choice != 4) {
                System.out.print("\nDo you want to continue (Y/N)? ");
                rebooking = input.next().charAt(0);
            }
        }

        input.close();
    }
}