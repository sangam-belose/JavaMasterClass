package com.practice.basic;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveGivenElementFromArray {
	public static void main(String[] args) {
		int [] arr = {1,2,3,3,4,5};
		removeGivenElement(arr, 3);
		Arrays.stream(arr).forEach(System.out::print);
	}

	public static int removeGivenElement(int [] nums, int element) {
		Set<Integer> tracker = new HashSet<>();
		tracker.add(element);
		int pointer = 0;
		for (int i = 0; i<nums.length; i++) {
			if(!tracker.contains(nums[i])) {
				nums[pointer++] = nums[i];
			}
		}
		Arrays.fill(nums, pointer, nums.length, 0);
		return pointer;
	}
}
