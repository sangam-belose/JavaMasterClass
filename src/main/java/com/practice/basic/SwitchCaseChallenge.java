package com.practice.basic;

public class SwitchCaseChallenge {

	public static void main(String[] args) {

		displayNatoPhonics('A');
		displayNatoPhonics('B');
		displayNatoPhonics('C');
		displayNatoPhonics('D');
		displayNatoPhonics('E');
		displayNatoPhonics('X');

	}

	public static void displayNatoPhonics(char letter) {
		switch (letter) {
			case 'A':
				System.out.println("Able");
				break;
			case 'B':
				System.out.println("Baker");
				break;
			case 'C':
				System.out.println("Charlie");
				break;
			case 'D':
				System.out.println( "Dog");
				break;
			case 'E':
				System.out.println("Easy");
				break;
			default:
				System.out.println("Not Found");
		}
	}
}
