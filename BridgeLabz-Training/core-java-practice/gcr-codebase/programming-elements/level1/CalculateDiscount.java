// This program calculates discount and the final discounted fee

public class CalculateDiscount{
    public static void main(String[] args){

        // Create variable fee, discountPercent, discount and discountedFee
        int fee = 125000, discountPercent = 10;
        double discount, discountedFee;

        // Calculate discount and discountedFee
        discount = ((double)discountPercent/(double)100)*fee;
	discountedFee = fee - discount;

        // Print discount and discountedFee
        System.out.println(" The discount amount is INR " + discount + " and final discounted fee is INR " + discountedFee);
    }
}