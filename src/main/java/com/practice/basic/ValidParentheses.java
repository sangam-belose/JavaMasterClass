package com.practice.basic;

import java.util.Stack;

/**
 * https://leetcode.com/problems/valid-parentheses/description/?envType=study-plan-v2&envId=top-interview-150
 */
public class ValidParentheses {

	public static void main(String[] args) {
		System.out.println(isValid( "()"));
		System.out.println(isValid( "()[]{}"));
		System.out.println(isValid( "(]"));
	}

	public static boolean isValid(String s) {
		Stack<Character> characterStack = new Stack<>();
		for(char c: s.toCharArray()) {
			if(c == '(' || c == '{' || c == '['){
				characterStack.push(c);
			} else if(c == ')' || c == '}' || c == ']') {
				if (characterStack.isEmpty())
					return false;
				char top = characterStack.pop();
				if (c == ')' && top != '(') {
					return false;
				} else if (c == '}' && top != '{') {
					return false;
				} else if (c == ']' && top != '[') {
					return false;
				}
			}
		}
		return characterStack.isEmpty();
	}
}
