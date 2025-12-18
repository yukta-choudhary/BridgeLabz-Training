import java.util.Scanner;

public class ConvertDistance {

    public static void main(String[] args) {

        // Create Scanner object to take input from user
        Scanner input = new Scanner(System.in);

        // Create variable for distance in feet
        float distanceInFeet;
        System.out.print("Enter distance in feet: ");
        distanceInFeet = input.nextFloat();

        // 1 yard = 3 feet
        float distanceInYards = distanceInFeet / 3;

        // 1 mile = 1760 yards
        float distanceInMiles = distanceInYards / 1760;

        // Print result
        System.out.println("The distance in yards is " + distanceInYards +" while the distance in miles is " + distanceInMiles);

        // Close scanner
        input.close();
    }
}
