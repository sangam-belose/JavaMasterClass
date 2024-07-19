package com.practice.basic;

public class DigitSumChallenge {
	public static void main(String[] args) {
		System.out.println(calculateSum(125));
		System.out.println(calculateSum(1000));
		System.out.println(calculateSum(297));
		System.out.println(calculateSum(432));
	}

	public static int calculateSum(int number) {
		if(number < 0) {
			return -1;
		}
		int sum = 0;

		while (number > 0 ) {
			int reminder = number % 10;
			number = number / 10;
			sum += reminder;
		}
		return sum;
	}

 }
