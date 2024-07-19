package com.practice.basic;

public class GreatestCommonDivisor {
	public static void main(String[] args) {
		System.out.println(gcd(25, 15));
		System.out.println(gcd(12, 30));
		System.out.println(gcd(81, 153));
	}
	private static int gcd(int num1, int num2) {
		if(num2 == 0){
			return num1;
		}

		return gcd(num2, num1%num2);
	}
}
