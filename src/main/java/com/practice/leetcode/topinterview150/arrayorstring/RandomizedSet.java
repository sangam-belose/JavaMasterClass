package com.practice.leetcode.topinterview150.arrayorstring;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/**
 * https://leetcode.com/problems/insert-delete-getrandom-o1
 * all operations performed in O(1)
 */
public class RandomizedSet {
	private Map<Integer, Integer> elementToIndexMap;
	private List<Integer> elementList;
	private Random random;

	public RandomizedSet() {
		elementToIndexMap = new HashMap<>();
		elementList = new ArrayList<>();
		random = new Random();
	}

	public boolean insert(int val) {
		if(elementToIndexMap.containsKey(val)) {
			return false;
		}
		elementToIndexMap.put(val, elementList.size());
		elementList.add(val);
		return true;
	}

	public boolean remove(int val) {
		if(!elementToIndexMap.containsKey(val)) {
			return false;
		}
		int index  = elementToIndexMap.get(val);
		// get last element and set to that element index
		int lastElement = elementList.getLast();
		elementToIndexMap.put(lastElement, index);
		elementList.set(index, lastElement);
		elementList.removeLast();
		elementToIndexMap.remove(val);
		return true;
	}

	public int getRandom() {
		return elementList.get(random.nextInt(elementList.size()));
	}
	public static void main(String[] args) {
		RandomizedSet randomizedSet = new RandomizedSet();

		System.out.println(randomizedSet.insert(1)); // true
		System.out.println(randomizedSet.remove(2)); // false
		System.out.println(randomizedSet.insert(2)); // true
		System.out.println(randomizedSet.getRandom()); // 1 or 2
		System.out.println(randomizedSet.remove(1)); // true
		System.out.println(randomizedSet.insert(2)); // false
		System.out.println(randomizedSet.getRandom()); // 2
	}
}
