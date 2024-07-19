package com.practice.basic;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
	public static void main(String[] args) {
		System.out.println(isHappy(2));
		//System.out.println(isHappy(19));
		//System.out.println(isHappy(7));
		//System.out.println(isHappy(10));
	}

	public static boolean isHappy(int n) {
		Set<Integer> tracker = new HashSet<>();
		while (n != 1 && !tracker.contains(n)) {
			tracker.add(n);
			n = getSumOfSquares(n);
		}
		return n == 1;
	}

	private static int getSumOfSquares(int n) {
		return Integer.toString(n)
			.chars()
			.map(c -> c - '0')
			.map(d -> d * d)
			.sum();
	}
}
