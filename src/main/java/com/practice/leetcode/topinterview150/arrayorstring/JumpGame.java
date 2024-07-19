package com.practice.leetcode.topinterview150.arrayorstring;

/**
 * https://leetcode.com/problems/jump-game/description/
 *
 * Time complexity = O(n)
 * Space complexity = O(1)
 */
public class JumpGame {
	public static void main(String[] args) {
		int[] nums1 = {2, 3, 1, 1, 4};
		int[] nums2 = {2, 1, 1, 0, 4};
		System.out.println(canJump(nums1));
		System.out.println(canJump(nums2));

		System.out.println(canJumpGreedyMethod(nums1));
		System.out.println(canJumpGreedyMethod(nums2));
	}

	/**
	 * here you move backword using greedy approch and move goal. preferred
	 * @param nums
	 * @return
	 */
	private static boolean canJumpGreedyMethod(int[] nums) {
		int goal = nums.length -1;

		for(int i = nums.length-1; i>=0; i--) {
			if(i + nums[i] >= goal) {
				goal = i;
			}
		}
		return goal == 0;
	}

	/**
	 * here you move forward and check if the end is reachable
	 * @param nums
	 * @return
	 */
	private static boolean canJump(int[] nums) {
		int maxReach = 0;
		int n = nums.length;

		for (int i= 0; i<n; i++) {
			if(i > maxReach) {
				return false;
			}
			maxReach = Math.max(maxReach, i+nums[i]);
		}
		return maxReach >= n-1;
	}

}
