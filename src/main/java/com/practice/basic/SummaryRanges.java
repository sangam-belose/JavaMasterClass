package com.practice.basic;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {

	public static void main(String[] args) {
		System.out.println(summaryRanges(new int[]{0,1,2,4,5,7}));
		System.out.println(summaryRanges(new int[]{0,2,3,4,6,8,9}));
		System.out.println(summaryRanges(new int[]{}));
		System.out.println(summaryRanges(new int[]{-1}));
	}

	public static List<String> summaryRanges(int[] nums) {
		List<String> rangeList = new ArrayList<>();
		if (nums == null || nums.length == 0) {
			return rangeList;
		}
		int start = nums[0];
		int end = nums[0];

		for (int i = 1; i< nums.length; i++) {
			if(nums[i] == end + 1){
				end  = nums[i];
			} else {
				if(start == end) {
					rangeList.add(String.valueOf(start));
				} else {
					rangeList.add(start + "->" + end);
				}
				start = nums[i];
				end = nums[i];
			}
		}

		if(start == end) {
			rangeList.add(String.valueOf(end));
		} else {
			rangeList.add(start + "-> "+end);
		}
		return rangeList;
	}
}
