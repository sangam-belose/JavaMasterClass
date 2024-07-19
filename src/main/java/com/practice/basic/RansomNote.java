package com.practice.basic;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {

	public static void main(String[] args) {
		System.out.println(canConstruct("a", "b"));
		System.out.println(canConstruct("aa", "ab"));
		System.out.println(canConstruct("aa", "aab"));
	}

	public static boolean canConstruct(String ransomNote, String magazine) {
		Map<Character, Integer> magazineMap = new HashMap<>();

		for(char c: magazine.toCharArray()){
			magazineMap.put(c, magazineMap.getOrDefault(c, 0)+1);
		}

		for(char c: ransomNote.toCharArray()) {
			int count = magazineMap.getOrDefault(c, 0);
			if(count == 0){
				return false;
			}
			magazineMap.put(c, count-1);
		}

		return true;
	}
}
