package com.practice.basic;

public class MethodOverloading {
	public static void main(String[] args) {
		System.out.println(convertToCentimeters(10));
		System.out.println(convertToCentimeters(15));
		System.out.println(convertToCentimeters(25));

		System.out.println(convertToCentimeters(5, 7));
		System.out.println(convertToCentimeters(6, 10));
		System.out.println(convertToCentimeters(4, 11));
	}

	public static double convertToCentimeters(int heightInInches) {
		return heightInInches * 2.54d;
	}

	public static double convertToCentimeters(int heightInFeet, int heightInInches) {
		return heightInFeet * 12 + convertToCentimeters(heightInInches);
	}
}
