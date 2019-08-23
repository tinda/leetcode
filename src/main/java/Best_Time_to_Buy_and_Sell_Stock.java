/**
 * Say you have an array for which the ith element is the price of a given stock on day i.
 *
 * If you were only permitted to complete at most one transaction (i.e., buy one and sell one share of the stock), design an algorithm to find the maximum profit.
 *
 * Note that you cannot sell a stock before you buy one.
 *
 * Example 1:
 *
 * Input: [7,1,5,3,6,4]
 * Output: 5
 * Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
 *              Not 7-1 = 6, as selling price needs to be larger than buying price.
 * Example 2:
 *
 * Input: [7,6,4,3,1]
 * Output: 0
 * Explanation: In this case, no transaction is done, i.e. max profit = 0.
 */

public class Best_Time_to_Buy_and_Sell_Stock {

    public static void main(String[] args) {
        int[] prices = {2, 4, 1};
        int[] prices1 = {7, 1, 5, 3, 6, 4};
        int[] prices2 = {2, 1, 2, 1, 0, 1, 2};
        int[] prices3 = {2, 1, 2, 0, 1};
        int[] prices4 = {7, 6, 4, 3, 1};
        System.out.println(maxProfit(prices3));
    }

    public static int maxProfit(int[] prices) {
        int ans = 0;
        if (prices.length == 0) {
            return ans;
        }
        int bought = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > bought) {
                if (ans < (prices[i] - bought)) {
                    ans = prices[i] - bought;
                }
            } else {
                bought = prices[i];
            }
        }
        return ans;
    }
}
