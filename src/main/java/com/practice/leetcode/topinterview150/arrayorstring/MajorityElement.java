package com.practice.leetcode.topinterview150.arrayorstring;

/**
 * https://leetcode.com/problems/majority-element/
 */
public class MajorityElement {
	public static void main(String[] args) {
		int [] nums1 = {1,1,1,1,2,3,4};
		int [] nums2 = {2,2,1,1,1,2,2};
		int [] nums3 = {3,2,3};
		System.out.println(findMajorityElement(nums1));
		System.out.println(findMajorityElement(nums2));
		System.out.println(findMajorityElement(nums3));
	}

	private static int findMajorityElement(int [] nums) {
		int candidate = -1;
		int count  = 0;
		for(int num : nums) {
			if(count == 0) {
				candidate = num;
				count = 1;
			} else if (num == candidate) {
				count++;
			} else {
				count--;
			}
		}
		return candidate;
	}
}
