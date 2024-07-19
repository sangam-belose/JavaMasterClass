package com.practice.basic;

public class HelloWorld {
	public static void main(String[] args) {
		double val1 = 20.00d;
		double val2 = 80.00d;
		double result = (val1 + val2) * 100.00d;
		System.out.println("result = "+result);
		double reminder = result %  40.00d;
		System.out.println("reminder = "+reminder);
		boolean isValid = reminder == 0.00d ? true: false;
		System.out.println("isValid = "+isValid);
		if(!isValid) {
			System.out.println("got some reminder");
		}
	}
}
