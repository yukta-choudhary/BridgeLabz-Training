/*
Question 121: Best Time to Buy and Sell Stock

You are given an array prices where prices[i] is the stock price on the ith day.

You can buy the stock on one day and sell it on a future day.
You must buy before you sell.

Return the maximum profit you can achieve.
If no profit is possible, return 0.

Example 1:
Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation:
Buy at price 1 and sell at price 6.
Profit = 6 - 1 = 5

*/

class BestTimeToBuyAndSellStock {

    public static int maxProfit(int[] prices) {

        int minPrice = prices[0]; // minimum price so far
        int maxProfit = 0;        // maximum profit

        // Traverse prices array
        for (int i = 1; i < prices.length; i++) {

            // Update minimum price
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } 
            // Calculate profit if sold today
            else {
                int profit = prices[i] - minPrice;

                // Update maximum profit
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {

        int[] prices = {7, 1, 5, 3, 6, 4};

        int result = maxProfit(prices);
        System.out.println("Maximum Profit = " + result);
    }
}
