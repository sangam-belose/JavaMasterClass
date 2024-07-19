package com.practice.designpattern.creational;

public class SingletonePatternExample {
	public static void main(String[] args) {
		Singletone singletoneObj = Singletone.getInstance();
		Singletone anotherObj = Singletone.getInstance();
		System.out.println("check if the two instances are same: " + (singletoneObj == anotherObj));
	}
}

final class Singletone {
	private static volatile Singletone instance;

	private Singletone() {
		if (instance != null) {
			throw new IllegalStateException("Instance already exist!");
		}
	}

	public static Singletone getInstance() {
		if (instance == null) {
			synchronized (Singletone.class) {
				if (instance == null) {
					instance = new Singletone();
				}
			}
		}
		return instance;
	}
}
