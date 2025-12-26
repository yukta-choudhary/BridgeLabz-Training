import java.util.Scanner;

public class FriendHeightAge {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Declare variables for ages and height
        int ageAmar, ageAkbar, ageAnthony;
        double heightAmar, heightAkbar, heightAnthony;
        System.out.print("Enter age of Amar: ");
        ageAmar = input.nextInt();
        System.out.print("Enter age of Akbar: ");
        ageAkbar = input.nextInt();
        System.out.print("Enter age of Anthony: ");
        ageAnthony = input.nextInt();
        System.out.print("Enter height of Amar (in cm): ");
        heightAmar = input.nextDouble();
        System.out.print("Enter height of Akbar (in cm): ");
        heightAkbar = input.nextDouble();
        System.out.print("Enter height of Anthony (in cm): ");
        heightAnthony = input.nextDouble();

        // Find youngest friend
        int youngestAge = ageAmar;
        String youngestFriend = "Amar";
        if (ageAkbar < youngestAge) {
            youngestAge = ageAkbar;
            youngestFriend = "Akbar";
        }
        if (ageAnthony < youngestAge) {
            youngestAge = ageAnthony;
            youngestFriend = "Anthony";
        }

        // Find tallest friend
        double tallestHeight = heightAmar;
        String tallestFriend = "Amar";
        if (heightAkbar > tallestHeight) {
            tallestHeight = heightAkbar;
            tallestFriend = "Akbar";
        }
        if (heightAnthony > tallestHeight) {
            tallestHeight = heightAnthony;
            tallestFriend = "Anthony";
        }

        // Display results
        System.out.println("The youngest friend is " + youngestFriend + " with age " + youngestAge);
        System.out.println("The tallest friend is " + tallestFriend + " with height " + tallestHeight + " cm");

        // Close scanner
        input.close();
    }
}
