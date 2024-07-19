package com.practice.basic;

public class MiniSimpleInterest {
	public static void main(String[] args) {
		for (double rate = 7.5d; rate <= 10.00d; rate += 0.25d) {
			if(rate > 8.50)
				break;
			System.out.println("100 rs with rateofInterest = " + rate + ", interest = " + calculateInterest(100.00d, rate));
		}
	}

	public static double calculateInterest(double amount, double interestRate) {
		return amount * (interestRate / 100);
	}
}
