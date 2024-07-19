package com.practice.multithreading;

import java.util.List;
import java.util.stream.IntStream;

/**
 * There are two options to use here to avoid concurrent ModificationException.
 *  1. make the unthreadsafe collection externally synchronized.
 *  	List<Integer> list = Collections.synchronizedList(new ArrayList<>());
 *  2. Use threadsafe collections. like CopyOnWriteArrayList
 */

public class ConcurrentModificationExample {

	public static void main(String[] args) {
		//List<Integer> list = Collections.synchronizedList(new ArrayList<>()); // this will work fine
		List<Integer> list = List.of(); // this will throw concurrentModification

		IntStream.range(0, 10).boxed().forEach(list::add);

		Runnable modifyTask = () -> {
			synchronized (list) {
				System.out.println("inside thread modifyTask");
				list.add(10);
			}
		};

		new Thread(modifyTask).start();

		List<Integer> evenNumbers = list.stream()
			.filter(num -> num%2 == 0)
			.toList();

		System.out.println(evenNumbers);
	}
}
