package com.practice.leetcode.topinterview150.arrayorstring;

import java.util.Map;

/**
 * https://leetcode.com/problems/roman-to-integer/description
 */
public class RomanToInteger {

	public static void main(String[] args) {
		System.out.println("III: " + romanToInt("III")); // Output: 3
		System.out.println("IV: " + romanToInt("IV")); // Output: 4
		System.out.println("IX: " + romanToInt("IX")); // Output: 9
		System.out.println("LVIII: " + romanToInt("LVIII")); // Output: 58
		System.out.println("MCMXCIV: " + romanToInt("MCMXCIV")); // Output: 1994
	}

	private static int romanToInt(String s) {
		Map<Character, Integer> characterIntegerMap = Map.of(
			'I', 1,
			'V', 5,
			'X', 10,
			'L', 50,
			'C', 100,
			'D', 500,
			'M', 1000
		);

		int total = 0;
		int previousValue = 0;
		for(int i=s.length()-1; i >=0; i--) {
			int currentValue = characterIntegerMap.get(s.charAt(i));
			if(currentValue < previousValue) {
				total -= currentValue;
			} else {
				total += currentValue;
			}
			previousValue = currentValue;
		}
		return total;
	}
}
