package com.practice.basic;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingChars {
	public static void main(String[] args) {
		System.out.println(findLongestSubstring("abcabcbb"));
		System.out.println(findLongestSubstring("bbbbb"));
		System.out.println(findLongestSubstring("pwwkew"));
		System.out.println(findLongestSubstring("abcded"));
	}

	private static int findLongestSubstring(String inputString) {
		int maxLength = 0;
		Map<Character, Integer> map = new HashMap<>();

		for(int start = 0, end = 0; end < inputString.length(); end++) {
			if(map.containsKey(inputString.charAt(end))) {
				start = Math.max(map.get(inputString.charAt(end)), start);
			}
			maxLength = Math.max(maxLength, end-start +1);
			map.put(inputString.charAt(end), end+1);
		}
		return maxLength;
	}
}
