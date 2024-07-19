package com.practice.leetcode.topinterview150.arrayorstring;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/candy/description
 * Use Two pass greedy algorithm to solve.
 */
public class Candy {
	public static void main(String[] args) {
		int[] ratings1 = {1,0,2};
		int[] ratings2 = {1,2,2};
		int[] ratings3 = {2,3,0};
		System.out.println(findTotalCandies(ratings1));
		System.out.println(findTotalCandies(ratings2));
		System.out.println(findTotalCandies(ratings3));
	}

	private static int findTotalCandies(int [] ratings) {
		if(ratings == null || ratings.length == 0) {
			return 0;
		}
		int [] candies = new int[ratings.length];
		Arrays.fill(candies, 0, candies.length, 1);
		//first pass
		for(int i = 1; i< ratings.length; i++){
			if(ratings[i] > ratings[i-1]) {
				candies[i] = candies[i-1]+1;
			}
		}

		//second pass
		for(int i=ratings.length-2; i>=0;i--) {
			if(ratings[i] > ratings[i+1]) {
				candies[i] = Math.max(candies[i], candies[i+1]+1);
			}
		}
		return Arrays.stream(candies)
			.sum();
	}
}
