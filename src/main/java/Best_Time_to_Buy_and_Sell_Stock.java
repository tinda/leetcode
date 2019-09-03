/**
 * Say you have an array for which the ith element is the price of a given stock on day i.
 * <p>
 * If you were only permitted to complete at most one transaction (i.e., buy one and sell one share of the stock), design an algorithm to find the maximum profit.
 * <p>
 * Note that you cannot sell a stock before you buy one.
 * <p>
 * Example 1:
 * <p>
 * Input: [7,1,5,3,6,4]
 * Output: 5
 * Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
 * Not 7-1 = 6, as selling price needs to be larger than buying price.
 * Example 2:
 * <p>
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

    /**
     * https://dotblogs.com.tw/hatelove/2017/03/16/leetcode-121-best-time-to-buy-and-sell-stock
     * Kadane's algorithm 說明：
     *
     * 一串數列的最大差值，其實是差值的總和（這邊的 currentSum），直到滿足第二點的條件，代表數列結束。例如：{4,6,7} 最大差值的 7 - 4 = 3, 可以被轉成 (6-4) + (7-6) = 3
     * 當 currentSum < 0 時，代表截至目前為止，這一段最大總和已決定。所以要 reset 為 0, 以便計算下一段的最大差值。
     * maxSum 用來存放每一段的最大差值。
     */

    public static int maxProfit2(int[] prices) {
        if (prices.length < 2) {
            return 0;
        }

        return FindMaxProfitByKadane(prices);
    }

    private static int FindMaxProfitByKadane(int[] prices) {
        int currentSum = 0;
        int maxSum = 0;
        for (int i = 1; i < prices.length; i++) {
            currentSum = Math.max(0, currentSum += prices[i] - prices[i - 1]); //less than 0, reset to 0
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
}
