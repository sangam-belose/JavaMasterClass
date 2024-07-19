package com.practice.basic;

// Java function named sumDigProd that takes two integers as parameters, sums them, and repeatedly multiplies the digits of the sum until the result is a single digit:
/*
For sumDigProd(123, 456):

The sum is 123 + 456 = 579.
Multiply digits of 579: 5 * 7 * 9 = 315.
Multiply digits of 315: 3 * 1 * 5 = 15.
Multiply digits of 15: 1 * 5 = 5.
Since 5 is a single digit, the function returns 5.
 */
public class SumDigitProd {
	public static void main(String[] args) {
		System.out.println(sumDigProd(123, 456));
	}

	private static int sumDigProd(int a, int b) {
		int sum = a + b;
		while (sum > 9) {
			sum = multiplyDigits(sum);
		}
		return sum;
	}

	private static int multiplyDigits(int num) {
		int product = 1;
		while (num != 0) {
			product *= num % 10;
			num = num /10;
		}
		return product;
	}
}
