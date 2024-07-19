package com.practice.basic;

import java.util.Arrays;
import java.util.Random;

public class ArraySortManual {
	public static void main(String[] args) {
		int[] arr = getRandomArray(3);
		System.out.println("original array = " + Arrays.toString(arr));
		System.out.println("Descending sorted arr =" + Arrays.toString(sortArray(arr)));

	}

	public static int[] sortArray(int[] arr) {

		int[] sortedArray = Arrays.copyOf(arr, arr.length);

		boolean flag = true;

		while (flag) {
			flag = false;

			for (int i = 0; i < sortedArray.length - 1; i++) {
				if (sortedArray[i] < sortedArray[i + 1]) {
					int temp = sortedArray[i];
					sortedArray[i] = sortedArray[i + 1];
					sortedArray[i + 1] = temp;
					flag = true;
				}
			}
		}

		return sortedArray;
	}

	public static int[] getRandomArray(int len) {
		Random random = new Random();
		int[] arr = new int[len];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(100);
		}
		return arr;
	}
}
