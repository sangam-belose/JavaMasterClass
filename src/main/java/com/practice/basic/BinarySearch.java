package com.practice.basic;

import java.util.Arrays;

public class BinarySearch {
	public static void main(String[] args) {
		int [] arr = {10, 20, 30,40, 50};
		System.out.println(binarySearch(arr, 20)); // 20 is at index 1

		// using inbuilt method from arrays
		System.out.println(Arrays.binarySearch(arr, 50));
		//using string array
		String [] stringArr = {"ada", "bad", "cat", "dog"};
		System.out.println(Arrays.binarySearch(stringArr, "bad"));
	}

	public static int binarySearch(int[] arr, int target) {
		int left = 0;
		int right = arr.length - 1;

		while (left <= right) {
			int mid = left + (right - left) / 2;
			if(arr[mid] == target)
				return mid;

			if(arr[mid] < target) {
				left = mid + 1;
			} else {
				right = right -1;
			}
		}
		return -1;
	}
}
