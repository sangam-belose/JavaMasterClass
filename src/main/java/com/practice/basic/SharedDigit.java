package com.practice.basic;

public class SharedDigit {
	public static void main(String[] args) {
		System.out.println(hasSharedDigit(9, 9));
	}
	public static boolean hasSharedDigit(int number1, int number2) {
		if (number1 < 10 || number2 < 10 || number1 > 99 || number2 > 99) {
			return false;
		}

		int digit1 = number1 % 10;
		int digit2 = number1 / 10;
		int digit3 = number2 % 10;
		int digit4 = number2 / 10;
		if (digit1 == digit3 || digit1 == digit4) {
			return true;
		}
		if (digit2 == digit3 || digit2 == digit4) {
			return true;
		}
		return false;
	}
}
