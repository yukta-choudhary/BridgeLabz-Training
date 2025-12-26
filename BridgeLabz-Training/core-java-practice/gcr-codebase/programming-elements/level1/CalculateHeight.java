// This program calculates height from centimeters to feet and inches 

import java.util.Scanner;

public class CalculateHeight{
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);

        // Create variable heightCm, heightInch and heightFeet
        int heightCm;
        double heightFeet, heightInch;
        System.out.println("Enter height in Cm: ");
        heightCm = input.nextInt();

        // Calculate height in feet and inches
        
	heightInch = (double)heightCm/2.54;
        heightFeet = heightInch/(double)12;

        // Print height in feet and inches
        System.out.println(" Your Height in cm is " + heightCm + " while in feet is " + heightFeet + " and inches is " + heightInch);
        input.close();
    }
}