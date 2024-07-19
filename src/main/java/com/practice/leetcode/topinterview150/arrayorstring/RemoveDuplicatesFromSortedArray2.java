package com.practice.leetcode.topinterview150.arrayorstring;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/description
 */
public class RemoveDuplicatesFromSortedArray2 {
	public static void main(String[] args) {
		int [] nums1 = {1,1,1,2,2,3};
		int [] nums2 = {0,0,1,1,1,1,2,3,3};
		System.out.println(removeDuplicates(nums1));
		System.out.println(removeDuplicates(nums2));

		//check arrays.
		System.out.println(Arrays.toString(nums1));
		System.out.println(Arrays.toString(nums2));
	}

	private static int removeDuplicates(int [] nums) {
		Map<Integer, Integer> tracker = new HashMap<>();
		int pointer = 0;
		for (int i=0;i<nums.length; i++) {
			Integer currentCount = tracker.getOrDefault(nums[i], 0);
			if(currentCount < 2) {
				nums[pointer++] = nums[i];
				tracker.put(nums[i], tracker.getOrDefault(nums[i], 0) + 1);
			}
		}
		// you can fill 0 to rest places if u want.
		//Arrays.fill(nums, pointer, nums.length, 0);
		return pointer;
	}
}
