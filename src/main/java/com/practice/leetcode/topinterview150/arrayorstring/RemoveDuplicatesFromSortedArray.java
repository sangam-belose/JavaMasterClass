package com.practice.leetcode.topinterview150.arrayorstring;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import static java.util.function.Function.identity;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

/**
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
 */
public class RemoveDuplicatesFromSortedArray {
	public static void main(String[] args) {
		int [] nums1 = {1,1,2};
		int [] nums2 = {0,0,1,1,1,2,2,3,3,4};
		System.out.println(Arrays.toString(remove(nums1)));
		System.out.println(Arrays.toString(remove(nums2)));

		System.out.println(removeInPlace(nums1));
		System.out.println(removeInPlace(nums2));


	}

	private static int removeInPlace(int [] nums) {
		Set<Integer> tracker = new HashSet<>();
		int pointer = 0;
		for (int i=0; i<nums.length; i++) {
			if(!tracker.contains(nums[i])) {
				nums[pointer++] = nums[i];
				tracker.add(nums[i]);
			}
		}
		return pointer;
	}

	// This isnt the inplace removal but returns a new array.
	private static int[] remove(int [] nums) {
		return Arrays.stream(nums)
			.boxed()
			.collect(groupingBy(identity(), counting()))
			.entrySet()
			.stream()
			.filter( entry -> entry.getValue() >= 1)
			.mapToInt(Map.Entry::getKey)
			.toArray();
	}
}
