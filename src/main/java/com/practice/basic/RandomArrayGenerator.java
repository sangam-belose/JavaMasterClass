package com.practice.basic;

import java.util.Arrays;
import java.util.Random;

public class RandomArrayGenerator {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(getRandomArray(10)));
		System.out.println(Arrays.toString(getRandomArray(5)));

		int [] arr1 = new int[5];
		Arrays.fill(arr1, 30);
		System.out.println(Arrays.toString(arr1));
	}

	public static int [] getRandomArray(int len) {
		Random random = new Random();
		int [] arr = new int[len];
		for (int i = 0; i< arr.length; i++) {
			arr[i] = random.nextInt(100);
		}
		return arr;
	}
}
