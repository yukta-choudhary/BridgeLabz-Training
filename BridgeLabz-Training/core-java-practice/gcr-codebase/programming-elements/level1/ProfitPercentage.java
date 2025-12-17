// This program converts kilometers to miles

public class ProfitPercentage{
    public static void main(String[] args){

        // Create variable costPrice, sellingPrice, profit and profitPercent;
        int costPrice = 129, sellingPrice = 191, profit;
        double profitPercent;

        // Calculate profit and profitPercent
        profit = sellingPrice - costPrice;
	profitPercent = ((double)profit/(double)costPrice) * (double)100;

        // Print miles
        System.out.println("The Cost Price is INR " + costPrice + "  and Selling Price is INR  " + sellingPrice + "\nThe Profit is INR " + profit + " and the Profit Percentage is " + profitPercent);
    }
}