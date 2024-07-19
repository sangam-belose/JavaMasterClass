package com.practice.basic;

import java.util.Scanner;

public class SystemConsoleAndScannerRead {
	public static void main(String[] args) {
		//readInputUsingSystemConsole();
		readInputUsingScanner();
	}

	// this doesnt work
	public static String readInputUsingSystemConsole() {
		String name = System.console().readLine("Hi Please enter your name!");
		System.out.println(name);
		return "";
	}

	public static String readInputUsingScanner() {
		System.out.println("Hi Enter your name");
		Scanner scanner = new Scanner(System.in);
		String name =  scanner.nextLine();
		System.out.println("Welcome " + name);
		return name;
	}
}
