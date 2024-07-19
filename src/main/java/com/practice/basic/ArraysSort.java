package com.practice.basic;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class ArraysSort {
	public static void main(String[] args) {
		Integer[] arr = getRandomArray(6);
		System.out.println("Before sorting = " + Arrays.toString(arr));
		Arrays.sort(arr, Collections.reverseOrder());
		System.out.println("After sorting = " + Arrays.toString(arr));
	}
	public static Integer[] getRandomArray(int len) {
		Random random = new Random();
		Integer[] arr = new Integer[len];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(100);
		}
		return arr;
	}

}
