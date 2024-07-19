package com.practice.leetcode.topinterview150.arrayorstring;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/h-index/description/
 */
public class HIndex {
	public static void main(String[] args) {
		int [] citations1 = {3,0,6,1,5};
		int [] citations2 = {1,3,1};
		System.out.println("hIndex = " +findHIndex(citations1));
		System.out.println("hIndex = " +findHIndex(citations2));

		System.out.println("hIndex using count sort = " +findHIndex(citations1));
		System.out.println("hIndex using count sort = " +findHIndex(citations2));
	}

	/**
	 * time complexity : O(n)
	 * Space complexity: O(1)
	 * @param citations
	 * @return
	 */

	private static int findHIndex(int[] citations) {
		int hIndex = 0;
		Arrays.sort(citations);
		for(int i =0; i<citations.length; i++) {
			hIndex = citations.length -i;
			if(citations[i] >= hIndex) {
				return hIndex;
			}
		}
		return hIndex;
	}

	private static int findHIndexUsingCountSort(int [] citations) {
		int n = citations.length;
		int [] counts = new int[n+1];

		for (int c: citations) {
			if(c >= n) {
				counts[n]++;
			} else {
				counts[c]++;
			}
		}

		int total  =0;
		for (int i = n; i>=0; i--) {
			total += counts[i];

			if(total >= i) {
				return i;
			}
		}
		return 0;
	}
}
