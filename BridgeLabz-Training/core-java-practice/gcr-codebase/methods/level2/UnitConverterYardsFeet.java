import java.util.Scanner;

public class UnitConverterYardsFeet {

    // Method to convert yards to feet
    public static double convertYardsToFeet(double yards) {
        double yardsToFeet = 3;
        return yards * yardsToFeet;
    }

    // Method to convert feet to yards
    public static double convertFeetToYards(double feet) {
        double feetToYards = 0.333333;
        return feet * feetToYards;
    }

    // Method to convert meters to inches
    public static double convertMetersToInches(double meters) {
        double metersToInches = 39.3701;
        return meters * metersToInches;
    }

    // Method to convert inches to meters
    public static double convertInchesToMeters(double inches) {
        double inches2meters = 0.0254;
        return inches * inches2meters;
    }

    // Method to convert inches to centimeters
    public static double convertInchesToCm(double inches) {
        double inchesToCm = 2.54;
        return inches * inchesToCm;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter yards: ");
        double yards = input.nextDouble();
        System.out.println("Feet: " + convertYardsToFeet(yards));
        System.out.print("Enter feet: ");
        double feet = input.nextDouble();
        System.out.println("Yards: " + convertFeetToYards(feet));
        System.out.print("Enter meters: ");
        double meters = input.nextDouble();
        System.out.println("Inches: " + convertMetersToInches(meters));
        System.out.print("Enter inches: ");
        double inches = input.nextDouble();
        System.out.println("Meters: " + convertInchesToMeters(inches));
        System.out.println("Centimeters: " + convertInchesToCm(inches));
        input.close();
    }
}
