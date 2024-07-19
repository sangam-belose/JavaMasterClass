package com.practice.basic;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicatesInSortedArray {
	public static void main(String[] args) {
		int arr [] = {1,1,2,3};
		removeDuplicates(arr);
		Arrays.stream(arr)
			.forEach(System.out::println);
	}

	public static int removeDuplicates(int[] nums) {
		HashSet<Integer> tracker = new HashSet<>();

		int newIndex = 0;

		for(int i =0 ; i<nums.length; i++) {
			if(!tracker.contains(nums[i])) {
				nums[newIndex++] = nums[i];
				tracker.add(nums[i]);
			}
		}

		return newIndex;
	}
}

