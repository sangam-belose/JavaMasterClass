package com.practice.basic;

public class SwitchDayOfTheWeek {
	public static void main(String[] args) {
		System.out.println("day= "+ 0 +", dayOftheWeek = " + getDayOfTheWeek(0));
		System.out.println("day= "+ 1 +", dayOftheWeek = " + getDayOfTheWeek(1));
		System.out.println("day= "+ 2 +", dayOftheWeek = " + getDayOfTheWeek(2));
		System.out.println("day= "+ 3 +", dayOftheWeek = " + getDayOfTheWeek(3));
		System.out.println("day= "+ 4 +", dayOftheWeek = " + getDayOfTheWeek(4));
		System.out.println("day= "+ 5 +", dayOftheWeek = " + getDayOfTheWeek(5));
		System.out.println("day= "+ 6 +", dayOftheWeek = " + getDayOfTheWeek(6));
	}

	public static String getDayOfTheWeek(int day) {
		return switch (day) {
			case 0 -> "Monday";
			case 1 -> "Tuesday";
			case 2 -> "Wednesday";
			case 3 -> "Thursday";
			case 4 -> "Friday";
			case 5 -> "Saturday";
			case 6 -> "Sunday";
			default -> "Invalid day";
		};
	}

}
