package com.practice.basic;

public class EnhancedSwitchCase {
	public static void main(String[] args) {
		System.out.println(getQuarter("JUN"));
		System.out.println(getQuarter("MAR"));
		System.out.println(getQuarter("NOV"));
		System.out.println(getQuarter("ABC"));
	}

	public static int getQuarter(String month) {

		return switch (month) {
			case "JAN", "FEB", "MAR" -> 1;
			case "APR", "MAY", "JUN" -> 2;
			case "JUL", "AUG", "SEPT" -> 3;
			case "OCT", "NOV", "DEC" -> 4;
			default -> {
				int output =  0;
				yield output;
			}
		};
	}
}
