package com.example.template;

public class BestTimetoBuyandSellStock {

    public int maxProfit(int[] prices) {

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < prices.length; i++) {

            if (prices[i] < min)
                min = prices[i];

            else if (prices[i] - min > max) {
                max = prices[i] - min;
            }
        }
        return max;
    }
}