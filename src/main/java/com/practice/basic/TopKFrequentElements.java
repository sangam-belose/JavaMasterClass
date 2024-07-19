package com.practice.basic;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * https://leetcode.com/problems/top-k-frequent-elements/description/
 */
public class TopKFrequentElements {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(topKFrequent(new int[]{1,1,1,2,2,3},2 )));
		System.out.println(Arrays.toString(topKFrequent(new int[]{1},1 )));
		System.out.println(Arrays.toString(topKFrequent(new int[]{1,1,1,2,2,0, 3,3},3 )));
	}

	public static int[] topKFrequent(int[] nums, int k) {
		Map<Integer, Long> frequencyMap = Arrays.stream(nums)
			.boxed()
			.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		PriorityQueue<Integer> minHeap = new PriorityQueue<>(Comparator.comparingLong(frequencyMap::get));

		for (int num: frequencyMap.keySet()) {
			minHeap.add(num);
			if(minHeap.size() > k) {
				minHeap.poll();
			}
		}
	int result [] = new int[k];
		for (int i = 0 ; i<k; i++) {
			result [i] = minHeap.poll();
		}
		return result;
	}
}
