package com.practice.leetcode.topinterview150.arrayorstring;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/product-of-array-except-self/description
 * time complexity : O(n)
 * space complexity: O(1)
 */
public class ProductArrayExceptSelf {
	public static void main(String[] args) {
		int[] nums1 = {1,2,3,4};
		int[] nums2 = {-1,1,0,-3,3};
		System.out.println(Arrays.toString(findPrefixProductArray(nums1)));
		System.out.println(Arrays.toString(findPrefixProductArray(nums2)));
	}

	private static int[] findPrefixProductArray(int[] nums) {
		int n = nums.length;
		int [] answer = new int[n];
		// initialize it with 1 as default will be 0
		for(int i=0; i<n; i++) {
			answer[i] = 1;
		}

		// calculate prefix product
		int prefixProduct = 1;
		for(int i = 0; i<n; i++) {
			answer[i] = prefixProduct;
			prefixProduct *= nums[i];
		}

		int suffixProduct = 1;
		// calculate suffix product
		for (int i=n-1; i>=0; i--) {
			answer[i] *= suffixProduct;
			suffixProduct *= nums[i];
		}

		return answer;
	}
}
