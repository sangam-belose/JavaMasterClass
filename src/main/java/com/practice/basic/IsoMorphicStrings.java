package com.practice.basic;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/isomorphic-strings/?envType=study-plan-v2&envId=top-interview-150
 */

public class IsoMorphicStrings {

	public static void main(String[] args) {
		System.out.println(isIsomorphic("badc", "baba"));
		System.out.println(isIsomorphic("egg", "add"));
	}

	public static boolean isIsomorphic(String s, String t) {

		Map<Character, Character> smap = new HashMap<>();

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			Character existingMapping = smap.get(c);
			if (existingMapping == null) {
				smap.put(c, t.charAt(i));
			} else if (existingMapping != t.charAt(i)) {
				return false;
			}
		}

	// second loop to t string
		Map<Character, Character> tmap = new HashMap<>();
		for (int i = 0; i < t.length(); i++) {
			char c = t.charAt(i);
			Character existingMapping = tmap.get(c);
			if (existingMapping == null) {
				tmap.put(c, s.charAt(i));
			} else if (existingMapping != s.charAt(i)) {
				return false;
			}
		}
		return true;
	}
}