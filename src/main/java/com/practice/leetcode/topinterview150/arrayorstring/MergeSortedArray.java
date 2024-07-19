package com.practice.leetcode.topinterview150.arrayorstring;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/merge-sorted-array/description/?envType=study-plan-v2&envId=top-interview-150
 */
public class MergeSortedArray {
	public static void main(String[] args) {
		int[] nums1 = {1, 2, 3, 0, 0, 0};
		int[]nums2 =  {2,5,6};
		mergeArray(nums1, 3, nums2, 3);
		System.out.println(Arrays.toString(nums1));
	}

	private static void mergeArray(int [] nums1, int m, int [] nums2, int n) {
		int i = m-1;
		int j = n-1;

		int k = m+n-1;

		while(j >= 0) {
			if(i >=0 && nums1[i] > nums2[j]) {
				nums1[k--] = nums1[i--];
			} else {
				nums1[k--] = nums2[j--];
			}
		}
	}
}
