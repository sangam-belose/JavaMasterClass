package com.practice.leetcode.array;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/plus-one/
 */
public class PlusOne {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(addOne(new int[] {1, 2, 3})));
		System.out.println(Arrays.toString(addOne(new int[] {4,3,2,1})));
		System.out.println(Arrays.toString(addOne(new int[] {9})));
		System.out.println(Arrays.toString(addOne(new int[] {0})));
	}

	private static int [] addOne(int[] digits) {
		int length = digits.length;

		for(int i = length-1; i>=0;i--) {
			digits[i] = digits[i] + 1;

			if(digits[i] < 10) {
				return digits;
			}

			digits[i] = digits[i] % 10;
		}

		int [] result = new int[length+1];
		result[0] = 1;
		return result;
	}
}
