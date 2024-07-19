package com.practice.basic;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class Solution {

	public static void main(String[] args) throws IOException {
		try(DataInputStream in = new DataInputStream(System.in)) {
			int queries = in.readInt();
			System.out.println("queries = "+queries);
			while(queries > 0) {
				int condition = in.readInt();
				int number = in.readInt();

				checkNumbers(condition, number);

				queries--;
			}
		}
	}

	public static void checkNumbers(int condition, int number) {
		switch(condition) {
			case 1 -> System.out.println(isOdd(number) ? "EVEN" : "ODD");
			case 2 ->  System.out.println(isPrime(number)? "PRIME": "COMPOSITE");
			case 3 -> System.out.println(isPalindrome(number)? "PALINDROME": "NOT PALINDROME");
		};
	}

	public static boolean isOdd(int number) {
		return number % 2 == 0;
	}

	public static boolean isPrime(int number) {
		if(number <= 1) {
			return false;
		}
		return IntStream.rangeClosed(2, (int) Math.sqrt(number))
			.noneMatch( i -> number% i == 0);

	}

	public static boolean isPalindrome(int number) {
		if(number <0) {
			return false;
		}

		String numberStr = String.valueOf(number);

		Predicate<String> checkPalindrome = str -> str.equals(new StringBuilder(numberStr).reverse().toString());
		return checkPalindrome.test(numberStr);
	}
}
