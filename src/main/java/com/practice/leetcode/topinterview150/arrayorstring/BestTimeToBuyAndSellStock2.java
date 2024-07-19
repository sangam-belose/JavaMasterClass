package com.practice.leetcode.topinterview150.arrayorstring;

/**
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/description/
 *
 *  time complexity = O(n)
 * 	space complexity = O(1)
 */
public class BestTimeToBuyAndSellStock2 {
	public static void main(String[] args) {
		int [] nums = {7, 1,5,3,6,4};
		System.out.println(maxProfit(nums));
	}

	private static int maxProfit(int [] stockPrices) {
		int maxProfit = 0;
		for(int i = 1; i<stockPrices.length; i++) {
			if(stockPrices[i] > stockPrices[i-1]) {
				maxProfit += stockPrices[i] - stockPrices[i-1];
			}
		}
		return maxProfit;
	}
}
