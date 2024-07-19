package com.practice.leetcode.topinterview150.arrayorstring;

/**
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock
 */
public class BestTimeToBuyAndSellStock {
	public static void main(String[] args) {
		int [] nums = {7, 1,5,3,6,4};
		System.out.println(maxProfit(nums));
	}

	private static int maxProfit(int [] stockPrices) {
		int minPrice = Integer.MAX_VALUE;
		int maxProfit = 0;

		for (int price: stockPrices) {
			if(price < minPrice) {
				minPrice = price;
			} else if(price - minPrice > maxProfit) {
				maxProfit = price - minPrice;
			}
		}
		return maxProfit;
	}
}
