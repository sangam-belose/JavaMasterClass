package com.practice.basic;

import java.util.Scanner;

public class ScannerInputChallenge {
	public static void main(String[] args) {
		int count = 1;
		int sum = 0;
		try (Scanner scanner = new Scanner(System.in)) {
			while (count <= 5) {
				System.out.println("Enter number #" + count);
				int number = scanner.nextInt();
				sum += number;
				count++;
			}
			System.out.println("Total sum: " + sum);
		} catch (IllegalArgumentException e) {
			System.err.println("error reading");
		}
	}
}
