package com.practice.basic;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MinMaxChallenge {
	public static void main(String[] args) {
		int min = Integer.MAX_VALUE;
		int max = 0;
		try(Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter a numeric number: ");
			while (true) {
				int number = scanner.nextInt();
				if(number < min) {
					min = number;
				}
				if(number > max) {
					max = number;
				}
			}
		} catch (InputMismatchException n) {

		}
		System.out.println("Min = "+min + " , Max = "+max);
	}
}
