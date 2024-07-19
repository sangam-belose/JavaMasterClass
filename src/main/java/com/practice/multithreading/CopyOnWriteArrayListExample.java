package com.practice.multithreading;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.IntStream;

public class CopyOnWriteArrayListExample {
	public static void main(String[] args) throws InterruptedException {
		List<Integer> list = new CopyOnWriteArrayList<>();
		IntStream.range(0,10).boxed().forEach(list::add);

		Runnable runnable = () -> list.add(10);
		new Thread(runnable).start();

		List<Integer> result = list.stream()
			.filter(num -> num % 2 ==0)
			.toList();

		System.out.println(result);
	}
}
