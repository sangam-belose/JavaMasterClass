package com.practice.basic;

public class SecondsAndMinutesChallenge {

	public static void main(String[] args) {
		System.out.println(getDurationString(3945));
		System.out.println(getDurationString(65, 45));
	}

	public static String getDurationString(int seconds) {
		if(seconds < 0) {
			return "Invalid seconds";
		}
		int minutes  = seconds / 60;
		int hours = minutes / 60;
		int  remainingMinutes = minutes % 60;
		int  remainingSeconds = seconds % 60;

		return hours + "h "+ remainingMinutes + "m " + remainingSeconds + "s";
	}

	public static String getDurationString(int minutes, int seconds) {
		if(minutes < 0 || seconds > 60) {
			return "Invalid minutes and seconds";
		}
		return getDurationString((minutes * 60) + seconds);
	}
}
