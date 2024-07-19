package com.practice.basic;

public class LeapYearJava {
	public static void main(String[] args) {
		System.out.println(isLeapYear(2016));
		System.out.println(isLeapYear(2024));
		System.out.println(isLeapYear(2020));
		System.out.println(isLeapYear(2032));
		System.out.println(isLeapYear(2019));
		System.out.println(isLeapYear(1900));

		System.out.println(getDaysOfTheMonth(2, 2024));
		System.out.println(getDaysOfTheMonth(2, 1900));
		System.out.println(getDaysOfTheMonth(1, 2024));
		System.out.println(getDaysOfTheMonth(7, 2024));
		System.out.println(getDaysOfTheMonth(8, 2024));
	}

	public static boolean isLeapYear(int year) {
		if(year < 1 || year > 9999) {
			return false;
		}
		if(year % 4 == 0 ) {
			if(year % 100 != 0){
				return true;
			} else {
				if( year % 400 == 0)
					return true;
				else
					return false;
			}
		}
		return false;
	}

	public static int getDaysOfTheMonth(int month, int year) {
		if(year < 1 || year > 9999) {
			return -1;
		}
		return switch (month) {
			case 1, 3, 5, 7, 8, 10, 12 -> 31;
			case 2 -> isLeapYear(year) ? 29: 28;
			case 4, 6, 9, 11 -> 30;
			default -> -1;
		};
	}
}
