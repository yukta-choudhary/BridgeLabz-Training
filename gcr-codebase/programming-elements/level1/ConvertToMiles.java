// This program converts kilometers to meters and takes input from the user.

import java.util.Scanner;

public class ConvertToMiles{
    public static void main(String[] args){

        // Create variable km and miles
        Scanner input = new Scanner(System.in);
        double miles;
        System.out.println("Enter distance in kilometers: ");
        double km = input.nextDouble();
        

        // Calculate distance in miles
        // 1 Km = 0.62 miles
       	miles = km * 0.62;

        // Print distance in miles
        System.out.println(" The total miles is " + miles + "  mile for the given " + km + "  km");
        input.close();
    }
}