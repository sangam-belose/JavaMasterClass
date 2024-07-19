package com.practice.basic;

public class RotateArrayByXPositions {

	public static void main(String[] args) {
		int arr [] = {1,2,3,4,5,6,7};
		int k = 3;
		rotate(arr, k);
	}

	public static void rotate(int[] nums, int k) {
		int n = nums.length;
		System.out.println("arr length = "+n);
		k = k%n;
		System.out.println(" k to avoid going above arr len "+ k);

		reverse(nums, 0, n-k-1); // 0-2
		reverse(nums, n-k, n-1); // 3-4
		reverse(nums, 0, n-1);

	}

	public static void reverse(int [] nums, int low, int high) {
		while (low < high) {
			int temp = nums[low];
			nums[low] = nums[high];
			nums[high] = temp;
			low++;
			high--;
		}
	}
}
