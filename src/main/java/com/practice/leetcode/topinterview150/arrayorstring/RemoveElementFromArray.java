package com.practice.leetcode.topinterview150.arrayorstring;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/remove-element/description/?envType=study-plan-v2&envId=top-interview-150
 */
public class RemoveElementFromArray {
	public static void main(String[] args) {
		int [] nums = {1,2, 4, 5,3,9,3,2,1};
		System.out.println(removeElement(nums, 3));
		System.out.println(Arrays.toString(nums));
	}

	private static int removeElement(int [] nums, int val) {
		int pointer = 0;
		for (int i=0; i<nums.length; i++) {
			if(nums[i] != val) {
				nums[pointer++] = nums[i];
			}
		}
		// fill 0 for rest empty places
		Arrays.fill(nums, pointer, nums.length, 0);
		return pointer;
	}
}
