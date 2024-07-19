package com.practice.leetcode.topinterview150.arrayorstring;

public class IntegerToRomanExample {

	public static void main(String[] args) {
		// Test cases
		System.out.println("3: " + intToRoman(3)); // Output: III
		System.out.println("4: " + intToRoman(4)); // Output: IV
		System.out.println("9: " + intToRoman(9)); // Output: IX
		System.out.println("58: " + intToRoman(58)); // Output: LVIII
		System.out.println("1994: " + intToRoman(1994)); // Output: MCMXCIV
	}
	public static String intToRoman(int num) {
		// Arrays to store the Roman numeral symbols and their corresponding values
		int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
		String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

		StringBuilder roman = new StringBuilder();

		// Loop through each value-symbol pair
		for (int i = 0; i < values.length; i++) {
			// Append the Roman symbol while subtracting its value from the number
			while (num >= values[i]) {
				roman.append(symbols[i]);
				num -= values[i];
			}
		}
		return roman.toString();
	}
}
