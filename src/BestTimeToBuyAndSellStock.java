/**
 * Created by Nikhil on 10/19/16.
 */

/**
 * Say you have an array for which the ith element is the price of a given stock on day i.
 * If you were only permitted to complete at most one transaction (ie, buy one and sell one
 * share of the stock), design an algorithm to find the maximum profit.
 */
public class BestTimeToBuyAndSellStock {
    private static final int MINIMUM_PROFIT = 0;

    public void calculateMaxProfit(int[] prices) {
        if (prices == null || prices.length == 0) return;

        int result = MINIMUM_PROFIT;
        int min = prices[0];

        for (int i = 1; i < prices.length; i++) {
            result = Math.max(result, prices[i] - min);
            min = Math.min(min, prices[i]);
        }

        System.out.println("Maximum profit is " + result);

    }
}
