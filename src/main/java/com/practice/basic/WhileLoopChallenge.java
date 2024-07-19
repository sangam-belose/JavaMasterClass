package com.practice.basic;

public class WhileLoopChallenge {
	public static void main(String[] args) {
		int start = 4;
		int end = 20;
		int evenNumberCount = 0;
		int oddNumberCount = 0;
		while (start <= end && evenNumberCount < 5) {
			start++;
			if (isEvenNumber(start)) {
				evenNumberCount++;
				System.out.println(start);
			} else {
				oddNumberCount++;
			}
		}
		System.out.println("Even Number found = " + evenNumberCount + ", Odd Number found = " + oddNumberCount);
	}

	public static boolean isEvenNumber(int number) {
		return number % 2 == 0;
	}
}
