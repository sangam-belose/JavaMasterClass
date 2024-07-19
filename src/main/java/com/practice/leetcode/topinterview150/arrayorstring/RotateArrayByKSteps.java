package com.practice.leetcode.topinterview150.arrayorstring;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/rotate-array/
 */
public class RotateArrayByKSteps {
	public static void main(String[] args) {
		int[] nums1 = {1, 2, 3, 4, 5, 6, 7};
		int[] nums2 = {4, 3, 2, 1, 7, 6, 5};
		int[] nums3 = {5, 6, 7, 1, 2, 3, 4};
		rotate(nums1, 3);
		System.out.println(Arrays.toString(nums1));
		rotate(nums2, 3);
		System.out.println(Arrays.toString(nums2));
		rotate(nums3, 4);
		System.out.println(Arrays.toString(nums3));
	}

	private static void rotate(int[] nums, int k) {
		int length = nums.length;
		// this is done as if you rotate length times, you again come to original position
		k = k % length;

		rotate(nums, 0, nums.length - k - 1);
		rotate(nums, length-k, length-1);
		rotate(nums, 0, length-1);
	}

	private static void rotate(int[] nums, int low, int high) {
		while (low < high) {
			int temp = nums[low];
			nums[low] = nums[high];
			nums[high] = temp;
			low++;
			high--;
		}
	}
}
