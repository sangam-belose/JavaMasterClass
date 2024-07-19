package com.practice.leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/**
 * https://leetcode.com/problems/robot-collisions/description/
 */
public class RobotCollisions {
	public static void main(String[] args) {
		int[] positions1 = {3, 5, 2, 6};
		int[] healths1 = {10, 10, 15, 12};
		String directions1 = "RLRL";
		//System.out.println(survivedRobotsHealths(positions1, healths1, directions1));

		int[] positions2 = {5, 4, 3, 2, 1};
		int[] healths2 = {2, 17, 9, 15, 10};
		String directions2 = "RRRRR";

		//System.out.println(survivedRobotsHealths(positions2, healths2, directions2));

		int[] positions3 = {1, 2, 5, 6};
		int[] healths3 = {10, 10, 11, 11};
		String directions3 = "RLRL";

		//System.out.println(survivedRobotsHealths(positions3, healths3, directions3));

		int[] positions4 = {13, 3};
		int[] healths4 = {17, 2};
		String directions4 = "LR";

		System.out.println(survivedRobotsHealths(positions4, healths4, directions4));
	}

	public static List<Integer> survivedRobotsHealths(int[] positions, int[] healths, String directions) {

		if (directions == null || directions.length() != positions.length) {
			return List.of();
		}

		Stack<Integer> stack = new Stack<>();
		int n = positions.length;
		boolean[] survived = new boolean[n];
		Arrays.fill(survived, true);

		for (int i = 0; i < n; i++) {
			if (directions.charAt(i) == 'R') {
				stack.push(i);
			} else if (directions.charAt(i) == 'L') {
				while (!stack.isEmpty() && healths[i] > 0) {
					int rightIndex = stack.pop();
					if (healths[rightIndex] > healths[i]) {
						healths[rightIndex]--;
						survived[i] = false;
						break;
					} else if (healths[rightIndex] < healths[i]) {
						healths[i]--;
						survived[rightIndex] = false;
					} else {
						survived[i] = false;
						survived[rightIndex] = false;
						break;
					}
				}
			}
		}

		List<Integer> result = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			if (survived[i] && healths[i] > 0) {
				result.add(healths[i]);
			}
		}

		return result;
	}
}