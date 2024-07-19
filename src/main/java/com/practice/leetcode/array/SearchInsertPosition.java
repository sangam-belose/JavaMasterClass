package com.practice.leetcode.array;

/**
 * https://leetcode.com/problems/search-insert-position/
 * since its a sorted array we can perform binary search
 */
public class SearchInsertPosition {
	public static void main(String[] args) {
		int[] nums = {1, 3, 5, 6};
		System.out.println(searchInsert(nums, 5));
		System.out.println(searchInsert(nums, 2));
		System.out.println(searchInsert(nums, 7));
		System.out.println(searchInsert(nums, 0));
	}

	public static int searchInsert(int[] nums, int target) {

		int length = nums.length;
		// check first value
		if (target < nums[0]) {
			return 0;
		}
		// check last value
		if (target > nums[length - 1]) {
			return length;
		}

		int left = 0;
		int right = length - 1;

		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (nums[mid] == target) {
				return mid;
			} else if (nums[mid] < target) {
				left = mid + 1;
			} else {
				right = right - 1;
			}

		}
		return left;
	}
}
