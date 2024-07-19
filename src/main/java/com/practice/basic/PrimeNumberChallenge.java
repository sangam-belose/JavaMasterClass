package com.practice.basic;

public class PrimeNumberChallenge {
	public static void main(String[] args) {
		System.out.println("0 is " + (isPrime(0)? "" : "Not ") + "a prime number");
		System.out.println("1 is " + (isPrime(1)? "" : "Not ") + "a prime number");
		System.out.println("2 is " + (isPrime(2)? "" : "Not ") + "a prime number");
		System.out.println("3 is " + (isPrime(3)? "" : "Not ") + "a prime number");
		System.out.println("5 is " + (isPrime(5)? "" : "Not ") + "a prime number");
		System.out.println("6 is " + (isPrime(6)? "" : "Not ") + "a prime number");
		System.out.println("8 is " + (isPrime(8)? "" : "Not ") + "a prime number");
		System.out.println("9 is " + (isPrime(9)? "" : "Not ") + "a prime number");
		System.out.println("11 is " + (isPrime(11)? "" : "Not ") + "a prime number");
		System.out.println("15 is " + (isPrime(15)? "" : "Not ") + "a prime number");

		int primeNumberCount = 0;
		for (int counter = 0; primeNumberCount < 3 && counter <= 1000; counter++) {
			if (isPrime(counter)) {
				System.out.println(counter);
				primeNumberCount++;
			}
		}
	}

	public static boolean isPrime(int wholeNumber) {
		if(wholeNumber <= 2) {
			return wholeNumber == 2;
		}

		for (int divisor = 2; divisor <= wholeNumber / 2; divisor++) {
			if(wholeNumber % divisor == 0)
				return false;
		}
		return true;
	}
}
