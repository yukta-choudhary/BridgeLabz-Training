// This program calculates discount and the final discounted fee

import java.util.Scanner;

public class CalculateUniversityDiscount{
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);

        // Create variable fee, discountPercent, discount and discountedFee
        int fee, discountPercent;
        double discount, discountedFee;
        System.out.println("Enter fee: ");
        fee = input.nextInt();
        System.out.println("Enter discount percent: ");
        discountPercent = input.nextInt();

        // Calculate discount and discountedFee
        discount = ((double)discountPercent/(double)100)*fee;
	discountedFee = fee - discount;

        // Print discount and discountedFee
        System.out.println(" The discount amount is INR " + discount + " and final discounted fee is INR " + discountedFee);
    }
}