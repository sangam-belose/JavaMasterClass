package com.practice.leetcode.topinterview150.arrayorstring;

/**
 * https://leetcode.com/problems/jump-game-ii/description
 *  time complexity = O(n)
 *  space complexity = O(1)
 */
public class JumpGame2 {
	public static void main(String[] args) {
		int[] nums1 = {2,3,1,1,4};
		int[] nums2 = {2,3,0,1,4};
		System.out.println(jump(nums1));
		System.out.println(jump(nums2));
	}

	private static int jump(int[] nums) {
		if(nums.length == 1) return 0;

		int farthest = 0;
		int currentEnd = 0;
		int jumps = 0;

		for (int i=0; i<nums.length -1; i++) {
			farthest = Math.max(farthest, i+nums[i]);
			System.out.println("farthest = "+farthest);

			if (i == currentEnd) {
				System.out.println("i" + i + ", currentEnd"+currentEnd);
				jumps++;
				currentEnd = farthest;

				if(currentEnd >= nums.length -1) break;
			}
		}
		return jumps;
	}
}
