package com.practice.basic;

import java.util.Arrays;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateElementsArray {

	static {
		System.out.println("static block before main");
	}

	public static void main(String[] args) {
	int [] arr = {1, 2, 3, 4, 5, 2, 3, 6, 7, 7, 8};
		//System.out.println(arr.hashCode() % arr.length);
		System.out.println(findDuplicates(arr));
	}

	static {
		System.out.println("static block after main");
	}

	public static String findDuplicates(int [] array) {
		return Arrays.stream(array)
			.boxed()
			.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
			.entrySet()
			.stream().filter(entry-> entry.getValue() > 1)
			.map(Map.Entry::getKey)
			.sorted()
			.map(Objects::toString)
			.collect(Collectors.joining(","));
	}
}
