/*
Election Booth Manager
- Take age input
- Check eligibility (>=18)
- Record vote (1, 2, 3 for candidates)
- Loop for multiple voters, exit on special code (-1)
*/

import java.util.Scanner;

public class ElectionBoothManager {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int vote1 = 0, vote2 = 0, vote3 = 0; // Vote counters

        while (true) {

            System.out.print("Enter your age (or -1 to exit): ");
            int age = input.nextInt();

            // Exit condition
            if (age == -1) {
                break;
            }

            // Check eligibility
            if (age < 18) {
                System.out.println("You are not eligible to vote.");
                continue;
            }

            // Display candidates
            System.out.println("Eligible to vote. Choose a candidate:");
            System.out.println("1. Candidate 1");
            System.out.println("2. Candidate 2");
            System.out.println("3. Candidate 3");
            System.out.print("Enter your vote: ");
            int vote = input.nextInt();

            // Record vote
            if (vote == 1) {
                vote1++;
            } else if (vote == 2) {
                vote2++;
            } else if (vote == 3) {
                vote3++;
            } else {
                System.out.println("Invalid vote! Try again.");
            }

            System.out.println("Vote recorded.\n");
        }

        // Display results
        System.out.println("\nElection Results:");
        System.out.println("Candidate 1: " + vote1 + " votes");
        System.out.println("Candidate 2: " + vote2 + " votes");
        System.out.println("Candidate 3: " + vote3 + " votes");

        // Determine winner
        if (vote1 >= vote2 && vote1 >= vote3) {
            System.out.println("Winner: Candidate 1");
        } else if (vote2 >= vote1 && vote2 >= vote3) {
            System.out.println("Winner: Candidate 2");
        } else {
            System.out.println("Winner: Candidate 3");
        }

        input.close();
    }
}
