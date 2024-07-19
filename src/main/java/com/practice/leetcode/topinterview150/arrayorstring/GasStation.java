package com.practice.leetcode.topinterview150.arrayorstring;

/**
 * https://leetcode.com/problems/gas-station/
 * time complexity: O(n)
 * space complexity: O(1)
 */
public class GasStation {
	public static void main(String[] args) {
		int[] gas1 = {1,2,3,4,5}, cost1 = {3,4,5,1,2};
		System.out.println("starting point for trip: " + canCompleteCircuit(gas1, cost1));

		int[] gas2 = {2,3,4}, cost2 = {3,4,5,1,2};
		System.out.println("starting point for trip: " + canCompleteCircuit(gas2, cost2));
	}

	private static int canCompleteCircuit(int[] gas, int[] cost) {
		int n = gas.length;
		int current_surplus = 0;
		int total_surplus = 0;
		int starting_point = 0;

		for(int i= 0; i<n; i++) {
			current_surplus += gas[i] - cost[i];
			total_surplus += gas[i] - cost[i];
			if(current_surplus <0) {
				starting_point = i+1;
				current_surplus = 0;
			}
		}
		return (total_surplus < 0? -1: starting_point);
	}
}
